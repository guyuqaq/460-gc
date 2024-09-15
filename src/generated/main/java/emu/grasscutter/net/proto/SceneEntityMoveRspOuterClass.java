// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityMoveRsp.proto

package emu.grasscutter.net.proto;

public final class SceneEntityMoveRspOuterClass {
  private SceneEntityMoveRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityMoveRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityMoveRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 scene_time = 6;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 reliable_seq = 7;</code>
     * @return The reliableSeq.
     */
    int getReliableSeq();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     * @return Whether the failMotion field is set.
     */
    boolean hasFailMotion();
    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     * @return The failMotion.
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getFailMotion();
    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getFailMotionOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 9718
   * </pre>
   *
   * Protobuf type {@code SceneEntityMoveRsp}
   */
  public static final class SceneEntityMoveRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityMoveRsp)
      SceneEntityMoveRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityMoveRsp.newBuilder() to construct.
    private SceneEntityMoveRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityMoveRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityMoveRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneEntityMoveRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              sceneTime_ = input.readUInt32();
              break;
            }
            case 56: {

              reliableSeq_ = input.readUInt32();
              break;
            }
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
              if (failMotion_ != null) {
                subBuilder = failMotion_.toBuilder();
              }
              failMotion_ = input.readMessage(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(failMotion_);
                failMotion_ = subBuilder.buildPartial();
              }

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.internal_static_SceneEntityMoveRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.internal_static_SceneEntityMoveRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.class, emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 6;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 6;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int RELIABLE_SEQ_FIELD_NUMBER = 7;
    private int reliableSeq_;
    /**
     * <code>uint32 reliable_seq = 7;</code>
     * @return The reliableSeq.
     */
    @java.lang.Override
    public int getReliableSeq() {
      return reliableSeq_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FAIL_MOTION_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo failMotion_;
    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     * @return Whether the failMotion field is set.
     */
    @java.lang.Override
    public boolean hasFailMotion() {
      return failMotion_ != null;
    }
    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     * @return The failMotion.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getFailMotion() {
      return failMotion_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : failMotion_;
    }
    /**
     * <code>.MotionInfo fail_motion = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getFailMotionOrBuilder() {
      return getFailMotion();
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(6, sceneTime_);
      }
      if (reliableSeq_ != 0) {
        output.writeUInt32(7, reliableSeq_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (failMotion_ != null) {
        output.writeMessage(15, getFailMotion());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneTime_);
      }
      if (reliableSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, reliableSeq_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (failMotion_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getFailMotion());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp other = (emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getReliableSeq()
          != other.getReliableSeq()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasFailMotion() != other.hasFailMotion()) return false;
      if (hasFailMotion()) {
        if (!getFailMotion()
            .equals(other.getFailMotion())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + RELIABLE_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getReliableSeq();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasFailMotion()) {
        hash = (37 * hash) + FAIL_MOTION_FIELD_NUMBER;
        hash = (53 * hash) + getFailMotion().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp prototype) {
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
     * CmdId: 9718
     * </pre>
     *
     * Protobuf type {@code SceneEntityMoveRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityMoveRsp)
        emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.internal_static_SceneEntityMoveRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.internal_static_SceneEntityMoveRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.class, emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        sceneTime_ = 0;

        reliableSeq_ = 0;

        entityId_ = 0;

        if (failMotionBuilder_ == null) {
          failMotion_ = null;
        } else {
          failMotion_ = null;
          failMotionBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.internal_static_SceneEntityMoveRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp build() {
        emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp buildPartial() {
        emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp result = new emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp(this);
        result.retcode_ = retcode_;
        result.sceneTime_ = sceneTime_;
        result.reliableSeq_ = reliableSeq_;
        result.entityId_ = entityId_;
        if (failMotionBuilder_ == null) {
          result.failMotion_ = failMotion_;
        } else {
          result.failMotion_ = failMotionBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp other) {
        if (other == emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getReliableSeq() != 0) {
          setReliableSeq(other.getReliableSeq());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasFailMotion()) {
          mergeFailMotion(other.getFailMotion());
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
        emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 6;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 6;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int reliableSeq_ ;
      /**
       * <code>uint32 reliable_seq = 7;</code>
       * @return The reliableSeq.
       */
      @java.lang.Override
      public int getReliableSeq() {
        return reliableSeq_;
      }
      /**
       * <code>uint32 reliable_seq = 7;</code>
       * @param value The reliableSeq to set.
       * @return This builder for chaining.
       */
      public Builder setReliableSeq(int value) {
        
        reliableSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliable_seq = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliableSeq() {
        
        reliableSeq_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo failMotion_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> failMotionBuilder_;
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       * @return Whether the failMotion field is set.
       */
      public boolean hasFailMotion() {
        return failMotionBuilder_ != null || failMotion_ != null;
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       * @return The failMotion.
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getFailMotion() {
        if (failMotionBuilder_ == null) {
          return failMotion_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : failMotion_;
        } else {
          return failMotionBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public Builder setFailMotion(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (failMotionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          failMotion_ = value;
          onChanged();
        } else {
          failMotionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public Builder setFailMotion(
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (failMotionBuilder_ == null) {
          failMotion_ = builderForValue.build();
          onChanged();
        } else {
          failMotionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public Builder mergeFailMotion(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (failMotionBuilder_ == null) {
          if (failMotion_ != null) {
            failMotion_ =
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.newBuilder(failMotion_).mergeFrom(value).buildPartial();
          } else {
            failMotion_ = value;
          }
          onChanged();
        } else {
          failMotionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public Builder clearFailMotion() {
        if (failMotionBuilder_ == null) {
          failMotion_ = null;
          onChanged();
        } else {
          failMotion_ = null;
          failMotionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder getFailMotionBuilder() {
        
        onChanged();
        return getFailMotionFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getFailMotionOrBuilder() {
        if (failMotionBuilder_ != null) {
          return failMotionBuilder_.getMessageOrBuilder();
        } else {
          return failMotion_ == null ?
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : failMotion_;
        }
      }
      /**
       * <code>.MotionInfo fail_motion = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getFailMotionFieldBuilder() {
        if (failMotionBuilder_ == null) {
          failMotionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getFailMotion(),
                  getParentForChildren(),
                  isClean());
          failMotion_ = null;
        }
        return failMotionBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityMoveRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityMoveRsp)
    private static final emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp();
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityMoveRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityMoveRsp>() {
      @java.lang.Override
      public SceneEntityMoveRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneEntityMoveRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneEntityMoveRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityMoveRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityMoveRspOuterClass.SceneEntityMoveRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityMoveRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityMoveRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SceneEntityMoveRsp.proto\032\020MotionInfo.p" +
      "roto\"\204\001\n\022SceneEntityMoveRsp\022\017\n\007retcode\030\001" +
      " \001(\005\022\022\n\nscene_time\030\006 \001(\r\022\024\n\014reliable_seq" +
      "\030\007 \001(\r\022\021\n\tentity_id\030\n \001(\r\022 \n\013fail_motion" +
      "\030\017 \001(\0132\013.MotionInfoB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityMoveRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityMoveRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityMoveRsp_descriptor,
        new java.lang.String[] { "Retcode", "SceneTime", "ReliableSeq", "EntityId", "FailMotion", });
    emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
