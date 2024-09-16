// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonSlipRevivePointActivateReq.proto

package emu.grasscutter.net.proto;

public final class DungeonSlipRevivePointActivateReqOuterClass {
  private DungeonSlipRevivePointActivateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonSlipRevivePointActivateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonSlipRevivePointActivateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 slip_revive_point_id = 12;</code>
     * @return The slipRevivePointId.
     */
    int getSlipRevivePointId();
  }
  /**
   * <pre>
   * CmdId: 8721
   * Obf: NMHIJGEDOLK
   * </pre>
   *
   * Protobuf type {@code DungeonSlipRevivePointActivateReq}
   */
  public static final class DungeonSlipRevivePointActivateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonSlipRevivePointActivateReq)
      DungeonSlipRevivePointActivateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonSlipRevivePointActivateReq.newBuilder() to construct.
    private DungeonSlipRevivePointActivateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonSlipRevivePointActivateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonSlipRevivePointActivateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonSlipRevivePointActivateReq(
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
            case 96: {

              slipRevivePointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.internal_static_DungeonSlipRevivePointActivateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.internal_static_DungeonSlipRevivePointActivateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.Builder.class);
    }

    public static final int SLIP_REVIVE_POINT_ID_FIELD_NUMBER = 12;
    private int slipRevivePointId_;
    /**
     * <code>uint32 slip_revive_point_id = 12;</code>
     * @return The slipRevivePointId.
     */
    @java.lang.Override
    public int getSlipRevivePointId() {
      return slipRevivePointId_;
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
      if (slipRevivePointId_ != 0) {
        output.writeUInt32(12, slipRevivePointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slipRevivePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, slipRevivePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq other = (emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq) obj;

      if (getSlipRevivePointId()
          != other.getSlipRevivePointId()) return false;
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
      hash = (37 * hash) + SLIP_REVIVE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlipRevivePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq prototype) {
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
     * CmdId: 8721
     * Obf: NMHIJGEDOLK
     * </pre>
     *
     * Protobuf type {@code DungeonSlipRevivePointActivateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonSlipRevivePointActivateReq)
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.internal_static_DungeonSlipRevivePointActivateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.internal_static_DungeonSlipRevivePointActivateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.newBuilder()
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
        slipRevivePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.internal_static_DungeonSlipRevivePointActivateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq build() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq buildPartial() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq result = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq(this);
        result.slipRevivePointId_ = slipRevivePointId_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq other) {
        if (other == emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq.getDefaultInstance()) return this;
        if (other.getSlipRevivePointId() != 0) {
          setSlipRevivePointId(other.getSlipRevivePointId());
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
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int slipRevivePointId_ ;
      /**
       * <code>uint32 slip_revive_point_id = 12;</code>
       * @return The slipRevivePointId.
       */
      @java.lang.Override
      public int getSlipRevivePointId() {
        return slipRevivePointId_;
      }
      /**
       * <code>uint32 slip_revive_point_id = 12;</code>
       * @param value The slipRevivePointId to set.
       * @return This builder for chaining.
       */
      public Builder setSlipRevivePointId(int value) {
        
        slipRevivePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slip_revive_point_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlipRevivePointId() {
        
        slipRevivePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonSlipRevivePointActivateReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonSlipRevivePointActivateReq)
    private static final emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq();
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonSlipRevivePointActivateReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonSlipRevivePointActivateReq>() {
      @java.lang.Override
      public DungeonSlipRevivePointActivateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonSlipRevivePointActivateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonSlipRevivePointActivateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonSlipRevivePointActivateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateReqOuterClass.DungeonSlipRevivePointActivateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonSlipRevivePointActivateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonSlipRevivePointActivateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'DungeonSlipRevivePointActivateReq.prot" +
      "o\"A\n!DungeonSlipRevivePointActivateReq\022\034" +
      "\n\024slip_revive_point_id\030\014 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonSlipRevivePointActivateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonSlipRevivePointActivateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonSlipRevivePointActivateReq_descriptor,
        new java.lang.String[] { "SlipRevivePointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
