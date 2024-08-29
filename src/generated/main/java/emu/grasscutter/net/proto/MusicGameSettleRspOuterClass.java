// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameSettleRsp.proto

package emu.grasscutter.net.proto;

public final class MusicGameSettleRspOuterClass {
  private MusicGameSettleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicGameSettleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicGameSettleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugc_guid = 9;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 music_basic_id = 7;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();

    /**
     * <code>bool is_unlock_next_level = 3;</code>
     * @return The isUnlockNextLevel.
     */
    boolean getIsUnlockNextLevel();

    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 7327
   * Obf: OEBOBHPHPGI
   * </pre>
   *
   * Protobuf type {@code MusicGameSettleRsp}
   */
  public static final class MusicGameSettleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicGameSettleRsp)
      MusicGameSettleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicGameSettleRsp.newBuilder() to construct.
    private MusicGameSettleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicGameSettleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicGameSettleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.class, emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.Builder.class);
    }

    public static final int UGC_GUID_FIELD_NUMBER = 9;
    private long ugcGuid_;
    /**
     * <code>uint64 ugc_guid = 9;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 7;
    private int musicBasicId_;
    /**
     * <code>uint32 music_basic_id = 7;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
    }

    public static final int IS_UNLOCK_NEXT_LEVEL_FIELD_NUMBER = 3;
    private boolean isUnlockNextLevel_;
    /**
     * <code>bool is_unlock_next_level = 3;</code>
     * @return The isUnlockNextLevel.
     */
    @java.lang.Override
    public boolean getIsUnlockNextLevel() {
      return isUnlockNextLevel_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 6;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (isUnlockNextLevel_ != false) {
        output.writeBool(3, isUnlockNextLevel_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(6, isNewRecord_);
      }
      if (musicBasicId_ != 0) {
        output.writeUInt32(7, musicBasicId_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(9, ugcGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isUnlockNextLevel_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isUnlockNextLevel_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isNewRecord_);
      }
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, musicBasicId_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, ugcGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp other = (emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
      if (getIsUnlockNextLevel()
          != other.getIsUnlockNextLevel()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (37 * hash) + IS_UNLOCK_NEXT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlockNextLevel());
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp prototype) {
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
     * CmdId: 7327
     * Obf: OEBOBHPHPGI
     * </pre>
     *
     * Protobuf type {@code MusicGameSettleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicGameSettleRsp)
        emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.class, emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ugcGuid_ = 0L;

        retcode_ = 0;

        musicBasicId_ = 0;

        isUnlockNextLevel_ = false;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp build() {
        emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp buildPartial() {
        emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp result = new emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp(this);
        result.ugcGuid_ = ugcGuid_;
        result.retcode_ = retcode_;
        result.musicBasicId_ = musicBasicId_;
        result.isUnlockNextLevel_ = isUnlockNextLevel_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp) {
          return mergeFrom((emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp other) {
        if (other == emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
        }
        if (other.getIsUnlockNextLevel() != false) {
          setIsUnlockNextLevel(other.getIsUnlockNextLevel());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
                isUnlockNextLevel_ = input.readBool();

                break;
              } // case 24
              case 48: {
                isNewRecord_ = input.readBool();

                break;
              } // case 48
              case 56: {
                musicBasicId_ = input.readUInt32();

                break;
              } // case 56
              case 72: {
                ugcGuid_ = input.readUInt64();

                break;
              } // case 72
              case 96: {
                retcode_ = input.readInt32();

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

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 9;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 9;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int musicBasicId_ ;
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {
        
        musicBasicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        
        musicBasicId_ = 0;
        onChanged();
        return this;
      }

      private boolean isUnlockNextLevel_ ;
      /**
       * <code>bool is_unlock_next_level = 3;</code>
       * @return The isUnlockNextLevel.
       */
      @java.lang.Override
      public boolean getIsUnlockNextLevel() {
        return isUnlockNextLevel_;
      }
      /**
       * <code>bool is_unlock_next_level = 3;</code>
       * @param value The isUnlockNextLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlockNextLevel(boolean value) {
        
        isUnlockNextLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock_next_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlockNextLevel() {
        
        isUnlockNextLevel_ = false;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 6;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:MusicGameSettleRsp)
    }

    // @@protoc_insertion_point(class_scope:MusicGameSettleRsp)
    private static final emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp();
    }

    public static emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicGameSettleRsp>
        PARSER = new com.google.protobuf.AbstractParser<MusicGameSettleRsp>() {
      @java.lang.Override
      public MusicGameSettleRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<MusicGameSettleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicGameSettleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MusicGameSettleRspOuterClass.MusicGameSettleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicGameSettleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicGameSettleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MusicGameSettleRsp.proto\"\204\001\n\022MusicGame" +
      "SettleRsp\022\020\n\010ugc_guid\030\t \001(\004\022\017\n\007retcode\030\014" +
      " \001(\005\022\026\n\016music_basic_id\030\007 \001(\r\022\034\n\024is_unloc" +
      "k_next_level\030\003 \001(\010\022\025\n\ris_new_record\030\006 \001(" +
      "\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MusicGameSettleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicGameSettleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicGameSettleRsp_descriptor,
        new java.lang.String[] { "UgcGuid", "Retcode", "MusicBasicId", "IsUnlockNextLevel", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
