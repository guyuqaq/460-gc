// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtFaceToDirNotify.proto

package emu.grasscutter.net.proto;

public final class EvtFaceToDirNotifyOuterClass {
  private EvtFaceToDirNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtFaceToDirNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtFaceToDirNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     * @return Whether the evtFaceToDirInfo field is set.
     */
    boolean hasEvtFaceToDirInfo();
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     * @return The evtFaceToDirInfo.
     */
    emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo();
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     */
    emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder();

    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * CmdId: 3850
   * Obf: ONOKEAPFKHE
   * </pre>
   *
   * Protobuf type {@code EvtFaceToDirNotify}
   */
  public static final class EvtFaceToDirNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtFaceToDirNotify)
      EvtFaceToDirNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtFaceToDirNotify.newBuilder() to construct.
    private EvtFaceToDirNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtFaceToDirNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtFaceToDirNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtFaceToDirNotify(
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
            case 50: {
              emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder subBuilder = null;
              if (evtFaceToDirInfo_ != null) {
                subBuilder = evtFaceToDirInfo_.toBuilder();
              }
              evtFaceToDirInfo_ = input.readMessage(emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(evtFaceToDirInfo_);
                evtFaceToDirInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
      return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.class, emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.Builder.class);
    }

    public static final int EVT_FACE_TO_DIR_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo evtFaceToDirInfo_;
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     * @return Whether the evtFaceToDirInfo field is set.
     */
    @java.lang.Override
    public boolean hasEvtFaceToDirInfo() {
      return evtFaceToDirInfo_ != null;
    }
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     * @return The evtFaceToDirInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo() {
      return evtFaceToDirInfo_ == null ? emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
    }
    /**
     * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder() {
      return getEvtFaceToDirInfo();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 11;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 11;</code>
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
      if (evtFaceToDirInfo_ != null) {
        output.writeMessage(6, getEvtFaceToDirInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(11, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (evtFaceToDirInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getEvtFaceToDirInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify other = (emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) obj;

      if (hasEvtFaceToDirInfo() != other.hasEvtFaceToDirInfo()) return false;
      if (hasEvtFaceToDirInfo()) {
        if (!getEvtFaceToDirInfo()
            .equals(other.getEvtFaceToDirInfo())) return false;
      }
      if (forwardType_ != other.forwardType_) return false;
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
      if (hasEvtFaceToDirInfo()) {
        hash = (37 * hash) + EVT_FACE_TO_DIR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEvtFaceToDirInfo().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify prototype) {
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
     * CmdId: 3850
     * Obf: ONOKEAPFKHE
     * </pre>
     *
     * Protobuf type {@code EvtFaceToDirNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtFaceToDirNotify)
        emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.class, emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.newBuilder()
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
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = null;
        } else {
          evtFaceToDirInfo_ = null;
          evtFaceToDirInfoBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.internal_static_EvtFaceToDirNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify build() {
        emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify buildPartial() {
        emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify result = new emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify(this);
        if (evtFaceToDirInfoBuilder_ == null) {
          result.evtFaceToDirInfo_ = evtFaceToDirInfo_;
        } else {
          result.evtFaceToDirInfo_ = evtFaceToDirInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify other) {
        if (other == emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify.getDefaultInstance()) return this;
        if (other.hasEvtFaceToDirInfo()) {
          mergeEvtFaceToDirInfo(other.getEvtFaceToDirInfo());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
        emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo evtFaceToDirInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder> evtFaceToDirInfoBuilder_;
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       * @return Whether the evtFaceToDirInfo field is set.
       */
      public boolean hasEvtFaceToDirInfo() {
        return evtFaceToDirInfoBuilder_ != null || evtFaceToDirInfo_ != null;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       * @return The evtFaceToDirInfo.
       */
      public emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getEvtFaceToDirInfo() {
        if (evtFaceToDirInfoBuilder_ == null) {
          return evtFaceToDirInfo_ == null ? emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
        } else {
          return evtFaceToDirInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public Builder setEvtFaceToDirInfo(emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo value) {
        if (evtFaceToDirInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          evtFaceToDirInfo_ = value;
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public Builder setEvtFaceToDirInfo(
          emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder builderForValue) {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = builderForValue.build();
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public Builder mergeEvtFaceToDirInfo(emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo value) {
        if (evtFaceToDirInfoBuilder_ == null) {
          if (evtFaceToDirInfo_ != null) {
            evtFaceToDirInfo_ =
              emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.newBuilder(evtFaceToDirInfo_).mergeFrom(value).buildPartial();
          } else {
            evtFaceToDirInfo_ = value;
          }
          onChanged();
        } else {
          evtFaceToDirInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public Builder clearEvtFaceToDirInfo() {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfo_ = null;
          onChanged();
        } else {
          evtFaceToDirInfo_ = null;
          evtFaceToDirInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder getEvtFaceToDirInfoBuilder() {
        
        onChanged();
        return getEvtFaceToDirInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      public emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder getEvtFaceToDirInfoOrBuilder() {
        if (evtFaceToDirInfoBuilder_ != null) {
          return evtFaceToDirInfoBuilder_.getMessageOrBuilder();
        } else {
          return evtFaceToDirInfo_ == null ?
              emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance() : evtFaceToDirInfo_;
        }
      }
      /**
       * <code>.EvtFaceToDirInfo evt_face_to_dir_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder> 
          getEvtFaceToDirInfoFieldBuilder() {
        if (evtFaceToDirInfoBuilder_ == null) {
          evtFaceToDirInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder, emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder>(
                  getEvtFaceToDirInfo(),
                  getParentForChildren(),
                  isClean());
          evtFaceToDirInfo_ = null;
        }
        return evtFaceToDirInfoBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
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
       * <code>.ForwardType forward_type = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:EvtFaceToDirNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtFaceToDirNotify)
    private static final emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify();
    }

    public static emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtFaceToDirNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtFaceToDirNotify>() {
      @java.lang.Override
      public EvtFaceToDirNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtFaceToDirNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtFaceToDirNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtFaceToDirNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtFaceToDirNotifyOuterClass.EvtFaceToDirNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtFaceToDirNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtFaceToDirNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030EvtFaceToDirNotify.proto\032\026EvtFaceToDir" +
      "Info.proto\032\021ForwardType.proto\"i\n\022EvtFace" +
      "ToDirNotify\022/\n\024evt_face_to_dir_info\030\006 \001(" +
      "\0132\021.EvtFaceToDirInfo\022\"\n\014forward_type\030\013 \001" +
      "(\0162\014.ForwardTypeB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtFaceToDirNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtFaceToDirNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtFaceToDirNotify_descriptor,
        new java.lang.String[] { "EvtFaceToDirInfo", "ForwardType", });
    emu.grasscutter.net.proto.EvtFaceToDirInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
