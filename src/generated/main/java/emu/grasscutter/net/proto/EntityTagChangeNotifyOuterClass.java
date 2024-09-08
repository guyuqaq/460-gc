// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityTagChangeNotify.proto

package emu.grasscutter.net.proto;

public final class EntityTagChangeNotifyOuterClass {
  private EntityTagChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityTagChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityTagChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_add = 7;</code>
     * @return The isAdd.
     */
    boolean getIsAdd();

    /**
     * <code>string tag = 10;</code>
     * @return The tag.
     */
    java.lang.String getTag();
    /**
     * <code>string tag = 10;</code>
     * @return The bytes for tag.
     */
    com.google.protobuf.ByteString
        getTagBytes();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code EntityTagChangeNotify}
   */
  public static final class EntityTagChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityTagChangeNotify)
      EntityTagChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityTagChangeNotify.newBuilder() to construct.
    private EntityTagChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityTagChangeNotify() {
      tag_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityTagChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.internal_static_EntityTagChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.internal_static_EntityTagChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.class, emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.Builder.class);
    }

    public static final int IS_ADD_FIELD_NUMBER = 7;
    private boolean isAdd_;
    /**
     * <code>bool is_add = 7;</code>
     * @return The isAdd.
     */
    @java.lang.Override
    public boolean getIsAdd() {
      return isAdd_;
    }

    public static final int TAG_FIELD_NUMBER = 10;
    private volatile java.lang.Object tag_;
    /**
     * <code>string tag = 10;</code>
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      }
    }
    /**
     * <code>string tag = 10;</code>
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (isAdd_ != false) {
        output.writeBool(7, isAdd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, tag_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAdd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAdd_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, tag_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify other = (emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify) obj;

      if (getIsAdd()
          != other.getIsAdd()) return false;
      if (!getTag()
          .equals(other.getTag())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAdd());
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EntityTagChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityTagChangeNotify)
        emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.internal_static_EntityTagChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.internal_static_EntityTagChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.class, emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAdd_ = false;

        tag_ = "";

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.internal_static_EntityTagChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify build() {
        emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify buildPartial() {
        emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify result = new emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify(this);
        result.isAdd_ = isAdd_;
        result.tag_ = tag_;
        result.entityId_ = entityId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify other) {
        if (other == emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify.getDefaultInstance()) return this;
        if (other.getIsAdd() != false) {
          setIsAdd(other.getIsAdd());
        }
        if (!other.getTag().isEmpty()) {
          tag_ = other.tag_;
          onChanged();
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 56: {
                isAdd_ = input.readBool();

                break;
              } // case 56
              case 82: {
                tag_ = input.readStringRequireUtf8();

                break;
              } // case 82
              case 88: {
                entityId_ = input.readUInt32();

                break;
              } // case 88
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private boolean isAdd_ ;
      /**
       * <code>bool is_add = 7;</code>
       * @return The isAdd.
       */
      @java.lang.Override
      public boolean getIsAdd() {
        return isAdd_;
      }
      /**
       * <code>bool is_add = 7;</code>
       * @param value The isAdd to set.
       * @return This builder for chaining.
       */
      public Builder setIsAdd(boolean value) {
        
        isAdd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_add = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAdd() {
        
        isAdd_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object tag_ = "";
      /**
       * <code>string tag = 10;</code>
       * @return The tag.
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tag = 10;</code>
       * @return The bytes for tag.
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tag = 10;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 10;</code>
       * @param value The bytes for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tag_ = value;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EntityTagChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:EntityTagChangeNotify)
    private static final emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify();
    }

    public static emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityTagChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<EntityTagChangeNotify>() {
      @java.lang.Override
      public EntityTagChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<EntityTagChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityTagChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EntityTagChangeNotifyOuterClass.EntityTagChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityTagChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityTagChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EntityTagChangeNotify.proto\"G\n\025EntityT" +
      "agChangeNotify\022\016\n\006is_add\030\007 \001(\010\022\013\n\003tag\030\n " +
      "\001(\t\022\021\n\tentity_id\030\013 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityTagChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityTagChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityTagChangeNotify_descriptor,
        new java.lang.String[] { "IsAdd", "Tag", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
