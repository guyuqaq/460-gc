// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetOnlineStatusRsp.proto

package emu.grasscutter.net.proto;

public final class HomeGetOnlineStatusRspOuterClass {
  private HomeGetOnlineStatusRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetOnlineStatusRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetOnlineStatusRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> 
        getPlayerInfoListList();
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(int index);
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    int getPlayerInfoListCount();
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 23465
   * Obf: ?
   * </pre>
   *
   * Protobuf type {@code HomeGetOnlineStatusRsp}
   */
  public static final class HomeGetOnlineStatusRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetOnlineStatusRsp)
      HomeGetOnlineStatusRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetOnlineStatusRsp.newBuilder() to construct.
    private HomeGetOnlineStatusRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetOnlineStatusRsp() {
      playerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetOnlineStatusRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.internal_static_HomeGetOnlineStatusRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.internal_static_HomeGetOnlineStatusRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.class, emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_;
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    @java.lang.Override
    public int getPlayerInfoListCount() {
      return playerInfoList_.size();
    }
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(int index) {
      return playerInfoList_.get(index);
    }
    /**
     * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index) {
      return playerInfoList_.get(index);
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
      for (int i = 0; i < playerInfoList_.size(); i++) {
        output.writeMessage(9, playerInfoList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, playerInfoList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp other = (emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getPlayerInfoListList()
          .equals(other.getPlayerInfoListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getPlayerInfoListCount() > 0) {
        hash = (37 * hash) + PLAYER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp prototype) {
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
     * CmdId: 23465
     * Obf: ?
     * </pre>
     *
     * Protobuf type {@code HomeGetOnlineStatusRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetOnlineStatusRsp)
        emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.internal_static_HomeGetOnlineStatusRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.internal_static_HomeGetOnlineStatusRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.class, emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
        } else {
          playerInfoList_ = null;
          playerInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.internal_static_HomeGetOnlineStatusRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp build() {
        emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp buildPartial() {
        emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp result = new emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (playerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerInfoList_ = playerInfoList_;
        } else {
          result.playerInfoList_ = playerInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp other) {
        if (other == emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (playerInfoListBuilder_ == null) {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoList_.isEmpty()) {
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerInfoListIsMutable();
              playerInfoList_.addAll(other.playerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoListBuilder_.isEmpty()) {
              playerInfoListBuilder_.dispose();
              playerInfoListBuilder_ = null;
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerInfoListFieldBuilder() : null;
            } else {
              playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
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
                emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(),
                        extensionRegistry);
                if (playerInfoListBuilder_ == null) {
                  ensurePlayerInfoListIsMutable();
                  playerInfoList_.add(m);
                } else {
                  playerInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 74
              case 80: {
                retcode_ = input.readInt32();

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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> playerInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo>(playerInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> playerInfoListBuilder_;

      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> getPlayerInfoListList() {
        if (playerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        } else {
          return playerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public int getPlayerInfoListCount() {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.size();
        } else {
          return playerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);
        } else {
          return playerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder addPlayerInfoList(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder addPlayerInfoList(
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder addAllPlayerInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo> values) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerInfoList_);
          onChanged();
        } else {
          playerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder clearPlayerInfoList() {
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public Builder removePlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.remove(index);
          onChanged();
        } else {
          playerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
          int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);  } else {
          return playerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
           getPlayerInfoListOrBuilderList() {
        if (playerInfoListBuilder_ != null) {
          return playerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        }
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder() {
        return getPlayerInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder addPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OnlinePlayerInfo player_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder> 
           getPlayerInfoListBuilderList() {
        return getPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getPlayerInfoListFieldBuilder() {
        if (playerInfoListBuilder_ == null) {
          playerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  playerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerInfoList_ = null;
        }
        return playerInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeGetOnlineStatusRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeGetOnlineStatusRsp)
    private static final emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp();
    }

    public static emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetOnlineStatusRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetOnlineStatusRsp>() {
      @java.lang.Override
      public HomeGetOnlineStatusRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeGetOnlineStatusRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetOnlineStatusRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetOnlineStatusRspOuterClass.HomeGetOnlineStatusRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetOnlineStatusRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetOnlineStatusRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeGetOnlineStatusRsp.proto\032\026OnlinePl" +
      "ayerInfo.proto\"V\n\026HomeGetOnlineStatusRsp" +
      "\022\017\n\007retcode\030\n \001(\005\022+\n\020player_info_list\030\t " +
      "\003(\0132\021.OnlinePlayerInfoB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeGetOnlineStatusRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetOnlineStatusRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetOnlineStatusRsp_descriptor,
        new java.lang.String[] { "Retcode", "PlayerInfoList", });
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
