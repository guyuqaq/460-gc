// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NormalUidOpNotify.proto

package emu.grasscutter.net.proto;

public final class NormalUidOpNotifyOuterClass {
  private NormalUidOpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NormalUidOpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NormalUidOpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @return A list containing the paramUidList.
     */
    java.util.List<java.lang.Integer> getParamUidListList();
    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @return The count of paramUidList.
     */
    int getParamUidListCount();
    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    int getParamUidList(int index);

    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);

    /**
     * <code>uint32 param_index = 7;</code>
     * @return The paramIndex.
     */
    int getParamIndex();

    /**
     * <code>uint32 duration = 8;</code>
     * @return The duration.
     */
    int getDuration();
  }
  /**
   * Protobuf type {@code NormalUidOpNotify}
   */
  public static final class NormalUidOpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NormalUidOpNotify)
      NormalUidOpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NormalUidOpNotify.newBuilder() to construct.
    private NormalUidOpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NormalUidOpNotify() {
      paramUidList_ = emptyIntList();
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NormalUidOpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.internal_static_NormalUidOpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.internal_static_NormalUidOpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.class, emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.Builder.class);
    }

    public static final int PARAM_UID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList paramUidList_;
    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @return A list containing the paramUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamUidListList() {
      return paramUidList_;
    }
    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @return The count of paramUidList.
     */
    public int getParamUidListCount() {
      return paramUidList_.size();
    }
    /**
     * <code>repeated uint32 param_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    public int getParamUidList(int index) {
      return paramUidList_.getInt(index);
    }
    private int paramUidListMemoizedSerializedSize = -1;

    public static final int PARAM_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 param_list = 6;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int PARAM_INDEX_FIELD_NUMBER = 7;
    private int paramIndex_;
    /**
     * <code>uint32 param_index = 7;</code>
     * @return The paramIndex.
     */
    @java.lang.Override
    public int getParamIndex() {
      return paramIndex_;
    }

    public static final int DURATION_FIELD_NUMBER = 8;
    private int duration_;
    /**
     * <code>uint32 duration = 8;</code>
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
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
      getSerializedSize();
      if (getParamUidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(paramUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramUidList_.size(); i++) {
        output.writeUInt32NoTag(paramUidList_.getInt(i));
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      if (paramIndex_ != 0) {
        output.writeUInt32(7, paramIndex_);
      }
      if (duration_ != 0) {
        output.writeUInt32(8, duration_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < paramUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramUidList_.getInt(i));
        }
        size += dataSize;
        if (!getParamUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramUidListMemoizedSerializedSize = dataSize;
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
      if (paramIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, paramIndex_);
      }
      if (duration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, duration_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify other = (emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify) obj;

      if (!getParamUidListList()
          .equals(other.getParamUidListList())) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getParamIndex()
          != other.getParamIndex()) return false;
      if (getDuration()
          != other.getDuration()) return false;
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
      if (getParamUidListCount() > 0) {
        hash = (37 * hash) + PARAM_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamUidListList().hashCode();
      }
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + PARAM_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getParamIndex();
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify prototype) {
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
     * Protobuf type {@code NormalUidOpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NormalUidOpNotify)
        emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.internal_static_NormalUidOpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.internal_static_NormalUidOpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.class, emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        paramIndex_ = 0;

        duration_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.internal_static_NormalUidOpNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify build() {
        emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify buildPartial() {
        emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify result = new emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramUidList_ = paramUidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paramList_ = paramList_;
        result.paramIndex_ = paramIndex_;
        result.duration_ = duration_;
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
        if (other instanceof emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify) {
          return mergeFrom((emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify other) {
        if (other == emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify.getDefaultInstance()) return this;
        if (!other.paramUidList_.isEmpty()) {
          if (paramUidList_.isEmpty()) {
            paramUidList_ = other.paramUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamUidListIsMutable();
            paramUidList_.addAll(other.paramUidList_);
          }
          onChanged();
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getParamIndex() != 0) {
          setParamIndex(other.getParamIndex());
        }
        if (other.getDuration() != 0) {
          setDuration(other.getDuration());
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
              case 16: {
                int v = input.readUInt32();
                ensureParamUidListIsMutable();
                paramUidList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParamUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  paramUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 48: {
                int v = input.readUInt32();
                ensureParamListIsMutable();
                paramList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParamListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  paramList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 56: {
                paramIndex_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                duration_ = input.readUInt32();

                break;
              } // case 64
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

      private com.google.protobuf.Internal.IntList paramUidList_ = emptyIntList();
      private void ensureParamUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramUidList_ = mutableCopy(paramUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @return A list containing the paramUidList.
       */
      public java.util.List<java.lang.Integer>
          getParamUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramUidList_) : paramUidList_;
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @return The count of paramUidList.
       */
      public int getParamUidListCount() {
        return paramUidList_.size();
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @param index The index of the element to return.
       * @return The paramUidList at the given index.
       */
      public int getParamUidList(int index) {
        return paramUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The paramUidList to set.
       * @return This builder for chaining.
       */
      public Builder setParamUidList(
          int index, int value) {
        ensureParamUidListIsMutable();
        paramUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @param value The paramUidList to add.
       * @return This builder for chaining.
       */
      public Builder addParamUidList(int value) {
        ensureParamUidListIsMutable();
        paramUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @param values The paramUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_uid_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamUidList() {
        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 param_list = 6;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 param_list = 6;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 param_list = 6;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_list = 6;</code>
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
       * <code>repeated uint32 param_list = 6;</code>
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
       * <code>repeated uint32 param_list = 6;</code>
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
       * <code>repeated uint32 param_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int paramIndex_ ;
      /**
       * <code>uint32 param_index = 7;</code>
       * @return The paramIndex.
       */
      @java.lang.Override
      public int getParamIndex() {
        return paramIndex_;
      }
      /**
       * <code>uint32 param_index = 7;</code>
       * @param value The paramIndex to set.
       * @return This builder for chaining.
       */
      public Builder setParamIndex(int value) {
        
        paramIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamIndex() {
        
        paramIndex_ = 0;
        onChanged();
        return this;
      }

      private int duration_ ;
      /**
       * <code>uint32 duration = 8;</code>
       * @return The duration.
       */
      @java.lang.Override
      public int getDuration() {
        return duration_;
      }
      /**
       * <code>uint32 duration = 8;</code>
       * @param value The duration to set.
       * @return This builder for chaining.
       */
      public Builder setDuration(int value) {
        
        duration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 duration = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDuration() {
        
        duration_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NormalUidOpNotify)
    }

    // @@protoc_insertion_point(class_scope:NormalUidOpNotify)
    private static final emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify();
    }

    public static emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NormalUidOpNotify>
        PARSER = new com.google.protobuf.AbstractParser<NormalUidOpNotify>() {
      @java.lang.Override
      public NormalUidOpNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<NormalUidOpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NormalUidOpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NormalUidOpNotifyOuterClass.NormalUidOpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NormalUidOpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NormalUidOpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027NormalUidOpNotify.proto\"f\n\021NormalUidOp" +
      "Notify\022\026\n\016param_uid_list\030\002 \003(\r\022\022\n\nparam_" +
      "list\030\006 \003(\r\022\023\n\013param_index\030\007 \001(\r\022\020\n\010durat" +
      "ion\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NormalUidOpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NormalUidOpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NormalUidOpNotify_descriptor,
        new java.lang.String[] { "ParamUidList", "ParamList", "ParamIndex", "Duration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
