// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerLogoutReq.proto

package emu.grasscutter.net.proto;

public final class PlayerLogoutReqOuterClass {
  private PlayerLogoutReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerLogoutReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerLogoutReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerLogoutReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerLogoutReason reason = 11;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason getReason();
  }
  /**
   * Protobuf type {@code PlayerLogoutReq}
   */
  public static final class PlayerLogoutReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerLogoutReq)
      PlayerLogoutReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerLogoutReq.newBuilder() to construct.
    private PlayerLogoutReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerLogoutReq() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerLogoutReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.class, emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 11;
    private int reason_;
    /**
     * <code>.PlayerLogoutReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerLogoutReason reason = 11;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason result = emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.DISCONNECT.getNumber()) {
        output.writeEnum(11, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.DISCONNECT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq other = (emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq) obj;

      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq prototype) {
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
     * Protobuf type {@code PlayerLogoutReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerLogoutReq)
        emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.class, emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.internal_static_PlayerLogoutReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq build() {
        emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq buildPartial() {
        emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq result = new emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq(this);
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq other) {
        if (other == emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
              case 88: {
                reason_ = input.readEnum();

                break;
              } // case 88
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

      private int reason_ = 0;
      /**
       * <code>.PlayerLogoutReason reason = 11;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerLogoutReason reason = 11;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerLogoutReason reason = 11;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason result = emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerLogoutReason reason = 11;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.PlayerLogoutReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerLogoutReason reason = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerLogoutReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerLogoutReq)
    private static final emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq();
    }

    public static emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerLogoutReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerLogoutReq>() {
      @java.lang.Override
      public PlayerLogoutReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerLogoutReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerLogoutReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLogoutReqOuterClass.PlayerLogoutReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerLogoutReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerLogoutReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PlayerLogoutReq.proto\032\030PlayerLogoutRea" +
      "son.proto\"6\n\017PlayerLogoutReq\022#\n\006reason\030\013" +
      " \001(\0162\023.PlayerLogoutReasonB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerLogoutReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerLogoutReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerLogoutReq_descriptor,
        new java.lang.String[] { "Reason", });
    emu.grasscutter.net.proto.PlayerLogoutReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
