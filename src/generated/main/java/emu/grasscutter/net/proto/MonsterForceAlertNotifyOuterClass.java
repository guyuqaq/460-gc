// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterForceAlertNotify.proto

package emu.grasscutter.net.proto;

public final class MonsterForceAlertNotifyOuterClass {
  private MonsterForceAlertNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterForceAlertNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterForceAlertNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 monster_entity_id = 14;</code>
     * @return The monsterEntityId.
     */
    int getMonsterEntityId();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 5287
   * Obf: EFNEGOBNLHF
   * </pre>
   *
   * Protobuf type {@code MonsterForceAlertNotify}
   */
  public static final class MonsterForceAlertNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterForceAlertNotify)
      MonsterForceAlertNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterForceAlertNotify.newBuilder() to construct.
    private MonsterForceAlertNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterForceAlertNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterForceAlertNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.internal_static_MonsterForceAlertNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.internal_static_MonsterForceAlertNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.class, emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.Builder.class);
    }

    public static final int MONSTER_ENTITY_ID_FIELD_NUMBER = 14;
    private int monsterEntityId_;
    /**
     * <code>uint32 monster_entity_id = 14;</code>
     * @return The monsterEntityId.
     */
    @java.lang.Override
    public int getMonsterEntityId() {
      return monsterEntityId_;
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
      if (monsterEntityId_ != 0) {
        output.writeUInt32(14, monsterEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, monsterEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify other = (emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify) obj;

      if (getMonsterEntityId()
          != other.getMonsterEntityId()) return false;
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
      hash = (37 * hash) + MONSTER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify prototype) {
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
     * <pre>
     * 4.7.0
     * CmdId: 5287
     * Obf: EFNEGOBNLHF
     * </pre>
     *
     * Protobuf type {@code MonsterForceAlertNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterForceAlertNotify)
        emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.internal_static_MonsterForceAlertNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.internal_static_MonsterForceAlertNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.class, emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        monsterEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.internal_static_MonsterForceAlertNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify build() {
        emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify buildPartial() {
        emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify result = new emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify(this);
        result.monsterEntityId_ = monsterEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify other) {
        if (other == emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify.getDefaultInstance()) return this;
        if (other.getMonsterEntityId() != 0) {
          setMonsterEntityId(other.getMonsterEntityId());
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
              case 112: {
                monsterEntityId_ = input.readUInt32();

                break;
              } // case 112
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

      private int monsterEntityId_ ;
      /**
       * <code>uint32 monster_entity_id = 14;</code>
       * @return The monsterEntityId.
       */
      @java.lang.Override
      public int getMonsterEntityId() {
        return monsterEntityId_;
      }
      /**
       * <code>uint32 monster_entity_id = 14;</code>
       * @param value The monsterEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterEntityId(int value) {
        
        monsterEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterEntityId() {
        
        monsterEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MonsterForceAlertNotify)
    }

    // @@protoc_insertion_point(class_scope:MonsterForceAlertNotify)
    private static final emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify();
    }

    public static emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterForceAlertNotify>
        PARSER = new com.google.protobuf.AbstractParser<MonsterForceAlertNotify>() {
      @java.lang.Override
      public MonsterForceAlertNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MonsterForceAlertNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterForceAlertNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterForceAlertNotifyOuterClass.MonsterForceAlertNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterForceAlertNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterForceAlertNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MonsterForceAlertNotify.proto\"4\n\027Monst" +
      "erForceAlertNotify\022\031\n\021monster_entity_id\030" +
      "\016 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MonsterForceAlertNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterForceAlertNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterForceAlertNotify_descriptor,
        new java.lang.String[] { "MonsterEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
