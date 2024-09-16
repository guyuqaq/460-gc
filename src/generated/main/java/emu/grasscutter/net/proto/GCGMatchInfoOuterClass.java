// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMatchInfo.proto

package emu.grasscutter.net.proto;

public final class GCGMatchInfoOuterClass {
  private GCGMatchInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMatchInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMatchInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> 
        getPlayerListList();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index);
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    int getPlayerListCount();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
        getPlayerListOrBuilderList();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GCGMatchInfo}
   */
  public static final class GCGMatchInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMatchInfo)
      GCGMatchInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMatchInfo.newBuilder() to construct.
    private GCGMatchInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMatchInfo() {
      playerList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMatchInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMatchInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playerList_ = java.util.Collections.unmodifiableList(playerList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.internal_static_GCGMatchInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.internal_static_GCGMatchInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.class, emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.Builder.class);
    }

    public static final int PLAYER_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> playerList_;
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> getPlayerListList() {
      return playerList_;
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
        getPlayerListOrBuilderList() {
      return playerList_;
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    @java.lang.Override
    public int getPlayerListCount() {
      return playerList_.size();
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index) {
      return playerList_.get(index);
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
        int index) {
      return playerList_.get(index);
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
      for (int i = 0; i < playerList_.size(); i++) {
        output.writeMessage(2, playerList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, playerList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo other = (emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo) obj;

      if (!getPlayerListList()
          .equals(other.getPlayerListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPlayerListCount() > 0) {
        hash = (37 * hash) + PLAYER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo prototype) {
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
     * Protobuf type {@code GCGMatchInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMatchInfo)
        emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.internal_static_GCGMatchInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.internal_static_GCGMatchInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.class, emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPlayerListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerListBuilder_ == null) {
          playerList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.internal_static_GCGMatchInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo build() {
        emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo buildPartial() {
        emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo result = new emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo(this);
        int from_bitField0_ = bitField0_;
        if (playerListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerList_ = java.util.Collections.unmodifiableList(playerList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerList_ = playerList_;
        } else {
          result.playerList_ = playerListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo other) {
        if (other == emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo.getDefaultInstance()) return this;
        if (playerListBuilder_ == null) {
          if (!other.playerList_.isEmpty()) {
            if (playerList_.isEmpty()) {
              playerList_ = other.playerList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerListIsMutable();
              playerList_.addAll(other.playerList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerList_.isEmpty()) {
            if (playerListBuilder_.isEmpty()) {
              playerListBuilder_.dispose();
              playerListBuilder_ = null;
              playerList_ = other.playerList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerListFieldBuilder() : null;
            } else {
              playerListBuilder_.addAllMessages(other.playerList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> playerList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo>(playerList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> playerListBuilder_;

      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> getPlayerListList() {
        if (playerListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerList_);
        } else {
          return playerListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public int getPlayerListCount() {
        if (playerListBuilder_ == null) {
          return playerList_.size();
        } else {
          return playerListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index) {
        if (playerListBuilder_ == null) {
          return playerList_.get(index);
        } else {
          return playerListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder setPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.set(index, value);
          onChanged();
        } else {
          playerListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder setPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder addPlayerList(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.add(value);
          onChanged();
        } else {
          playerListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder addPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.add(index, value);
          onChanged();
        } else {
          playerListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder addPlayerList(
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.add(builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder addPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder addAllPlayerList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> values) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerList_);
          onChanged();
        } else {
          playerListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder clearPlayerList() {
        if (playerListBuilder_ == null) {
          playerList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public Builder removePlayerList(int index) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.remove(index);
          onChanged();
        } else {
          playerListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder getPlayerListBuilder(
          int index) {
        return getPlayerListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
          int index) {
        if (playerListBuilder_ == null) {
          return playerList_.get(index);  } else {
          return playerListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
           getPlayerListOrBuilderList() {
        if (playerListBuilder_ != null) {
          return playerListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerList_);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder addPlayerListBuilder() {
        return getPlayerListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder addPlayerListBuilder(
          int index) {
        return getPlayerListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder> 
           getPlayerListBuilderList() {
        return getPlayerListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
          getPlayerListFieldBuilder() {
        if (playerListBuilder_ == null) {
          playerListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder>(
                  playerList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerList_ = null;
        }
        return playerListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGMatchInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGMatchInfo)
    private static final emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo();
    }

    public static emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMatchInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGMatchInfo>() {
      @java.lang.Override
      public GCGMatchInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMatchInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMatchInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMatchInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMatchInfoOuterClass.GCGMatchInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMatchInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMatchInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GCGMatchInfo.proto\032\025MatchPlayerInfo.pr" +
      "oto\"5\n\014GCGMatchInfo\022%\n\013player_list\030\002 \003(\013" +
      "2\020.MatchPlayerInfoB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGMatchInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMatchInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMatchInfo_descriptor,
        new java.lang.String[] { "PlayerList", });
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
