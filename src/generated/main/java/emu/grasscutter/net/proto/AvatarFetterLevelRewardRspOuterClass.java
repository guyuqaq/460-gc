// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFetterLevelRewardRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarFetterLevelRewardRspOuterClass {
  private AvatarFetterLevelRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFetterLevelRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFetterLevelRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fetter_level = 8;</code>
     * @return The fetterLevel.
     */
    int getFetterLevel();

    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 9717
   * </pre>
   *
   * Protobuf type {@code AvatarFetterLevelRewardRsp}
   */
  public static final class AvatarFetterLevelRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFetterLevelRewardRsp)
      AvatarFetterLevelRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFetterLevelRewardRsp.newBuilder() to construct.
    private AvatarFetterLevelRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFetterLevelRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFetterLevelRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.class, emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.Builder.class);
    }

    public static final int FETTER_LEVEL_FIELD_NUMBER = 8;
    private int fetterLevel_;
    /**
     * <code>uint32 fetter_level = 8;</code>
     * @return The fetterLevel.
     */
    @java.lang.Override
    public int getFetterLevel() {
      return fetterLevel_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 14;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 6;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
        output.writeInt32(4, retcode_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(6, avatarGuid_);
      }
      if (fetterLevel_ != 0) {
        output.writeUInt32(8, fetterLevel_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(14, rewardId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, avatarGuid_);
      }
      if (fetterLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, fetterLevel_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, rewardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp other = (emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp) obj;

      if (getFetterLevel()
          != other.getFetterLevel()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + FETTER_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getFetterLevel();
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp prototype) {
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
     * CmdId: 9717
     * </pre>
     *
     * Protobuf type {@code AvatarFetterLevelRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFetterLevelRewardRsp)
        emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.class, emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fetterLevel_ = 0;

        rewardId_ = 0;

        retcode_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.internal_static_AvatarFetterLevelRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp build() {
        emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp result = new emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp(this);
        result.fetterLevel_ = fetterLevel_;
        result.rewardId_ = rewardId_;
        result.retcode_ = retcode_;
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp.getDefaultInstance()) return this;
        if (other.getFetterLevel() != 0) {
          setFetterLevel(other.getFetterLevel());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
              case 32: {
                retcode_ = input.readInt32();

                break;
              } // case 32
              case 48: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 48
              case 64: {
                fetterLevel_ = input.readUInt32();

                break;
              } // case 64
              case 112: {
                rewardId_ = input.readUInt32();

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

      private int fetterLevel_ ;
      /**
       * <code>uint32 fetter_level = 8;</code>
       * @return The fetterLevel.
       */
      @java.lang.Override
      public int getFetterLevel() {
        return fetterLevel_;
      }
      /**
       * <code>uint32 fetter_level = 8;</code>
       * @param value The fetterLevel to set.
       * @return This builder for chaining.
       */
      public Builder setFetterLevel(int value) {
        
        fetterLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fetter_level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFetterLevel() {
        
        fetterLevel_ = 0;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarFetterLevelRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarFetterLevelRewardRsp)
    private static final emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp();
    }

    public static emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFetterLevelRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFetterLevelRewardRsp>() {
      @java.lang.Override
      public AvatarFetterLevelRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarFetterLevelRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFetterLevelRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFetterLevelRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AvatarFetterLevelRewardRsp.proto\"k\n\032Av" +
      "atarFetterLevelRewardRsp\022\024\n\014fetter_level" +
      "\030\010 \001(\r\022\021\n\treward_id\030\016 \001(\r\022\017\n\007retcode\030\004 \001" +
      "(\005\022\023\n\013avatar_guid\030\006 \001(\004B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarFetterLevelRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFetterLevelRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFetterLevelRewardRsp_descriptor,
        new java.lang.String[] { "FetterLevel", "RewardId", "Retcode", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
