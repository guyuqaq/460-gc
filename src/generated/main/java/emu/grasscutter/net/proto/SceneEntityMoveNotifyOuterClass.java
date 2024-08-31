// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityMoveNotify.proto

package emu.grasscutter.net.proto;

public final class SceneEntityMoveNotifyOuterClass {
  private SceneEntityMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MotionInfo motion_info = 1;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 1;</code>
     * @return The motionInfo.
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 1;</code>
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <pre>
     * OK
     * </pre>
     *
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 reliable_seq = 3;</code>
     * @return The reliableSeq.
     */
    int getReliableSeq();

    /**
     * <code>uint32 scene_time = 4;</code>
     * @return The sceneTime.
     */
    int getSceneTime();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId:28352?,6446
   * Obf: ?
   * </pre>
   *
   * Protobuf type {@code SceneEntityMoveNotify}
   */
  public static final class SceneEntityMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityMoveNotify)
      SceneEntityMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityMoveNotify.newBuilder() to construct.
    private SceneEntityMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityMoveNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 1;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 1;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 15;
    private int entityId_;
    /**
     * <pre>
     * OK
     * </pre>
     *
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int RELIABLE_SEQ_FIELD_NUMBER = 3;
    private int reliableSeq_;
    /**
     * <code>uint32 reliable_seq = 3;</code>
     * @return The reliableSeq.
     */
    @java.lang.Override
    public int getReliableSeq() {
      return reliableSeq_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 4;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 4;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
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
      if (motionInfo_ != null) {
        output.writeMessage(1, getMotionInfo());
      }
      if (reliableSeq_ != 0) {
        output.writeUInt32(3, reliableSeq_);
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(4, sceneTime_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(15, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMotionInfo());
      }
      if (reliableSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, reliableSeq_);
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, sceneTime_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other = (emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) obj;

      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getReliableSeq()
          != other.getReliableSeq()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
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
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + RELIABLE_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getReliableSeq();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify prototype) {
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
     * CmdId:28352?,6446
     * Obf: ?
     * </pre>
     *
     * Protobuf type {@code SceneEntityMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityMoveNotify)
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        entityId_ = 0;

        reliableSeq_ = 0;

        sceneTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify build() {
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify buildPartial() {
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = new emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify(this);
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.reliableSeq_ = reliableSeq_;
        result.sceneTime_ = sceneTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other) {
        if (other == emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance()) return this;
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getReliableSeq() != 0) {
          setReliableSeq(other.getReliableSeq());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
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
                input.readMessage(
                    getMotionInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 24: {
                reliableSeq_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                sceneTime_ = input.readUInt32();

                break;
              } // case 32
              case 120: {
                entityId_ = input.readUInt32();

                break;
              } // case 120
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

      private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       * @return The motionInfo.
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
        if (motionInfoBuilder_ == null) {
          return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        } else {
          return motionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public Builder setMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public Builder setMotionInfo(
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public Builder mergeMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (motionInfo_ != null) {
            motionInfo_ =
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.newBuilder(motionInfo_).mergeFrom(value).buildPartial();
          } else {
            motionInfo_ = value;
          }
          onChanged();
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public Builder clearMotionInfo() {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
          onChanged();
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
        if (motionInfoBuilder_ != null) {
          return motionInfoBuilder_.getMessageOrBuilder();
        } else {
          return motionInfo_ == null ?
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        }
      }
      /**
       * <code>.MotionInfo motion_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getMotionInfoFieldBuilder() {
        if (motionInfoBuilder_ == null) {
          motionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getMotionInfo(),
                  getParentForChildren(),
                  isClean());
          motionInfo_ = null;
        }
        return motionInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <pre>
       * OK
       * </pre>
       *
       * <code>uint32 entity_id = 15;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <pre>
       * OK
       * </pre>
       *
       * <code>uint32 entity_id = 15;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * OK
       * </pre>
       *
       * <code>uint32 entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int reliableSeq_ ;
      /**
       * <code>uint32 reliable_seq = 3;</code>
       * @return The reliableSeq.
       */
      @java.lang.Override
      public int getReliableSeq() {
        return reliableSeq_;
      }
      /**
       * <code>uint32 reliable_seq = 3;</code>
       * @param value The reliableSeq to set.
       * @return This builder for chaining.
       */
      public Builder setReliableSeq(int value) {
        
        reliableSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliable_seq = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliableSeq() {
        
        reliableSeq_ = 0;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 4;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 4;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityMoveNotify)
    private static final emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify();
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityMoveNotify>() {
      @java.lang.Override
      public SceneEntityMoveNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntityMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneEntityMoveNotify.proto\032\020MotionInf" +
      "o.proto\"v\n\025SceneEntityMoveNotify\022 \n\013moti" +
      "on_info\030\001 \001(\0132\013.MotionInfo\022\021\n\tentity_id\030" +
      "\017 \001(\r\022\024\n\014reliable_seq\030\003 \001(\r\022\022\n\nscene_tim" +
      "e\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityMoveNotify_descriptor,
        new java.lang.String[] { "MotionInfo", "EntityId", "ReliableSeq", "SceneTime", });
    emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
