// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryReviveAvatarReq.proto

package emu.grasscutter.net.proto;

public final class RogueDiaryReviveAvatarReqOuterClass {
  private RogueDiaryReviveAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryReviveAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryReviveAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     * @return Whether the reviveAvatar field is set.
     */
    boolean hasReviveAvatar();
    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     * @return The reviveAvatar.
     */
    emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReviveAvatar();
    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     */
    emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReviveAvatarOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 27544
   * </pre>
   *
   * Protobuf type {@code RogueDiaryReviveAvatarReq}
   */
  public static final class RogueDiaryReviveAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryReviveAvatarReq)
      RogueDiaryReviveAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryReviveAvatarReq.newBuilder() to construct.
    private RogueDiaryReviveAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryReviveAvatarReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryReviveAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.internal_static_RogueDiaryReviveAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.internal_static_RogueDiaryReviveAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.class, emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.Builder.class);
    }

    public static final int REVIVE_AVATAR_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar reviveAvatar_;
    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     * @return Whether the reviveAvatar field is set.
     */
    @java.lang.Override
    public boolean hasReviveAvatar() {
      return reviveAvatar_ != null;
    }
    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     * @return The reviveAvatar.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReviveAvatar() {
      return reviveAvatar_ == null ? emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance() : reviveAvatar_;
    }
    /**
     * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReviveAvatarOrBuilder() {
      return getReviveAvatar();
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
      if (reviveAvatar_ != null) {
        output.writeMessage(10, getReviveAvatar());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reviveAvatar_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getReviveAvatar());
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
      if (!(obj instanceof emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq other = (emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq) obj;

      if (hasReviveAvatar() != other.hasReviveAvatar()) return false;
      if (hasReviveAvatar()) {
        if (!getReviveAvatar()
            .equals(other.getReviveAvatar())) return false;
      }
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
      if (hasReviveAvatar()) {
        hash = (37 * hash) + REVIVE_AVATAR_FIELD_NUMBER;
        hash = (53 * hash) + getReviveAvatar().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq prototype) {
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
     * CmdId: 27544
     * </pre>
     *
     * Protobuf type {@code RogueDiaryReviveAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryReviveAvatarReq)
        emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.internal_static_RogueDiaryReviveAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.internal_static_RogueDiaryReviveAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.class, emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reviveAvatarBuilder_ == null) {
          reviveAvatar_ = null;
        } else {
          reviveAvatar_ = null;
          reviveAvatarBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.internal_static_RogueDiaryReviveAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq build() {
        emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq buildPartial() {
        emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq result = new emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq(this);
        if (reviveAvatarBuilder_ == null) {
          result.reviveAvatar_ = reviveAvatar_;
        } else {
          result.reviveAvatar_ = reviveAvatarBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq) {
          return mergeFrom((emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq other) {
        if (other == emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq.getDefaultInstance()) return this;
        if (other.hasReviveAvatar()) {
          mergeReviveAvatar(other.getReviveAvatar());
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
              case 82: {
                input.readMessage(
                    getReviveAvatarFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
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

      private emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar reviveAvatar_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> reviveAvatarBuilder_;
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       * @return Whether the reviveAvatar field is set.
       */
      public boolean hasReviveAvatar() {
        return reviveAvatarBuilder_ != null || reviveAvatar_ != null;
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       * @return The reviveAvatar.
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar getReviveAvatar() {
        if (reviveAvatarBuilder_ == null) {
          return reviveAvatar_ == null ? emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance() : reviveAvatar_;
        } else {
          return reviveAvatarBuilder_.getMessage();
        }
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public Builder setReviveAvatar(emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (reviveAvatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reviveAvatar_ = value;
          onChanged();
        } else {
          reviveAvatarBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public Builder setReviveAvatar(
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (reviveAvatarBuilder_ == null) {
          reviveAvatar_ = builderForValue.build();
          onChanged();
        } else {
          reviveAvatarBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public Builder mergeReviveAvatar(emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (reviveAvatarBuilder_ == null) {
          if (reviveAvatar_ != null) {
            reviveAvatar_ =
              emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.newBuilder(reviveAvatar_).mergeFrom(value).buildPartial();
          } else {
            reviveAvatar_ = value;
          }
          onChanged();
        } else {
          reviveAvatarBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public Builder clearReviveAvatar() {
        if (reviveAvatarBuilder_ == null) {
          reviveAvatar_ = null;
          onChanged();
        } else {
          reviveAvatar_ = null;
          reviveAvatarBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder getReviveAvatarBuilder() {
        
        onChanged();
        return getReviveAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getReviveAvatarOrBuilder() {
        if (reviveAvatarBuilder_ != null) {
          return reviveAvatarBuilder_.getMessageOrBuilder();
        } else {
          return reviveAvatar_ == null ?
              emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance() : reviveAvatar_;
        }
      }
      /**
       * <code>.RogueDiaryAvatar revive_avatar = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
          getReviveAvatarFieldBuilder() {
        if (reviveAvatarBuilder_ == null) {
          reviveAvatarBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder>(
                  getReviveAvatar(),
                  getParentForChildren(),
                  isClean());
          reviveAvatar_ = null;
        }
        return reviveAvatarBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryReviveAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryReviveAvatarReq)
    private static final emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq();
    }

    public static emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryReviveAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryReviveAvatarReq>() {
      @java.lang.Override
      public RogueDiaryReviveAvatarReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryReviveAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryReviveAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryReviveAvatarReqOuterClass.RogueDiaryReviveAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryReviveAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryReviveAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037RogueDiaryReviveAvatarReq.proto\032\026Rogue" +
      "DiaryAvatar.proto\"E\n\031RogueDiaryReviveAva" +
      "tarReq\022(\n\rrevive_avatar\030\n \001(\0132\021.RogueDia" +
      "ryAvatarB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.getDescriptor(),
        });
    internal_static_RogueDiaryReviveAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryReviveAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryReviveAvatarReq_descriptor,
        new java.lang.String[] { "ReviveAvatar", });
    emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
