// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomBriefInfoNotify.proto

package emu.grasscutter.net.proto;

public final class BlossomBriefInfoNotifyOuterClass {
  private BlossomBriefInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomBriefInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomBriefInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> 
        getBriefInfoListList();
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(int index);
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    int getBriefInfoListCount();
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> 
        getBriefInfoListOrBuilderList();
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 26657
   * </pre>
   *
   * Protobuf type {@code BlossomBriefInfoNotify}
   */
  public static final class BlossomBriefInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomBriefInfoNotify)
      BlossomBriefInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomBriefInfoNotify.newBuilder() to construct.
    private BlossomBriefInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomBriefInfoNotify() {
      briefInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomBriefInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.class, emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.Builder.class);
    }

    public static final int BRIEF_INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> briefInfoList_;
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> getBriefInfoListList() {
      return briefInfoList_;
    }
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> 
        getBriefInfoListOrBuilderList() {
      return briefInfoList_;
    }
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    @java.lang.Override
    public int getBriefInfoListCount() {
      return briefInfoList_.size();
    }
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(int index) {
      return briefInfoList_.get(index);
    }
    /**
     * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(
        int index) {
      return briefInfoList_.get(index);
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
      for (int i = 0; i < briefInfoList_.size(); i++) {
        output.writeMessage(9, briefInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < briefInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, briefInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify other = (emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify) obj;

      if (!getBriefInfoListList()
          .equals(other.getBriefInfoListList())) return false;
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
      if (getBriefInfoListCount() > 0) {
        hash = (37 * hash) + BRIEF_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBriefInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify prototype) {
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
     * CmdId: 26657
     * </pre>
     *
     * Protobuf type {@code BlossomBriefInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomBriefInfoNotify)
        emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.class, emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (briefInfoListBuilder_ == null) {
          briefInfoList_ = java.util.Collections.emptyList();
        } else {
          briefInfoList_ = null;
          briefInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.internal_static_BlossomBriefInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify build() {
        emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify buildPartial() {
        emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify result = new emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (briefInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            briefInfoList_ = java.util.Collections.unmodifiableList(briefInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.briefInfoList_ = briefInfoList_;
        } else {
          result.briefInfoList_ = briefInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify other) {
        if (other == emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.getDefaultInstance()) return this;
        if (briefInfoListBuilder_ == null) {
          if (!other.briefInfoList_.isEmpty()) {
            if (briefInfoList_.isEmpty()) {
              briefInfoList_ = other.briefInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBriefInfoListIsMutable();
              briefInfoList_.addAll(other.briefInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.briefInfoList_.isEmpty()) {
            if (briefInfoListBuilder_.isEmpty()) {
              briefInfoListBuilder_.dispose();
              briefInfoListBuilder_ = null;
              briefInfoList_ = other.briefInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              briefInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBriefInfoListFieldBuilder() : null;
            } else {
              briefInfoListBuilder_.addAllMessages(other.briefInfoList_);
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
              case 74: {
                emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.parser(),
                        extensionRegistry);
                if (briefInfoListBuilder_ == null) {
                  ensureBriefInfoListIsMutable();
                  briefInfoList_.add(m);
                } else {
                  briefInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 74
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

      private java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> briefInfoList_ =
        java.util.Collections.emptyList();
      private void ensureBriefInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          briefInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo>(briefInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> briefInfoListBuilder_;

      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> getBriefInfoListList() {
        if (briefInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(briefInfoList_);
        } else {
          return briefInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public int getBriefInfoListCount() {
        if (briefInfoListBuilder_ == null) {
          return briefInfoList_.size();
        } else {
          return briefInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo getBriefInfoList(int index) {
        if (briefInfoListBuilder_ == null) {
          return briefInfoList_.get(index);
        } else {
          return briefInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder setBriefInfoList(
          int index, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
        if (briefInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBriefInfoListIsMutable();
          briefInfoList_.set(index, value);
          onChanged();
        } else {
          briefInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder setBriefInfoList(
          int index, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
        if (briefInfoListBuilder_ == null) {
          ensureBriefInfoListIsMutable();
          briefInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          briefInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder addBriefInfoList(emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
        if (briefInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBriefInfoListIsMutable();
          briefInfoList_.add(value);
          onChanged();
        } else {
          briefInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder addBriefInfoList(
          int index, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo value) {
        if (briefInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBriefInfoListIsMutable();
          briefInfoList_.add(index, value);
          onChanged();
        } else {
          briefInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder addBriefInfoList(
          emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
        if (briefInfoListBuilder_ == null) {
          ensureBriefInfoListIsMutable();
          briefInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          briefInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder addBriefInfoList(
          int index, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder builderForValue) {
        if (briefInfoListBuilder_ == null) {
          ensureBriefInfoListIsMutable();
          briefInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          briefInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder addAllBriefInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo> values) {
        if (briefInfoListBuilder_ == null) {
          ensureBriefInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, briefInfoList_);
          onChanged();
        } else {
          briefInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder clearBriefInfoList() {
        if (briefInfoListBuilder_ == null) {
          briefInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          briefInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public Builder removeBriefInfoList(int index) {
        if (briefInfoListBuilder_ == null) {
          ensureBriefInfoListIsMutable();
          briefInfoList_.remove(index);
          onChanged();
        } else {
          briefInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder getBriefInfoListBuilder(
          int index) {
        return getBriefInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder getBriefInfoListOrBuilder(
          int index) {
        if (briefInfoListBuilder_ == null) {
          return briefInfoList_.get(index);  } else {
          return briefInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> 
           getBriefInfoListOrBuilderList() {
        if (briefInfoListBuilder_ != null) {
          return briefInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(briefInfoList_);
        }
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder addBriefInfoListBuilder() {
        return getBriefInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder addBriefInfoListBuilder(
          int index) {
        return getBriefInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BlossomBriefInfo brief_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder> 
           getBriefInfoListBuilderList() {
        return getBriefInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder> 
          getBriefInfoListFieldBuilder() {
        if (briefInfoListBuilder_ == null) {
          briefInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo.Builder, emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfoOrBuilder>(
                  briefInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          briefInfoList_ = null;
        }
        return briefInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BlossomBriefInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:BlossomBriefInfoNotify)
    private static final emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify();
    }

    public static emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomBriefInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<BlossomBriefInfoNotify>() {
      @java.lang.Override
      public BlossomBriefInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlossomBriefInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomBriefInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomBriefInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomBriefInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BlossomBriefInfoNotify.proto\032\026BlossomB" +
      "riefInfo.proto\"D\n\026BlossomBriefInfoNotify" +
      "\022*\n\017brief_info_list\030\t \003(\0132\021.BlossomBrief" +
      "InfoB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.getDescriptor(),
        });
    internal_static_BlossomBriefInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomBriefInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomBriefInfoNotify_descriptor,
        new java.lang.String[] { "BriefInfoList", });
    emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
