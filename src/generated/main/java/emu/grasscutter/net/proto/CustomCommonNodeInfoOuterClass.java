// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomCommonNodeInfo.proto

package emu.grasscutter.net.proto;

public final class CustomCommonNodeInfoOuterClass {
  private CustomCommonNodeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomCommonNodeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomCommonNodeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 parent_index = 1;</code>
     * @return The parentIndex.
     */
    int getParentIndex();

    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>string slot_identifier = 3;</code>
     * @return The slotIdentifier.
     */
    java.lang.String getSlotIdentifier();
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The bytes for slotIdentifier.
     */
    com.google.protobuf.ByteString
        getSlotIdentifierBytes();

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
  }
  /**
   * <pre>
   * 5.0.0
   * </pre>
   *
   * Protobuf type {@code CustomCommonNodeInfo}
   */
  public static final class CustomCommonNodeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomCommonNodeInfo)
      CustomCommonNodeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomCommonNodeInfo.newBuilder() to construct.
    private CustomCommonNodeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomCommonNodeInfo() {
      slotIdentifier_ = "";
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomCommonNodeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.class, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder.class);
    }

    public static final int PARENT_INDEX_FIELD_NUMBER = 1;
    private int parentIndex_;
    /**
     * <code>int32 parent_index = 1;</code>
     * @return The parentIndex.
     */
    @java.lang.Override
    public int getParentIndex() {
      return parentIndex_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 2;
    private int configId_;
    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int SLOT_IDENTIFIER_FIELD_NUMBER = 3;
    private volatile java.lang.Object slotIdentifier_;
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The slotIdentifier.
     */
    @java.lang.Override
    public java.lang.String getSlotIdentifier() {
      java.lang.Object ref = slotIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slotIdentifier_ = s;
        return s;
      }
    }
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The bytes for slotIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSlotIdentifierBytes() {
      java.lang.Object ref = slotIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slotIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (parentIndex_ != 0) {
        output.writeInt32(1, parentIndex_);
      }
      if (configId_ != 0) {
        output.writeUInt32(2, configId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slotIdentifier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, slotIdentifier_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeInt32NoTag(paramList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, parentIndex_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, configId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slotIdentifier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, slotIdentifier_);
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo other = (emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo) obj;

      if (getParentIndex()
          != other.getParentIndex()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (!getSlotIdentifier()
          .equals(other.getSlotIdentifier())) return false;
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
      hash = (37 * hash) + PARENT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getParentIndex();
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + SLOT_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getSlotIdentifier().hashCode();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo prototype) {
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
     * 5.0.0
     * </pre>
     *
     * Protobuf type {@code CustomCommonNodeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomCommonNodeInfo)
        emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.class, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        parentIndex_ = 0;

        configId_ = 0;

        slotIdentifier_ = "";

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo build() {
        emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo buildPartial() {
        emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo result = new emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo(this);
        int from_bitField0_ = bitField0_;
        result.parentIndex_ = parentIndex_;
        result.configId_ = configId_;
        result.slotIdentifier_ = slotIdentifier_;
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
        if (other instanceof emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo other) {
        if (other == emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance()) return this;
        if (other.getParentIndex() != 0) {
          setParentIndex(other.getParentIndex());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (!other.getSlotIdentifier().isEmpty()) {
          slotIdentifier_ = other.slotIdentifier_;
          onChanged();
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
                parentIndex_ = input.readInt32();

                break;
              } // case 8
              case 16: {
                configId_ = input.readUInt32();

                break;
              } // case 16
              case 26: {
                slotIdentifier_ = input.readStringRequireUtf8();

                break;
              } // case 26
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

      private int parentIndex_ ;
      /**
       * <code>int32 parent_index = 1;</code>
       * @return The parentIndex.
       */
      @java.lang.Override
      public int getParentIndex() {
        return parentIndex_;
      }
      /**
       * <code>int32 parent_index = 1;</code>
       * @param value The parentIndex to set.
       * @return This builder for chaining.
       */
      public Builder setParentIndex(int value) {
        
        parentIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 parent_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentIndex() {
        
        parentIndex_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 2;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object slotIdentifier_ = "";
      /**
       * <code>string slot_identifier = 3;</code>
       * @return The slotIdentifier.
       */
      public java.lang.String getSlotIdentifier() {
        java.lang.Object ref = slotIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          slotIdentifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @return The bytes for slotIdentifier.
       */
      public com.google.protobuf.ByteString
          getSlotIdentifierBytes() {
        java.lang.Object ref = slotIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          slotIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @param value The slotIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setSlotIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        slotIdentifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotIdentifier() {
        
        slotIdentifier_ = getDefaultInstance().getSlotIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @param value The bytes for slotIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setSlotIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        slotIdentifier_ = value;
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


      // @@protoc_insertion_point(builder_scope:CustomCommonNodeInfo)
    }

    // @@protoc_insertion_point(class_scope:CustomCommonNodeInfo)
    private static final emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo();
    }

    public static emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomCommonNodeInfo>
        PARSER = new com.google.protobuf.AbstractParser<CustomCommonNodeInfo>() {
      @java.lang.Override
      public CustomCommonNodeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomCommonNodeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomCommonNodeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomCommonNodeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomCommonNodeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CustomCommonNodeInfo.proto\"l\n\024CustomCo" +
      "mmonNodeInfo\022\024\n\014parent_index\030\001 \001(\005\022\021\n\tco" +
      "nfig_id\030\002 \001(\r\022\027\n\017slot_identifier\030\003 \001(\t\022\022" +
      "\n\nparam_list\030\004 \003(\005B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomCommonNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomCommonNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomCommonNodeInfo_descriptor,
        new java.lang.String[] { "ParentIndex", "ConfigId", "SlotIdentifier", "ParamList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
