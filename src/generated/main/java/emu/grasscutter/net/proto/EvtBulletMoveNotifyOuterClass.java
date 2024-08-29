// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBulletMoveNotify.proto

package emu.grasscutter.net.proto;

public final class EvtBulletMoveNotifyOuterClass {
  private EvtBulletMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBulletMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBulletMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector cur_pos = 14;</code>
     * @return Whether the curPos field is set.
     */
    boolean hasCurPos();
    /**
     * <code>.Vector cur_pos = 14;</code>
     * @return The curPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos();
    /**
     * <code>.Vector cur_pos = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder();

    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 24493x,28844x,24809?,3013x?
   * Obf: BKFCEHKJCCA
   * </pre>
   *
   * Protobuf type {@code EvtBulletMoveNotify}
   */
  public static final class EvtBulletMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBulletMoveNotify)
      EvtBulletMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBulletMoveNotify.newBuilder() to construct.
    private EvtBulletMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBulletMoveNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBulletMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.internal_static_EvtBulletMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.internal_static_EvtBulletMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.class, emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.Builder.class);
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

    public static final int CUR_POS_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector curPos_;
    /**
     * <code>.Vector cur_pos = 14;</code>
     * @return Whether the curPos field is set.
     */
    @java.lang.Override
    public boolean hasCurPos() {
      return curPos_ != null;
    }
    /**
     * <code>.Vector cur_pos = 14;</code>
     * @return The curPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos() {
      return curPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
    }
    /**
     * <code>.Vector cur_pos = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
      return getCurPos();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 2;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 2;</code>
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
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(2, forwardType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (curPos_ != null) {
        output.writeMessage(14, getCurPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, forwardType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (curPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getCurPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify other = (emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasCurPos() != other.hasCurPos()) return false;
      if (hasCurPos()) {
        if (!getCurPos()
            .equals(other.getCurPos())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasCurPos()) {
        hash = (37 * hash) + CUR_POS_FIELD_NUMBER;
        hash = (53 * hash) + getCurPos().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify prototype) {
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
     * CmdId: 24493x,28844x,24809?,3013x?
     * Obf: BKFCEHKJCCA
     * </pre>
     *
     * Protobuf type {@code EvtBulletMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBulletMoveNotify)
        emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.internal_static_EvtBulletMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.internal_static_EvtBulletMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.class, emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        if (curPosBuilder_ == null) {
          curPos_ = null;
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.internal_static_EvtBulletMoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify build() {
        emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify buildPartial() {
        emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify result = new emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify(this);
        result.entityId_ = entityId_;
        if (curPosBuilder_ == null) {
          result.curPos_ = curPos_;
        } else {
          result.curPos_ = curPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify other) {
        if (other == emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasCurPos()) {
          mergeCurPos(other.getCurPos());
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
              case 16: {
                forwardType_ = input.readEnum();

                break;
              } // case 16
              case 80: {
                entityId_ = input.readUInt32();

                break;
              } // case 80
              case 114: {
                input.readMessage(
                    getCurPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 114
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector curPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> curPosBuilder_;
      /**
       * <code>.Vector cur_pos = 14;</code>
       * @return Whether the curPos field is set.
       */
      public boolean hasCurPos() {
        return curPosBuilder_ != null || curPos_ != null;
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       * @return The curPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos() {
        if (curPosBuilder_ == null) {
          return curPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        } else {
          return curPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public Builder setCurPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curPos_ = value;
          onChanged();
        } else {
          curPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public Builder setCurPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (curPosBuilder_ == null) {
          curPos_ = builderForValue.build();
          onChanged();
        } else {
          curPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public Builder mergeCurPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (curPos_ != null) {
            curPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(curPos_).mergeFrom(value).buildPartial();
          } else {
            curPos_ = value;
          }
          onChanged();
        } else {
          curPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public Builder clearCurPos() {
        if (curPosBuilder_ == null) {
          curPos_ = null;
          onChanged();
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCurPosBuilder() {
        
        onChanged();
        return getCurPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
        if (curPosBuilder_ != null) {
          return curPosBuilder_.getMessageOrBuilder();
        } else {
          return curPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        }
      }
      /**
       * <code>.Vector cur_pos = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCurPosFieldBuilder() {
        if (curPosBuilder_ == null) {
          curPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCurPos(),
                  getParentForChildren(),
                  isClean());
          curPos_ = null;
        }
        return curPosBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
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
       * <code>.ForwardType forward_type = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:EvtBulletMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBulletMoveNotify)
    private static final emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify();
    }

    public static emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBulletMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBulletMoveNotify>() {
      @java.lang.Override
      public EvtBulletMoveNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtBulletMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBulletMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBulletMoveNotifyOuterClass.EvtBulletMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBulletMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBulletMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031EvtBulletMoveNotify.proto\032\014Vector.prot" +
      "o\032\021ForwardType.proto\"f\n\023EvtBulletMoveNot" +
      "ify\022\021\n\tentity_id\030\n \001(\r\022\030\n\007cur_pos\030\016 \001(\0132" +
      "\007.Vector\022\"\n\014forward_type\030\002 \001(\0162\014.Forward" +
      "TypeB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtBulletMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBulletMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBulletMoveNotify_descriptor,
        new java.lang.String[] { "EntityId", "CurPos", "ForwardType", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
