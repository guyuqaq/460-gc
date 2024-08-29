// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseItemReq.proto

package emu.grasscutter.net.proto;

public final class UseItemReqOuterClass {
  private UseItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 9;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>uint32 option_idx = 6;</code>
     * @return The optionIdx.
     */
    int getOptionIdx();

    /**
     * <code>uint64 target_guid = 5;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();

    /**
     * <code>bool is_enter_mp_dungeon_team = 10;</code>
     * @return The isEnterMpDungeonTeam.
     */
    boolean getIsEnterMpDungeonTeam();

    /**
     * <code>uint64 guid = 4;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * Protobuf type {@code UseItemReq}
   */
  public static final class UseItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseItemReq)
      UseItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseItemReq.newBuilder() to construct.
    private UseItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.class, emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 9;
    private int count_;
    /**
     * <code>uint32 count = 9;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int OPTION_IDX_FIELD_NUMBER = 6;
    private int optionIdx_;
    /**
     * <code>uint32 option_idx = 6;</code>
     * @return The optionIdx.
     */
    @java.lang.Override
    public int getOptionIdx() {
      return optionIdx_;
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 5;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 5;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
    }

    public static final int IS_ENTER_MP_DUNGEON_TEAM_FIELD_NUMBER = 10;
    private boolean isEnterMpDungeonTeam_;
    /**
     * <code>bool is_enter_mp_dungeon_team = 10;</code>
     * @return The isEnterMpDungeonTeam.
     */
    @java.lang.Override
    public boolean getIsEnterMpDungeonTeam() {
      return isEnterMpDungeonTeam_;
    }

    public static final int GUID_FIELD_NUMBER = 4;
    private long guid_;
    /**
     * <code>uint64 guid = 4;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
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
      if (guid_ != 0L) {
        output.writeUInt64(4, guid_);
      }
      if (targetGuid_ != 0L) {
        output.writeUInt64(5, targetGuid_);
      }
      if (optionIdx_ != 0) {
        output.writeUInt32(6, optionIdx_);
      }
      if (count_ != 0) {
        output.writeUInt32(9, count_);
      }
      if (isEnterMpDungeonTeam_ != false) {
        output.writeBool(10, isEnterMpDungeonTeam_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, guid_);
      }
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, targetGuid_);
      }
      if (optionIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, optionIdx_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, count_);
      }
      if (isEnterMpDungeonTeam_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isEnterMpDungeonTeam_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq other = (emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getOptionIdx()
          != other.getOptionIdx()) return false;
      if (getTargetGuid()
          != other.getTargetGuid()) return false;
      if (getIsEnterMpDungeonTeam()
          != other.getIsEnterMpDungeonTeam()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + OPTION_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getOptionIdx();
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (37 * hash) + IS_ENTER_MP_DUNGEON_TEAM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnterMpDungeonTeam());
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq prototype) {
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
     * Protobuf type {@code UseItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseItemReq)
        emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.class, emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        count_ = 0;

        optionIdx_ = 0;

        targetGuid_ = 0L;

        isEnterMpDungeonTeam_ = false;

        guid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UseItemReqOuterClass.internal_static_UseItemReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq build() {
        emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq buildPartial() {
        emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq result = new emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq(this);
        result.count_ = count_;
        result.optionIdx_ = optionIdx_;
        result.targetGuid_ = targetGuid_;
        result.isEnterMpDungeonTeam_ = isEnterMpDungeonTeam_;
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq) {
          return mergeFrom((emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq other) {
        if (other == emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getOptionIdx() != 0) {
          setOptionIdx(other.getOptionIdx());
        }
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
        }
        if (other.getIsEnterMpDungeonTeam() != false) {
          setIsEnterMpDungeonTeam(other.getIsEnterMpDungeonTeam());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
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
                guid_ = input.readUInt64();

                break;
              } // case 32
              case 40: {
                targetGuid_ = input.readUInt64();

                break;
              } // case 40
              case 48: {
                optionIdx_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                count_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                isEnterMpDungeonTeam_ = input.readBool();

                break;
              } // case 80
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

      private int count_ ;
      /**
       * <code>uint32 count = 9;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 9;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private int optionIdx_ ;
      /**
       * <code>uint32 option_idx = 6;</code>
       * @return The optionIdx.
       */
      @java.lang.Override
      public int getOptionIdx() {
        return optionIdx_;
      }
      /**
       * <code>uint32 option_idx = 6;</code>
       * @param value The optionIdx to set.
       * @return This builder for chaining.
       */
      public Builder setOptionIdx(int value) {
        
        optionIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_idx = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionIdx() {
        
        optionIdx_ = 0;
        onChanged();
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 5;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 5;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
        onChanged();
        return this;
      }

      private boolean isEnterMpDungeonTeam_ ;
      /**
       * <code>bool is_enter_mp_dungeon_team = 10;</code>
       * @return The isEnterMpDungeonTeam.
       */
      @java.lang.Override
      public boolean getIsEnterMpDungeonTeam() {
        return isEnterMpDungeonTeam_;
      }
      /**
       * <code>bool is_enter_mp_dungeon_team = 10;</code>
       * @param value The isEnterMpDungeonTeam to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnterMpDungeonTeam(boolean value) {
        
        isEnterMpDungeonTeam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_enter_mp_dungeon_team = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnterMpDungeonTeam() {
        
        isEnterMpDungeonTeam_ = false;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 4;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 4;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:UseItemReq)
    }

    // @@protoc_insertion_point(class_scope:UseItemReq)
    private static final emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq();
    }

    public static emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseItemReq>
        PARSER = new com.google.protobuf.AbstractParser<UseItemReq>() {
      @java.lang.Override
      public UseItemReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<UseItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UseItemReqOuterClass.UseItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UseItemReq.proto\"t\n\nUseItemReq\022\r\n\005coun" +
      "t\030\t \001(\r\022\022\n\noption_idx\030\006 \001(\r\022\023\n\013target_gu" +
      "id\030\005 \001(\004\022 \n\030is_enter_mp_dungeon_team\030\n \001" +
      "(\010\022\014\n\004guid\030\004 \001(\004B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseItemReq_descriptor,
        new java.lang.String[] { "Count", "OptionIdx", "TargetGuid", "IsEnterMpDungeonTeam", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
