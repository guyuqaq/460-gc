// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarSummonAllEventNotify.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarSummonAllEventNotifyOuterClass {
  private HomeAvatarSummonAllEventNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarSummonAllEventNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarSummonAllEventNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> 
        getSummonEventListList();
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getSummonEventList(int index);
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    int getSummonEventListCount();
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder> 
        getSummonEventListOrBuilderList();
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder getSummonEventListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HomeAvatarSummonAllEventNotify}
   */
  public static final class HomeAvatarSummonAllEventNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarSummonAllEventNotify)
      HomeAvatarSummonAllEventNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarSummonAllEventNotify.newBuilder() to construct.
    private HomeAvatarSummonAllEventNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarSummonAllEventNotify() {
      summonEventList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarSummonAllEventNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.internal_static_HomeAvatarSummonAllEventNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.internal_static_HomeAvatarSummonAllEventNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.class, emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.Builder.class);
    }

    public static final int SUMMON_EVENT_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> summonEventList_;
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> getSummonEventListList() {
      return summonEventList_;
    }
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder> 
        getSummonEventListOrBuilderList() {
      return summonEventList_;
    }
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    @java.lang.Override
    public int getSummonEventListCount() {
      return summonEventList_.size();
    }
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getSummonEventList(int index) {
      return summonEventList_.get(index);
    }
    /**
     * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder getSummonEventListOrBuilder(
        int index) {
      return summonEventList_.get(index);
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
      for (int i = 0; i < summonEventList_.size(); i++) {
        output.writeMessage(12, summonEventList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < summonEventList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, summonEventList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify other = (emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify) obj;

      if (!getSummonEventListList()
          .equals(other.getSummonEventListList())) return false;
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
      if (getSummonEventListCount() > 0) {
        hash = (37 * hash) + SUMMON_EVENT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSummonEventListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify prototype) {
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
     * Protobuf type {@code HomeAvatarSummonAllEventNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarSummonAllEventNotify)
        emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.internal_static_HomeAvatarSummonAllEventNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.internal_static_HomeAvatarSummonAllEventNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.class, emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (summonEventListBuilder_ == null) {
          summonEventList_ = java.util.Collections.emptyList();
        } else {
          summonEventList_ = null;
          summonEventListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.internal_static_HomeAvatarSummonAllEventNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify build() {
        emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify buildPartial() {
        emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify result = new emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify(this);
        int from_bitField0_ = bitField0_;
        if (summonEventListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            summonEventList_ = java.util.Collections.unmodifiableList(summonEventList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.summonEventList_ = summonEventList_;
        } else {
          result.summonEventList_ = summonEventListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify other) {
        if (other == emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify.getDefaultInstance()) return this;
        if (summonEventListBuilder_ == null) {
          if (!other.summonEventList_.isEmpty()) {
            if (summonEventList_.isEmpty()) {
              summonEventList_ = other.summonEventList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSummonEventListIsMutable();
              summonEventList_.addAll(other.summonEventList_);
            }
            onChanged();
          }
        } else {
          if (!other.summonEventList_.isEmpty()) {
            if (summonEventListBuilder_.isEmpty()) {
              summonEventListBuilder_.dispose();
              summonEventListBuilder_ = null;
              summonEventList_ = other.summonEventList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              summonEventListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSummonEventListFieldBuilder() : null;
            } else {
              summonEventListBuilder_.addAllMessages(other.summonEventList_);
            }
          }
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
              case 98: {
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.parser(),
                        extensionRegistry);
                if (summonEventListBuilder_ == null) {
                  ensureSummonEventListIsMutable();
                  summonEventList_.add(m);
                } else {
                  summonEventListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> summonEventList_ =
        java.util.Collections.emptyList();
      private void ensureSummonEventListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          summonEventList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo>(summonEventList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder> summonEventListBuilder_;

      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> getSummonEventListList() {
        if (summonEventListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(summonEventList_);
        } else {
          return summonEventListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public int getSummonEventListCount() {
        if (summonEventListBuilder_ == null) {
          return summonEventList_.size();
        } else {
          return summonEventListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo getSummonEventList(int index) {
        if (summonEventListBuilder_ == null) {
          return summonEventList_.get(index);
        } else {
          return summonEventListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder setSummonEventList(
          int index, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo value) {
        if (summonEventListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSummonEventListIsMutable();
          summonEventList_.set(index, value);
          onChanged();
        } else {
          summonEventListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder setSummonEventList(
          int index, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder builderForValue) {
        if (summonEventListBuilder_ == null) {
          ensureSummonEventListIsMutable();
          summonEventList_.set(index, builderForValue.build());
          onChanged();
        } else {
          summonEventListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder addSummonEventList(emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo value) {
        if (summonEventListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSummonEventListIsMutable();
          summonEventList_.add(value);
          onChanged();
        } else {
          summonEventListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder addSummonEventList(
          int index, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo value) {
        if (summonEventListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSummonEventListIsMutable();
          summonEventList_.add(index, value);
          onChanged();
        } else {
          summonEventListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder addSummonEventList(
          emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder builderForValue) {
        if (summonEventListBuilder_ == null) {
          ensureSummonEventListIsMutable();
          summonEventList_.add(builderForValue.build());
          onChanged();
        } else {
          summonEventListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder addSummonEventList(
          int index, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder builderForValue) {
        if (summonEventListBuilder_ == null) {
          ensureSummonEventListIsMutable();
          summonEventList_.add(index, builderForValue.build());
          onChanged();
        } else {
          summonEventListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder addAllSummonEventList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo> values) {
        if (summonEventListBuilder_ == null) {
          ensureSummonEventListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, summonEventList_);
          onChanged();
        } else {
          summonEventListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder clearSummonEventList() {
        if (summonEventListBuilder_ == null) {
          summonEventList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          summonEventListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public Builder removeSummonEventList(int index) {
        if (summonEventListBuilder_ == null) {
          ensureSummonEventListIsMutable();
          summonEventList_.remove(index);
          onChanged();
        } else {
          summonEventListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder getSummonEventListBuilder(
          int index) {
        return getSummonEventListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder getSummonEventListOrBuilder(
          int index) {
        if (summonEventListBuilder_ == null) {
          return summonEventList_.get(index);  } else {
          return summonEventListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder> 
           getSummonEventListOrBuilderList() {
        if (summonEventListBuilder_ != null) {
          return summonEventListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(summonEventList_);
        }
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder addSummonEventListBuilder() {
        return getSummonEventListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder addSummonEventListBuilder(
          int index) {
        return getSummonEventListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeAvatarSummonEventInfo summon_event_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder> 
           getSummonEventListBuilderList() {
        return getSummonEventListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder> 
          getSummonEventListFieldBuilder() {
        if (summonEventListBuilder_ == null) {
          summonEventListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.Builder, emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfoOrBuilder>(
                  summonEventList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          summonEventList_ = null;
        }
        return summonEventListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarSummonAllEventNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarSummonAllEventNotify)
    private static final emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify();
    }

    public static emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarSummonAllEventNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarSummonAllEventNotify>() {
      @java.lang.Override
      public HomeAvatarSummonAllEventNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAvatarSummonAllEventNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarSummonAllEventNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarSummonAllEventNotifyOuterClass.HomeAvatarSummonAllEventNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarSummonAllEventNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarSummonAllEventNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeAvatarSummonAllEventNotify.proto\032\037" +
      "HomeAvatarSummonEventInfo.proto\"W\n\036HomeA" +
      "vatarSummonAllEventNotify\0225\n\021summon_even" +
      "t_list\030\014 \003(\0132\032.HomeAvatarSummonEventInfo" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeAvatarSummonAllEventNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarSummonAllEventNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarSummonAllEventNotify_descriptor,
        new java.lang.String[] { "SummonEventList", });
    emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
