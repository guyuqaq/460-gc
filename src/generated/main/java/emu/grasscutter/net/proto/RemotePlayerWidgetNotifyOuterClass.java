// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemotePlayerWidgetNotify.proto

package emu.grasscutter.net.proto;

public final class RemotePlayerWidgetNotifyOuterClass {
  private RemotePlayerWidgetNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RemotePlayerWidgetNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RemotePlayerWidgetNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> 
        getPlayerWidgetInfoListList();
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getPlayerWidgetInfoList(int index);
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    int getPlayerWidgetInfoListCount();
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder> 
        getPlayerWidgetInfoListOrBuilderList();
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder getPlayerWidgetInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RemotePlayerWidgetNotify}
   */
  public static final class RemotePlayerWidgetNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RemotePlayerWidgetNotify)
      RemotePlayerWidgetNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemotePlayerWidgetNotify.newBuilder() to construct.
    private RemotePlayerWidgetNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemotePlayerWidgetNotify() {
      playerWidgetInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RemotePlayerWidgetNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.internal_static_RemotePlayerWidgetNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.internal_static_RemotePlayerWidgetNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.class, emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.Builder.class);
    }

    public static final int PLAYER_WIDGET_INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> playerWidgetInfoList_;
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> getPlayerWidgetInfoListList() {
      return playerWidgetInfoList_;
    }
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder> 
        getPlayerWidgetInfoListOrBuilderList() {
      return playerWidgetInfoList_;
    }
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    @java.lang.Override
    public int getPlayerWidgetInfoListCount() {
      return playerWidgetInfoList_.size();
    }
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getPlayerWidgetInfoList(int index) {
      return playerWidgetInfoList_.get(index);
    }
    /**
     * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder getPlayerWidgetInfoListOrBuilder(
        int index) {
      return playerWidgetInfoList_.get(index);
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
      for (int i = 0; i < playerWidgetInfoList_.size(); i++) {
        output.writeMessage(9, playerWidgetInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerWidgetInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, playerWidgetInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify other = (emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify) obj;

      if (!getPlayerWidgetInfoListList()
          .equals(other.getPlayerWidgetInfoListList())) return false;
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
      if (getPlayerWidgetInfoListCount() > 0) {
        hash = (37 * hash) + PLAYER_WIDGET_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerWidgetInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify prototype) {
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
     * Protobuf type {@code RemotePlayerWidgetNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RemotePlayerWidgetNotify)
        emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.internal_static_RemotePlayerWidgetNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.internal_static_RemotePlayerWidgetNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.class, emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerWidgetInfoListBuilder_ == null) {
          playerWidgetInfoList_ = java.util.Collections.emptyList();
        } else {
          playerWidgetInfoList_ = null;
          playerWidgetInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.internal_static_RemotePlayerWidgetNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify build() {
        emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify buildPartial() {
        emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify result = new emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify(this);
        int from_bitField0_ = bitField0_;
        if (playerWidgetInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerWidgetInfoList_ = java.util.Collections.unmodifiableList(playerWidgetInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerWidgetInfoList_ = playerWidgetInfoList_;
        } else {
          result.playerWidgetInfoList_ = playerWidgetInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify other) {
        if (other == emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify.getDefaultInstance()) return this;
        if (playerWidgetInfoListBuilder_ == null) {
          if (!other.playerWidgetInfoList_.isEmpty()) {
            if (playerWidgetInfoList_.isEmpty()) {
              playerWidgetInfoList_ = other.playerWidgetInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerWidgetInfoListIsMutable();
              playerWidgetInfoList_.addAll(other.playerWidgetInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerWidgetInfoList_.isEmpty()) {
            if (playerWidgetInfoListBuilder_.isEmpty()) {
              playerWidgetInfoListBuilder_.dispose();
              playerWidgetInfoListBuilder_ = null;
              playerWidgetInfoList_ = other.playerWidgetInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerWidgetInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerWidgetInfoListFieldBuilder() : null;
            } else {
              playerWidgetInfoListBuilder_.addAllMessages(other.playerWidgetInfoList_);
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
                emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.parser(),
                        extensionRegistry);
                if (playerWidgetInfoListBuilder_ == null) {
                  ensurePlayerWidgetInfoListIsMutable();
                  playerWidgetInfoList_.add(m);
                } else {
                  playerWidgetInfoListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> playerWidgetInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerWidgetInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerWidgetInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo>(playerWidgetInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder> playerWidgetInfoListBuilder_;

      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> getPlayerWidgetInfoListList() {
        if (playerWidgetInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerWidgetInfoList_);
        } else {
          return playerWidgetInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public int getPlayerWidgetInfoListCount() {
        if (playerWidgetInfoListBuilder_ == null) {
          return playerWidgetInfoList_.size();
        } else {
          return playerWidgetInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo getPlayerWidgetInfoList(int index) {
        if (playerWidgetInfoListBuilder_ == null) {
          return playerWidgetInfoList_.get(index);
        } else {
          return playerWidgetInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder setPlayerWidgetInfoList(
          int index, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo value) {
        if (playerWidgetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.set(index, value);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder setPlayerWidgetInfoList(
          int index, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder builderForValue) {
        if (playerWidgetInfoListBuilder_ == null) {
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder addPlayerWidgetInfoList(emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo value) {
        if (playerWidgetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.add(value);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder addPlayerWidgetInfoList(
          int index, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo value) {
        if (playerWidgetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.add(index, value);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder addPlayerWidgetInfoList(
          emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder builderForValue) {
        if (playerWidgetInfoListBuilder_ == null) {
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder addPlayerWidgetInfoList(
          int index, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder builderForValue) {
        if (playerWidgetInfoListBuilder_ == null) {
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder addAllPlayerWidgetInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo> values) {
        if (playerWidgetInfoListBuilder_ == null) {
          ensurePlayerWidgetInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerWidgetInfoList_);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder clearPlayerWidgetInfoList() {
        if (playerWidgetInfoListBuilder_ == null) {
          playerWidgetInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public Builder removePlayerWidgetInfoList(int index) {
        if (playerWidgetInfoListBuilder_ == null) {
          ensurePlayerWidgetInfoListIsMutable();
          playerWidgetInfoList_.remove(index);
          onChanged();
        } else {
          playerWidgetInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder getPlayerWidgetInfoListBuilder(
          int index) {
        return getPlayerWidgetInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder getPlayerWidgetInfoListOrBuilder(
          int index) {
        if (playerWidgetInfoListBuilder_ == null) {
          return playerWidgetInfoList_.get(index);  } else {
          return playerWidgetInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder> 
           getPlayerWidgetInfoListOrBuilderList() {
        if (playerWidgetInfoListBuilder_ != null) {
          return playerWidgetInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerWidgetInfoList_);
        }
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder addPlayerWidgetInfoListBuilder() {
        return getPlayerWidgetInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder addPlayerWidgetInfoListBuilder(
          int index) {
        return getPlayerWidgetInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerWidgetInfo player_widget_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder> 
           getPlayerWidgetInfoListBuilderList() {
        return getPlayerWidgetInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder> 
          getPlayerWidgetInfoListFieldBuilder() {
        if (playerWidgetInfoListBuilder_ == null) {
          playerWidgetInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfo.Builder, emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.PlayerWidgetInfoOrBuilder>(
                  playerWidgetInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerWidgetInfoList_ = null;
        }
        return playerWidgetInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RemotePlayerWidgetNotify)
    }

    // @@protoc_insertion_point(class_scope:RemotePlayerWidgetNotify)
    private static final emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify();
    }

    public static emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RemotePlayerWidgetNotify>
        PARSER = new com.google.protobuf.AbstractParser<RemotePlayerWidgetNotify>() {
      @java.lang.Override
      public RemotePlayerWidgetNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RemotePlayerWidgetNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RemotePlayerWidgetNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RemotePlayerWidgetNotifyOuterClass.RemotePlayerWidgetNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemotePlayerWidgetNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemotePlayerWidgetNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RemotePlayerWidgetNotify.proto\032\026Player" +
      "WidgetInfo.proto\"N\n\030RemotePlayerWidgetNo" +
      "tify\0222\n\027player_widget_info_list\030\t \003(\0132\021." +
      "PlayerWidgetInfoB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.getDescriptor(),
        });
    internal_static_RemotePlayerWidgetNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RemotePlayerWidgetNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemotePlayerWidgetNotify_descriptor,
        new java.lang.String[] { "PlayerWidgetInfoList", });
    emu.grasscutter.net.proto.PlayerWidgetInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
