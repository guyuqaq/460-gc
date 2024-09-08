// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPlayerMpModeAvailabilityRsp.proto

package emu.grasscutter.net.proto;

public final class GetPlayerMpModeAvailabilityRspOuterClass {
  private GetPlayerMpModeAvailabilityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPlayerMpModeAvailabilityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPlayerMpModeAvailabilityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 mp_ret = 1;</code>
     * @return The mpRet.
     */
    int getMpRet();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);
  }
  /**
   * Protobuf type {@code GetPlayerMpModeAvailabilityRsp}
   */
  public static final class GetPlayerMpModeAvailabilityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPlayerMpModeAvailabilityRsp)
      GetPlayerMpModeAvailabilityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPlayerMpModeAvailabilityRsp.newBuilder() to construct.
    private GetPlayerMpModeAvailabilityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPlayerMpModeAvailabilityRsp() {
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPlayerMpModeAvailabilityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.internal_static_GetPlayerMpModeAvailabilityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.internal_static_GetPlayerMpModeAvailabilityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.class, emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.Builder.class);
    }

    public static final int MP_RET_FIELD_NUMBER = 1;
    private int mpRet_;
    /**
     * <code>int32 mp_ret = 1;</code>
     * @return The mpRet.
     */
    @java.lang.Override
    public int getMpRet() {
      return mpRet_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 param_list = 8;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (mpRet_ != 0) {
        output.writeInt32(1, mpRet_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpRet_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, mpRet_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp other = (emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp) obj;

      if (getMpRet()
          != other.getMpRet()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
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
      hash = (37 * hash) + MP_RET_FIELD_NUMBER;
      hash = (53 * hash) + getMpRet();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp prototype) {
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
     * Protobuf type {@code GetPlayerMpModeAvailabilityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPlayerMpModeAvailabilityRsp)
        emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.internal_static_GetPlayerMpModeAvailabilityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.internal_static_GetPlayerMpModeAvailabilityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.class, emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        mpRet_ = 0;

        retcode_ = 0;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.internal_static_GetPlayerMpModeAvailabilityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp build() {
        emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp buildPartial() {
        emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp result = new emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp(this);
        int from_bitField0_ = bitField0_;
        result.mpRet_ = mpRet_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp other) {
        if (other == emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp.getDefaultInstance()) return this;
        if (other.getMpRet() != 0) {
          setMpRet(other.getMpRet());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
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
              case 8: {
                mpRet_ = input.readInt32();

                break;
              } // case 8
              case 56: {
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 64: {
                int v = input.readUInt32();
                ensureParamListIsMutable();
                paramList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParamListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  paramList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
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
      private int bitField0_;

      private int mpRet_ ;
      /**
       * <code>int32 mp_ret = 1;</code>
       * @return The mpRet.
       */
      @java.lang.Override
      public int getMpRet() {
        return mpRet_;
      }
      /**
       * <code>int32 mp_ret = 1;</code>
       * @param value The mpRet to set.
       * @return This builder for chaining.
       */
      public Builder setMpRet(int value) {
        
        mpRet_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 mp_ret = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpRet() {
        
        mpRet_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GetPlayerMpModeAvailabilityRsp)
    }

    // @@protoc_insertion_point(class_scope:GetPlayerMpModeAvailabilityRsp)
    private static final emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp();
    }

    public static emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlayerMpModeAvailabilityRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetPlayerMpModeAvailabilityRsp>() {
      @java.lang.Override
      public GetPlayerMpModeAvailabilityRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetPlayerMpModeAvailabilityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlayerMpModeAvailabilityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPlayerMpModeAvailabilityRspOuterClass.GetPlayerMpModeAvailabilityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerMpModeAvailabilityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerMpModeAvailabilityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$GetPlayerMpModeAvailabilityRsp.proto\"U" +
      "\n\036GetPlayerMpModeAvailabilityRsp\022\016\n\006mp_r" +
      "et\030\001 \001(\005\022\017\n\007retcode\030\007 \001(\005\022\022\n\nparam_list\030" +
      "\010 \003(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetPlayerMpModeAvailabilityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPlayerMpModeAvailabilityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerMpModeAvailabilityRsp_descriptor,
        new java.lang.String[] { "MpRet", "Retcode", "ParamList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
