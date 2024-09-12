package emu.grasscutter.database;

import static emu.grasscutter.config.Configuration.DATABASE;

import com.mongodb.MongoCommandException;
import com.mongodb.client.*;
import dev.morphia.*;
import dev.morphia.annotations.Entity;
import dev.morphia.mapping.*;
import dev.morphia.query.experimental.filters.Filters;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.Grasscutter.ServerRunMode;
import emu.grasscutter.game.Account;

public final class DatabaseManager {
    private static Datastore gameDatastore;
    private static Datastore dispatchDatastore;

    public static Datastore getGameDatastore() {
        return gameDatastore;
    }

    public static Datastore getAccountDatastore() {
        if (Grasscutter.getRunMode() == ServerRunMode.HYBRID) return gameDatastore;
        else return dispatchDatastore;
    }

    public static MongoDatabase getGameDatabase() {
        return getGameDatastore().getDatabase();
    }

    public static void initialize() {
        // Initialize
        MongoClient gameMongoClient = MongoClients.create(DATABASE.game.connectionUri);

        // Set mapper options.
        MapperOptions mapperOptions =
                MapperOptions.builder().storeEmpties(true).storeNulls(false).build();

        // Create data store.
        gameDatastore =
                Morphia.createDatastore(gameMongoClient, DATABASE.game.collection, mapperOptions);

        // Map classes.
        var entities =
                Grasscutter.reflector.getTypesAnnotatedWith(Entity.class).stream()
                        .filter(
                                cls -> {
                                    Entity e = cls.getAnnotation(Entity.class);
                                    return e != null && !e.value().equals(Mapper.IGNORED_FIELDNAME);
                                })
                        .toArray(Class<?>[]::new);

        gameDatastore.getMapper().map(entities);

        // Ensure indexes for the game datastore
        ensureIndexes(gameDatastore);

        if (Grasscutter.getRunMode() != ServerRunMode.HYBRID) {
            MongoClient dispatchMongoClient = MongoClients.create(DATABASE.server.connectionUri);

            dispatchDatastore =
                    Morphia.createDatastore(dispatchMongoClient, DATABASE.server.collection, mapperOptions);
            dispatchDatastore.getMapper().map(new Class<?>[] {DatabaseCounter.class, Account.class, LoginBlackIPConfig.class});

            // Ensure indexes for dispatch datastore
            ensureIndexes(dispatchDatastore);
        }
    }

    /**
     * Ensures the database indexes exist and rebuilds them if there is an error with them
     *
     * @param datastore The datastore to ensure indexes on
     */
    private static void ensureIndexes(Datastore datastore) {
        try {
            datastore.ensureIndexes();
        } catch (MongoCommandException e) {
            Grasscutter.getLogger().info("Mongo index error: ", e);
            // Duplicate index error
            if (e.getCode() == 85) {
                // Drop all indexes and re add them
                MongoIterable<String> collections = datastore.getDatabase().listCollectionNames();
                for (String name : collections) {
                    datastore.getDatabase().getCollection(name).dropIndexes();
                }
                // Add back indexes
                datastore.ensureIndexes();
            }
        }
    }

	/**
	* Formats the specified MongoDB database by dropping all collections and their data.
	*
	* @param database The MongoDB database to format.
	*/
	public static void delDatabase(MongoDatabase database) {
		if (database == null) {
			Grasscutter.getLogger().warn("The provided MongoDatabase is null.");
			return;
		}
		
		try {
			MongoIterable<String> collections = database.listCollectionNames();
			for (String collectionName : collections) {
				Grasscutter.getLogger().info("正在删除集合 " + collectionName + "....");
				database.getCollection(collectionName).drop();
			}
			Grasscutter.getLogger().info("数据库已删除完毕!");
		} catch (Exception e) {
			Grasscutter.getLogger().error("操作失败: ", e);
		}
	}
	
	/**
	* Formats both the game and dispatch databases.
	*/
	public static void delAllDatabases() {
		if (gameDatastore != null) {
			delDatabase(gameDatastore.getDatabase());
		} else {
			Grasscutter.getLogger().warn("gameDatastore 未初始化。");
		}
	
		if (dispatchDatastore != null) {
			delDatabase(dispatchDatastore.getDatabase());
		} else {
			Grasscutter.getLogger().warn("dispatchDatastore 未初始化。");
		}
	}

    public static synchronized int getNextId(Class<?> c) {
        DatabaseCounter counter =
                getGameDatastore()
                        .find(DatabaseCounter.class)
                        .filter(Filters.eq("_id", c.getSimpleName()))
                        .first();
        if (counter == null) {
            counter = new DatabaseCounter(c.getSimpleName());
        }

        try {
            return counter.getNextId();
        } finally {
            DatabaseHelper.saveGameAsync(counter);
        }
    }

    public static synchronized int getNextId(Object o) {
        return getNextId(o.getClass());
    }
}
