// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBeingHitsCombineNotify.proto

package emu.grasscutter.net.proto;

public final class EvtBeingHitsCombineNotifyOuterClass {
  private EvtBeingHitsCombineNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBeingHitsCombineNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBeingHitsCombineNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> 
        getEvtBeingHitInfoListList();
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getEvtBeingHitInfoList(int index);
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    int getEvtBeingHitInfoListCount();
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> 
        getEvtBeingHitInfoListOrBuilderList();
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getEvtBeingHitInfoListOrBuilder(
        int index);

    /**
     * <code>.ForwardType forward_type = 10;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 10;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * Protobuf type {@code EvtBeingHitsCombineNotify}
   */
  public static final class EvtBeingHitsCombineNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBeingHitsCombineNotify)
      EvtBeingHitsCombineNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBeingHitsCombineNotify.newBuilder() to construct.
    private EvtBeingHitsCombineNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBeingHitsCombineNotify() {
      evtBeingHitInfoList_ = java.util.Collections.emptyList();
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBeingHitsCombineNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.internal_static_EvtBeingHitsCombineNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.internal_static_EvtBeingHitsCombineNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.class, emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.Builder.class);
    }

    public static final int EVT_BEING_HIT_INFO_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> evtBeingHitInfoList_;
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> getEvtBeingHitInfoListList() {
      return evtBeingHitInfoList_;
    }
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> 
        getEvtBeingHitInfoListOrBuilderList() {
      return evtBeingHitInfoList_;
    }
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    @java.lang.Override
    public int getEvtBeingHitInfoListCount() {
      return evtBeingHitInfoList_.size();
    }
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getEvtBeingHitInfoList(int index) {
      return evtBeingHitInfoList_.get(index);
    }
    /**
     * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getEvtBeingHitInfoListOrBuilder(
        int index) {
      return evtBeingHitInfoList_.get(index);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 10;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 10;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 10;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      for (int i = 0; i < evtBeingHitInfoList_.size(); i++) {
        output.writeMessage(1, evtBeingHitInfoList_.get(i));
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(10, forwardType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < evtBeingHitInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, evtBeingHitInfoList_.get(i));
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify other = (emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify) obj;

      if (!getEvtBeingHitInfoListList()
          .equals(other.getEvtBeingHitInfoListList())) return false;
      if (forwardType_ != other.forwardType_) return false;
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
      if (getEvtBeingHitInfoListCount() > 0) {
        hash = (37 * hash) + EVT_BEING_HIT_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEvtBeingHitInfoListList().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify prototype) {
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
     * Protobuf type {@code EvtBeingHitsCombineNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBeingHitsCombineNotify)
        emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.internal_static_EvtBeingHitsCombineNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.internal_static_EvtBeingHitsCombineNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.class, emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (evtBeingHitInfoListBuilder_ == null) {
          evtBeingHitInfoList_ = java.util.Collections.emptyList();
        } else {
          evtBeingHitInfoList_ = null;
          evtBeingHitInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.internal_static_EvtBeingHitsCombineNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify build() {
        emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify buildPartial() {
        emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify result = new emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify(this);
        int from_bitField0_ = bitField0_;
        if (evtBeingHitInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            evtBeingHitInfoList_ = java.util.Collections.unmodifiableList(evtBeingHitInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.evtBeingHitInfoList_ = evtBeingHitInfoList_;
        } else {
          result.evtBeingHitInfoList_ = evtBeingHitInfoListBuilder_.build();
        }
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify other) {
        if (other == emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify.getDefaultInstance()) return this;
        if (evtBeingHitInfoListBuilder_ == null) {
          if (!other.evtBeingHitInfoList_.isEmpty()) {
            if (evtBeingHitInfoList_.isEmpty()) {
              evtBeingHitInfoList_ = other.evtBeingHitInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEvtBeingHitInfoListIsMutable();
              evtBeingHitInfoList_.addAll(other.evtBeingHitInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.evtBeingHitInfoList_.isEmpty()) {
            if (evtBeingHitInfoListBuilder_.isEmpty()) {
              evtBeingHitInfoListBuilder_.dispose();
              evtBeingHitInfoListBuilder_ = null;
              evtBeingHitInfoList_ = other.evtBeingHitInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              evtBeingHitInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEvtBeingHitInfoListFieldBuilder() : null;
            } else {
              evtBeingHitInfoListBuilder_.addAllMessages(other.evtBeingHitInfoList_);
            }
          }
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
              case 10: {
                emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.parser(),
                        extensionRegistry);
                if (evtBeingHitInfoListBuilder_ == null) {
                  ensureEvtBeingHitInfoListIsMutable();
                  evtBeingHitInfoList_.add(m);
                } else {
                  evtBeingHitInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 80: {
                forwardType_ = input.readEnum();

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

      private java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> evtBeingHitInfoList_ =
        java.util.Collections.emptyList();
      private void ensureEvtBeingHitInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          evtBeingHitInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo>(evtBeingHitInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> evtBeingHitInfoListBuilder_;

      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> getEvtBeingHitInfoListList() {
        if (evtBeingHitInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(evtBeingHitInfoList_);
        } else {
          return evtBeingHitInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public int getEvtBeingHitInfoListCount() {
        if (evtBeingHitInfoListBuilder_ == null) {
          return evtBeingHitInfoList_.size();
        } else {
          return evtBeingHitInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getEvtBeingHitInfoList(int index) {
        if (evtBeingHitInfoListBuilder_ == null) {
          return evtBeingHitInfoList_.get(index);
        } else {
          return evtBeingHitInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder setEvtBeingHitInfoList(
          int index, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
        if (evtBeingHitInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.set(index, value);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder setEvtBeingHitInfoList(
          int index, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder builderForValue) {
        if (evtBeingHitInfoListBuilder_ == null) {
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder addEvtBeingHitInfoList(emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
        if (evtBeingHitInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.add(value);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder addEvtBeingHitInfoList(
          int index, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
        if (evtBeingHitInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.add(index, value);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder addEvtBeingHitInfoList(
          emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder builderForValue) {
        if (evtBeingHitInfoListBuilder_ == null) {
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder addEvtBeingHitInfoList(
          int index, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder builderForValue) {
        if (evtBeingHitInfoListBuilder_ == null) {
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder addAllEvtBeingHitInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo> values) {
        if (evtBeingHitInfoListBuilder_ == null) {
          ensureEvtBeingHitInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, evtBeingHitInfoList_);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder clearEvtBeingHitInfoList() {
        if (evtBeingHitInfoListBuilder_ == null) {
          evtBeingHitInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public Builder removeEvtBeingHitInfoList(int index) {
        if (evtBeingHitInfoListBuilder_ == null) {
          ensureEvtBeingHitInfoListIsMutable();
          evtBeingHitInfoList_.remove(index);
          onChanged();
        } else {
          evtBeingHitInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder getEvtBeingHitInfoListBuilder(
          int index) {
        return getEvtBeingHitInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getEvtBeingHitInfoListOrBuilder(
          int index) {
        if (evtBeingHitInfoListBuilder_ == null) {
          return evtBeingHitInfoList_.get(index);  } else {
          return evtBeingHitInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> 
           getEvtBeingHitInfoListOrBuilderList() {
        if (evtBeingHitInfoListBuilder_ != null) {
          return evtBeingHitInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(evtBeingHitInfoList_);
        }
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder addEvtBeingHitInfoListBuilder() {
        return getEvtBeingHitInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder addEvtBeingHitInfoListBuilder(
          int index) {
        return getEvtBeingHitInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EvtBeingHitInfo evt_being_hit_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder> 
           getEvtBeingHitInfoListBuilderList() {
        return getEvtBeingHitInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> 
          getEvtBeingHitInfoListFieldBuilder() {
        if (evtBeingHitInfoListBuilder_ == null) {
          evtBeingHitInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder>(
                  evtBeingHitInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          evtBeingHitInfoList_ = null;
        }
        return evtBeingHitInfoListBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 10;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 10;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 10;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 10;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtBeingHitsCombineNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBeingHitsCombineNotify)
    private static final emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify();
    }

    public static emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBeingHitsCombineNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBeingHitsCombineNotify>() {
      @java.lang.Override
      public EvtBeingHitsCombineNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtBeingHitsCombineNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBeingHitsCombineNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBeingHitsCombineNotifyOuterClass.EvtBeingHitsCombineNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBeingHitsCombineNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBeingHitsCombineNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037EvtBeingHitsCombineNotify.proto\032\025EvtBe" +
      "ingHitInfo.proto\032\021ForwardType.proto\"r\n\031E" +
      "vtBeingHitsCombineNotify\0221\n\027evt_being_hi" +
      "t_info_list\030\001 \003(\0132\020.EvtBeingHitInfo\022\"\n\014f" +
      "orward_type\030\n \001(\0162\014.ForwardTypeB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtBeingHitsCombineNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBeingHitsCombineNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBeingHitsCombineNotify_descriptor,
        new java.lang.String[] { "EvtBeingHitInfoList", "ForwardType", });
    emu.grasscutter.net.proto.EvtBeingHitInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
