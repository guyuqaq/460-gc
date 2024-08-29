// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkipPlayerGameTimeRsp.proto

package emu.grasscutter.net.proto;

public final class SkipPlayerGameTimeRspOuterClass {
  private SkipPlayerGameTimeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkipPlayerGameTimeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkipPlayerGameTimeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 client_game_time = 5;</code>
     * @return The clientGameTime.
     */
    int getClientGameTime();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    int getGameTime();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 29633
   * FPAJMADLEGI
   * </pre>
   *
   * Protobuf type {@code SkipPlayerGameTimeRsp}
   */
  public static final class SkipPlayerGameTimeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkipPlayerGameTimeRsp)
      SkipPlayerGameTimeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkipPlayerGameTimeRsp.newBuilder() to construct.
    private SkipPlayerGameTimeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkipPlayerGameTimeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkipPlayerGameTimeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.internal_static_SkipPlayerGameTimeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.internal_static_SkipPlayerGameTimeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.class, emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.Builder.class);
    }

    public static final int CLIENT_GAME_TIME_FIELD_NUMBER = 5;
    private int clientGameTime_;
    /**
     * <code>uint32 client_game_time = 5;</code>
     * @return The clientGameTime.
     */
    @java.lang.Override
    public int getClientGameTime() {
      return clientGameTime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GAME_TIME_FIELD_NUMBER = 12;
    private int gameTime_;
    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (clientGameTime_ != 0) {
        output.writeUInt32(5, clientGameTime_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(12, gameTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (clientGameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, clientGameTime_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp other = (emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp) obj;

      if (getClientGameTime()
          != other.getClientGameTime()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGameTime()
          != other.getGameTime()) return false;
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
      hash = (37 * hash) + CLIENT_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientGameTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp prototype) {
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
     * CmdId: 29633
     * FPAJMADLEGI
     * </pre>
     *
     * Protobuf type {@code SkipPlayerGameTimeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkipPlayerGameTimeRsp)
        emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.internal_static_SkipPlayerGameTimeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.internal_static_SkipPlayerGameTimeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.class, emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        clientGameTime_ = 0;

        retcode_ = 0;

        gameTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.internal_static_SkipPlayerGameTimeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp build() {
        emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp buildPartial() {
        emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp result = new emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp(this);
        result.clientGameTime_ = clientGameTime_;
        result.retcode_ = retcode_;
        result.gameTime_ = gameTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp other) {
        if (other == emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.getDefaultInstance()) return this;
        if (other.getClientGameTime() != 0) {
          setClientGameTime(other.getClientGameTime());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
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
                retcode_ = input.readInt32();

                break;
              } // case 24
              case 40: {
                clientGameTime_ = input.readUInt32();

                break;
              } // case 40
              case 96: {
                gameTime_ = input.readUInt32();

                break;
              } // case 96
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

      private int clientGameTime_ ;
      /**
       * <code>uint32 client_game_time = 5;</code>
       * @return The clientGameTime.
       */
      @java.lang.Override
      public int getClientGameTime() {
        return clientGameTime_;
      }
      /**
       * <code>uint32 client_game_time = 5;</code>
       * @param value The clientGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientGameTime(int value) {
        
        clientGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_game_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientGameTime() {
        
        clientGameTime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int gameTime_ ;
      /**
       * <code>uint32 game_time = 12;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        
        gameTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SkipPlayerGameTimeRsp)
    }

    // @@protoc_insertion_point(class_scope:SkipPlayerGameTimeRsp)
    private static final emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp();
    }

    public static emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkipPlayerGameTimeRsp>
        PARSER = new com.google.protobuf.AbstractParser<SkipPlayerGameTimeRsp>() {
      @java.lang.Override
      public SkipPlayerGameTimeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SkipPlayerGameTimeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkipPlayerGameTimeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkipPlayerGameTimeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkipPlayerGameTimeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SkipPlayerGameTimeRsp.proto\"U\n\025SkipPla" +
      "yerGameTimeRsp\022\030\n\020client_game_time\030\005 \001(\r" +
      "\022\017\n\007retcode\030\003 \001(\005\022\021\n\tgame_time\030\014 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SkipPlayerGameTimeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkipPlayerGameTimeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkipPlayerGameTimeRsp_descriptor,
        new java.lang.String[] { "ClientGameTime", "Retcode", "GameTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
