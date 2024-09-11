// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerFightRecordPair.proto

package emu.grasscutter.net.proto;

public final class TowerFightRecordPairOuterClass {
  private TowerFightRecordPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerFightRecordPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerFightRecordPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 data = 3;</code>
     * @return The data.
     */
    int getData();

    /**
     * <code>uint32 avatar_id = 11;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * <pre>
   * Obf: OHPEOGBNHOD
   * </pre>
   *
   * Protobuf type {@code TowerFightRecordPair}
   */
  public static final class TowerFightRecordPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerFightRecordPair)
      TowerFightRecordPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerFightRecordPair.newBuilder() to construct.
    private TowerFightRecordPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerFightRecordPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerFightRecordPair();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.internal_static_TowerFightRecordPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.internal_static_TowerFightRecordPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.class, emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private int data_;
    /**
     * <code>uint32 data = 3;</code>
     * @return The data.
     */
    @java.lang.Override
    public int getData() {
      return data_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 11;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 11;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (data_ != 0) {
        output.writeUInt32(3, data_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(11, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (data_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, data_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair other = (emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair) obj;

      if (getData()
          != other.getData()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair prototype) {
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
     * Obf: OHPEOGBNHOD
     * </pre>
     *
     * Protobuf type {@code TowerFightRecordPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerFightRecordPair)
        emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.internal_static_TowerFightRecordPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.internal_static_TowerFightRecordPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.class, emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        data_ = 0;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.internal_static_TowerFightRecordPair_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair build() {
        emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair buildPartial() {
        emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair result = new emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair(this);
        result.data_ = data_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair) {
          return mergeFrom((emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair other) {
        if (other == emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair.getDefaultInstance()) return this;
        if (other.getData() != 0) {
          setData(other.getData());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 24: {
                data_ = input.readUInt32();

                break;
              } // case 24
              case 88: {
                avatarId_ = input.readUInt32();

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

      private int data_ ;
      /**
       * <code>uint32 data = 3;</code>
       * @return The data.
       */
      @java.lang.Override
      public int getData() {
        return data_;
      }
      /**
       * <code>uint32 data = 3;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(int value) {
        
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 data = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        
        data_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerFightRecordPair)
    }

    // @@protoc_insertion_point(class_scope:TowerFightRecordPair)
    private static final emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair();
    }

    public static emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerFightRecordPair>
        PARSER = new com.google.protobuf.AbstractParser<TowerFightRecordPair>() {
      @java.lang.Override
      public TowerFightRecordPair parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerFightRecordPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerFightRecordPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerFightRecordPairOuterClass.TowerFightRecordPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerFightRecordPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerFightRecordPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TowerFightRecordPair.proto\"7\n\024TowerFig" +
      "htRecordPair\022\014\n\004data\030\003 \001(\r\022\021\n\tavatar_id\030" +
      "\013 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerFightRecordPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerFightRecordPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerFightRecordPair_descriptor,
        new java.lang.String[] { "Data", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
