// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetMailItemRsp.proto

package emu.grasscutter.net.proto;

public final class GetMailItemRspOuterClass {
  private GetMailItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetMailItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetMailItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @return A list containing the mailIdList.
     */
    java.util.List<java.lang.Integer> getMailIdListList();
    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @return The count of mailIdList.
     */
    int getMailIdListCount();
    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    int getMailIdList(int index);

    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> 
        getItemListList();
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getItemList(int index);
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code GetMailItemRsp}
   */
  public static final class GetMailItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetMailItemRsp)
      GetMailItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetMailItemRsp.newBuilder() to construct.
    private GetMailItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetMailItemRsp() {
      mailIdList_ = emptyIntList();
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetMailItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetMailItemRspOuterClass.internal_static_GetMailItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.class, emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.Builder.class);
    }

    public static final int MAIL_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList mailIdList_;
    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @return A list containing the mailIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMailIdListList() {
      return mailIdList_;
    }
    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @return The count of mailIdList.
     */
    public int getMailIdListCount() {
      return mailIdList_.size();
    }
    /**
     * <code>repeated uint32 mail_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    public int getMailIdList(int index) {
      return mailIdList_.getInt(index);
    }
    private int mailIdListMemoizedSerializedSize = -1;

    public static final int ITEM_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> itemList_;
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .EquipParam item_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (getMailIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(mailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < mailIdList_.size(); i++) {
        output.writeUInt32NoTag(mailIdList_.getInt(i));
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(9, itemList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
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
        for (int i = 0; i < mailIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mailIdList_.getInt(i));
        }
        size += dataSize;
        if (!getMailIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mailIdListMemoizedSerializedSize = dataSize;
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, itemList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp other = (emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp) obj;

      if (!getMailIdListList()
          .equals(other.getMailIdListList())) return false;
      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getMailIdListCount() > 0) {
        hash = (37 * hash) + MAIL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailIdListList().hashCode();
      }
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp prototype) {
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
     * Protobuf type {@code GetMailItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetMailItemRsp)
        emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetMailItemRspOuterClass.internal_static_GetMailItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.class, emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
        } else {
          itemList_ = null;
          itemListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp build() {
        emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp buildPartial() {
        emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp result = new emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mailIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mailIdList_ = mailIdList_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp other) {
        if (other == emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp.getDefaultInstance()) return this;
        if (!other.mailIdList_.isEmpty()) {
          if (mailIdList_.isEmpty()) {
            mailIdList_ = other.mailIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMailIdListIsMutable();
            mailIdList_.addAll(other.mailIdList_);
          }
          onChanged();
        }
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                int v = input.readUInt32();
                ensureMailIdListIsMutable();
                mailIdList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureMailIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  mailIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 74: {
                emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.parser(),
                        extensionRegistry);
                if (itemListBuilder_ == null) {
                  ensureItemListIsMutable();
                  itemList_.add(m);
                } else {
                  itemListBuilder_.addMessage(m);
                }
                break;
              } // case 74
              case 112: {
                retcode_ = input.readInt32();

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
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mailIdList_ = emptyIntList();
      private void ensureMailIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mailIdList_ = mutableCopy(mailIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @return A list containing the mailIdList.
       */
      public java.util.List<java.lang.Integer>
          getMailIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mailIdList_) : mailIdList_;
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @return The count of mailIdList.
       */
      public int getMailIdListCount() {
        return mailIdList_.size();
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The mailIdList at the given index.
       */
      public int getMailIdList(int index) {
        return mailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The mailIdList to set.
       * @return This builder for chaining.
       */
      public Builder setMailIdList(
          int index, int value) {
        ensureMailIdListIsMutable();
        mailIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @param value The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addMailIdList(int value) {
        ensureMailIdListIsMutable();
        mailIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @param values The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMailIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMailIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mailIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMailIdList() {
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam>(itemList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder addItemList(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance());
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance());
      }
      /**
       * <code>repeated .EquipParam item_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetMailItemRsp)
    }

    // @@protoc_insertion_point(class_scope:GetMailItemRsp)
    private static final emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp();
    }

    public static emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMailItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetMailItemRsp>() {
      @java.lang.Override
      public GetMailItemRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetMailItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMailItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetMailItemRspOuterClass.GetMailItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMailItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMailItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GetMailItemRsp.proto\032\020EquipParam.proto" +
      "\"W\n\016GetMailItemRsp\022\024\n\014mail_id_list\030\004 \003(\r" +
      "\022\036\n\titem_list\030\t \003(\0132\013.EquipParam\022\017\n\007retc" +
      "ode\030\016 \001(\005B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EquipParamOuterClass.getDescriptor(),
        });
    internal_static_GetMailItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetMailItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMailItemRsp_descriptor,
        new java.lang.String[] { "MailIdList", "ItemList", "Retcode", });
    emu.grasscutter.net.proto.EquipParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
