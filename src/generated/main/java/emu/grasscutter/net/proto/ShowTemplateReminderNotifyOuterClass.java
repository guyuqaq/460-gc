// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowTemplateReminderNotify.proto

package emu.grasscutter.net.proto;

public final class ShowTemplateReminderNotifyOuterClass {
  private ShowTemplateReminderNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowTemplateReminderNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowTemplateReminderNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool teis_need_cache = 3;</code>
     * @return The teisNeedCache.
     */
    boolean getTeisNeedCache();

    /**
     * <code>repeated int32 param_list = 4;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated int32 param_list = 4;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated int32 param_list = 4;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);

    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @return A list containing the paramUidList.
     */
    java.util.List<java.lang.Integer> getParamUidListList();
    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @return The count of paramUidList.
     */
    int getParamUidListCount();
    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    int getParamUidList(int index);

    /**
     * <code>uint32 template_reminder_id = 9;</code>
     * @return The templateReminderId.
     */
    int getTemplateReminderId();

    /**
     * <code>bool is_revoke = 10;</code>
     * @return The isRevoke.
     */
    boolean getIsRevoke();
  }
  /**
   * Protobuf type {@code ShowTemplateReminderNotify}
   */
  public static final class ShowTemplateReminderNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowTemplateReminderNotify)
      ShowTemplateReminderNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowTemplateReminderNotify.newBuilder() to construct.
    private ShowTemplateReminderNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowTemplateReminderNotify() {
      paramList_ = emptyIntList();
      paramUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowTemplateReminderNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.class, emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.Builder.class);
    }

    public static final int TEIS_NEED_CACHE_FIELD_NUMBER = 3;
    private boolean teisNeedCache_;
    /**
     * <code>bool teis_need_cache = 3;</code>
     * @return The teisNeedCache.
     */
    @java.lang.Override
    public boolean getTeisNeedCache() {
      return teisNeedCache_;
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated int32 param_list = 4;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated int32 param_list = 4;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated int32 param_list = 4;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int PARAM_UID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList paramUidList_;
    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @return A list containing the paramUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamUidListList() {
      return paramUidList_;
    }
    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @return The count of paramUidList.
     */
    public int getParamUidListCount() {
      return paramUidList_.size();
    }
    /**
     * <code>repeated uint32 param_uid_list = 6;</code>
     * @param index The index of the element to return.
     * @return The paramUidList at the given index.
     */
    public int getParamUidList(int index) {
      return paramUidList_.getInt(index);
    }
    private int paramUidListMemoizedSerializedSize = -1;

    public static final int TEMPLATE_REMINDER_ID_FIELD_NUMBER = 9;
    private int templateReminderId_;
    /**
     * <code>uint32 template_reminder_id = 9;</code>
     * @return The templateReminderId.
     */
    @java.lang.Override
    public int getTemplateReminderId() {
      return templateReminderId_;
    }

    public static final int IS_REVOKE_FIELD_NUMBER = 10;
    private boolean isRevoke_;
    /**
     * <code>bool is_revoke = 10;</code>
     * @return The isRevoke.
     */
    @java.lang.Override
    public boolean getIsRevoke() {
      return isRevoke_;
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
      if (teisNeedCache_ != false) {
        output.writeBool(3, teisNeedCache_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeInt32NoTag(paramList_.getInt(i));
      }
      if (getParamUidListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(paramUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramUidList_.size(); i++) {
        output.writeUInt32NoTag(paramUidList_.getInt(i));
      }
      if (templateReminderId_ != 0) {
        output.writeUInt32(9, templateReminderId_);
      }
      if (isRevoke_ != false) {
        output.writeBool(10, isRevoke_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teisNeedCache_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, teisNeedCache_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
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
      if (templateReminderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, templateReminderId_);
      }
      if (isRevoke_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isRevoke_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify other = (emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify) obj;

      if (getTeisNeedCache()
          != other.getTeisNeedCache()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (!getParamUidListList()
          .equals(other.getParamUidListList())) return false;
      if (getTemplateReminderId()
          != other.getTemplateReminderId()) return false;
      if (getIsRevoke()
          != other.getIsRevoke()) return false;
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
      hash = (37 * hash) + TEIS_NEED_CACHE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTeisNeedCache());
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      if (getParamUidListCount() > 0) {
        hash = (37 * hash) + PARAM_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamUidListList().hashCode();
      }
      hash = (37 * hash) + TEMPLATE_REMINDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateReminderId();
      hash = (37 * hash) + IS_REVOKE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRevoke());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify prototype) {
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
     * Protobuf type {@code ShowTemplateReminderNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowTemplateReminderNotify)
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.class, emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        teisNeedCache_ = false;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        templateReminderId_ = 0;

        isRevoke_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.internal_static_ShowTemplateReminderNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify build() {
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify buildPartial() {
        emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify result = new emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify(this);
        int from_bitField0_ = bitField0_;
        result.teisNeedCache_ = teisNeedCache_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          paramUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paramUidList_ = paramUidList_;
        result.templateReminderId_ = templateReminderId_;
        result.isRevoke_ = isRevoke_;
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
        if (other instanceof emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify other) {
        if (other == emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify.getDefaultInstance()) return this;
        if (other.getTeisNeedCache() != false) {
          setTeisNeedCache(other.getTeisNeedCache());
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
        if (!other.paramUidList_.isEmpty()) {
          if (paramUidList_.isEmpty()) {
            paramUidList_ = other.paramUidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamUidListIsMutable();
            paramUidList_.addAll(other.paramUidList_);
          }
          onChanged();
        }
        if (other.getTemplateReminderId() != 0) {
          setTemplateReminderId(other.getTemplateReminderId());
        }
        if (other.getIsRevoke() != false) {
          setIsRevoke(other.getIsRevoke());
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
                teisNeedCache_ = input.readBool();

                break;
              } // case 24
              case 32: {
                int v = input.readInt32();
                ensureParamListIsMutable();
                paramList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParamListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  paramList_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 48: {
                int v = input.readUInt32();
                ensureParamUidListIsMutable();
                paramUidList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParamUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  paramUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 72: {
                templateReminderId_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                isRevoke_ = input.readBool();

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
      private int bitField0_;

      private boolean teisNeedCache_ ;
      /**
       * <code>bool teis_need_cache = 3;</code>
       * @return The teisNeedCache.
       */
      @java.lang.Override
      public boolean getTeisNeedCache() {
        return teisNeedCache_;
      }
      /**
       * <code>bool teis_need_cache = 3;</code>
       * @param value The teisNeedCache to set.
       * @return This builder for chaining.
       */
      public Builder setTeisNeedCache(boolean value) {
        
        teisNeedCache_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool teis_need_cache = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeisNeedCache() {
        
        teisNeedCache_ = false;
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
       * <code>repeated int32 param_list = 4;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated int32 param_list = 4;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated int32 param_list = 4;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated int32 param_list = 4;</code>
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
       * <code>repeated int32 param_list = 4;</code>
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
       * <code>repeated int32 param_list = 4;</code>
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
       * <code>repeated int32 param_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramUidList_ = emptyIntList();
      private void ensureParamUidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          paramUidList_ = mutableCopy(paramUidList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 param_uid_list = 6;</code>
       * @return A list containing the paramUidList.
       */
      public java.util.List<java.lang.Integer>
          getParamUidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(paramUidList_) : paramUidList_;
      }
      /**
       * <code>repeated uint32 param_uid_list = 6;</code>
       * @return The count of paramUidList.
       */
      public int getParamUidListCount() {
        return paramUidList_.size();
      }
      /**
       * <code>repeated uint32 param_uid_list = 6;</code>
       * @param index The index of the element to return.
       * @return The paramUidList at the given index.
       */
      public int getParamUidList(int index) {
        return paramUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_uid_list = 6;</code>
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
       * <code>repeated uint32 param_uid_list = 6;</code>
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
       * <code>repeated uint32 param_uid_list = 6;</code>
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
       * <code>repeated uint32 param_uid_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamUidList() {
        paramUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int templateReminderId_ ;
      /**
       * <code>uint32 template_reminder_id = 9;</code>
       * @return The templateReminderId.
       */
      @java.lang.Override
      public int getTemplateReminderId() {
        return templateReminderId_;
      }
      /**
       * <code>uint32 template_reminder_id = 9;</code>
       * @param value The templateReminderId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateReminderId(int value) {
        
        templateReminderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_reminder_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateReminderId() {
        
        templateReminderId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRevoke_ ;
      /**
       * <code>bool is_revoke = 10;</code>
       * @return The isRevoke.
       */
      @java.lang.Override
      public boolean getIsRevoke() {
        return isRevoke_;
      }
      /**
       * <code>bool is_revoke = 10;</code>
       * @param value The isRevoke to set.
       * @return This builder for chaining.
       */
      public Builder setIsRevoke(boolean value) {
        
        isRevoke_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_revoke = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRevoke() {
        
        isRevoke_ = false;
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


      // @@protoc_insertion_point(builder_scope:ShowTemplateReminderNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowTemplateReminderNotify)
    private static final emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify();
    }

    public static emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowTemplateReminderNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowTemplateReminderNotify>() {
      @java.lang.Override
      public ShowTemplateReminderNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShowTemplateReminderNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowTemplateReminderNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ShowTemplateReminderNotifyOuterClass.ShowTemplateReminderNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowTemplateReminderNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowTemplateReminderNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ShowTemplateReminderNotify.proto\"\222\001\n\032S" +
      "howTemplateReminderNotify\022\027\n\017teis_need_c" +
      "ache\030\003 \001(\010\022\022\n\nparam_list\030\004 \003(\005\022\026\n\016param_" +
      "uid_list\030\006 \003(\r\022\034\n\024template_reminder_id\030\t" +
      " \001(\r\022\021\n\tis_revoke\030\n \001(\010B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShowTemplateReminderNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowTemplateReminderNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowTemplateReminderNotify_descriptor,
        new java.lang.String[] { "TeisNeedCache", "ParamList", "ParamUidList", "TemplateReminderId", "IsRevoke", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
