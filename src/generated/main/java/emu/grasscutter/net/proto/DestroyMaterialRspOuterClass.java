// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DestroyMaterialRsp.proto

package emu.grasscutter.net.proto;

public final class DestroyMaterialRspOuterClass {
  private DestroyMaterialRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMaterialRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMaterialRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return A list containing the itemCountList.
     */
    java.util.List<java.lang.Integer> getItemCountListList();
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return The count of itemCountList.
     */
    int getItemCountListCount();
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */
    int getItemCountList(int index);

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @return A list containing the itemIdList.
     */
    java.util.List<java.lang.Integer> getItemIdListList();
    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @return The count of itemIdList.
     */
    int getItemIdListCount();
    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    int getItemIdList(int index);
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf type {@code DestroyMaterialRsp}
   */
  public static final class DestroyMaterialRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMaterialRsp)
      DestroyMaterialRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMaterialRsp.newBuilder() to construct.
    private DestroyMaterialRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DestroyMaterialRsp() {
      itemCountList_ = emptyIntList();
      itemIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DestroyMaterialRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);
    }

    public static final int ITEM_COUNT_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList itemCountList_;
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return A list containing the itemCountList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemCountListList() {
      return itemCountList_;
    }
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return The count of itemCountList.
     */
    public int getItemCountListCount() {
      return itemCountList_.size();
    }
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */
    public int getItemCountList(int index) {
      return itemCountList_.getInt(index);
    }
    private int itemCountListMemoizedSerializedSize = -1;

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

    public static final int ITEM_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList itemIdList_;
    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @return A list containing the itemIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemIdListList() {
      return itemIdList_;
    }
    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @return The count of itemIdList.
     */
    public int getItemIdListCount() {
      return itemIdList_.size();
    }
    /**
     * <code>repeated uint32 item_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    public int getItemIdList(int index) {
      return itemIdList_.getInt(index);
    }
    private int itemIdListMemoizedSerializedSize = -1;

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
      if (getItemCountListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(itemCountListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemCountList_.size(); i++) {
        output.writeUInt32NoTag(itemCountList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (getItemIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemIdList_.size(); i++) {
        output.writeUInt32NoTag(itemIdList_.getInt(i));
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
        for (int i = 0; i < itemCountList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemCountList_.getInt(i));
        }
        size += dataSize;
        if (!getItemCountListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemCountListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < itemIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemIdList_.getInt(i));
        }
        size += dataSize;
        if (!getItemIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp other = (emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) obj;

      if (!getItemCountListList()
          .equals(other.getItemCountListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getItemIdListList()
          .equals(other.getItemIdListList())) return false;
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
      if (getItemCountListCount() > 0) {
        hash = (37 * hash) + ITEM_COUNT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemCountListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getItemIdListCount() > 0) {
        hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp prototype) {
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
     * </pre>
     *
     * Protobuf type {@code DestroyMaterialRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMaterialRsp)
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp build() {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp buildPartial() {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp result = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemCountList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemCountList_ = itemCountList_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000002) != 0)) {
          itemIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.itemIdList_ = itemIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp other) {
        if (other == emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDefaultInstance()) return this;
        if (!other.itemCountList_.isEmpty()) {
          if (itemCountList_.isEmpty()) {
            itemCountList_ = other.itemCountList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemCountListIsMutable();
            itemCountList_.addAll(other.itemCountList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.itemIdList_.isEmpty()) {
          if (itemIdList_.isEmpty()) {
            itemIdList_ = other.itemIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemIdListIsMutable();
            itemIdList_.addAll(other.itemIdList_);
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
              case 16: {
                int v = input.readUInt32();
                ensureItemCountListIsMutable();
                itemCountList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureItemCountListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  itemCountList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 96: {
                retcode_ = input.readInt32();

                break;
              } // case 96
              case 120: {
                int v = input.readUInt32();
                ensureItemIdListIsMutable();
                itemIdList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureItemIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  itemIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private com.google.protobuf.Internal.IntList itemCountList_ = emptyIntList();
      private void ensureItemCountListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemCountList_ = mutableCopy(itemCountList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @return A list containing the itemCountList.
       */
      public java.util.List<java.lang.Integer>
          getItemCountListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemCountList_) : itemCountList_;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @return The count of itemCountList.
       */
      public int getItemCountListCount() {
        return itemCountList_.size();
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param index The index of the element to return.
       * @return The itemCountList at the given index.
       */
      public int getItemCountList(int index) {
        return itemCountList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The itemCountList to set.
       * @return This builder for chaining.
       */
      public Builder setItemCountList(
          int index, int value) {
        ensureItemCountListIsMutable();
        itemCountList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param value The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addItemCountList(int value) {
        ensureItemCountListIsMutable();
        itemCountList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param values The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemCountList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemCountListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemCountList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemCountList() {
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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

      private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();
      private void ensureItemIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          itemIdList_ = mutableCopy(itemIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @return A list containing the itemIdList.
       */
      public java.util.List<java.lang.Integer>
          getItemIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(itemIdList_) : itemIdList_;
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @return The count of itemIdList.
       */
      public int getItemIdListCount() {
        return itemIdList_.size();
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The itemIdList at the given index.
       */
      public int getItemIdList(int index) {
        return itemIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The itemIdList to set.
       * @return This builder for chaining.
       */
      public Builder setItemIdList(
          int index, int value) {
        ensureItemIdListIsMutable();
        itemIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @param value The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addItemIdList(int value) {
        ensureItemIdListIsMutable();
        itemIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @param values The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemIdList() {
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:DestroyMaterialRsp)
    }

    // @@protoc_insertion_point(class_scope:DestroyMaterialRsp)
    private static final emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp();
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMaterialRsp>
        PARSER = new com.google.protobuf.AbstractParser<DestroyMaterialRsp>() {
      @java.lang.Override
      public DestroyMaterialRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<DestroyMaterialRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DestroyMaterialRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DestroyMaterialRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMaterialRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DestroyMaterialRsp.proto\"T\n\022DestroyMat" +
      "erialRsp\022\027\n\017item_count_list\030\002 \003(\r\022\017\n\007ret" +
      "code\030\014 \001(\005\022\024\n\014item_id_list\030\017 \003(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DestroyMaterialRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMaterialRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMaterialRsp_descriptor,
        new java.lang.String[] { "ItemCountList", "Retcode", "ItemIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
