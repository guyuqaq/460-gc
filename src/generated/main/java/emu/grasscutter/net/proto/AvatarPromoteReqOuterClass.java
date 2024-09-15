// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPromoteReq.proto

package emu.grasscutter.net.proto;

public final class AvatarPromoteReqOuterClass {
  private AvatarPromoteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPromoteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPromoteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 guid = 8;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * <pre>
   * CmdId: 21972
   * </pre>
   *
   * Protobuf type {@code AvatarPromoteReq}
   */
  public static final class AvatarPromoteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPromoteReq)
      AvatarPromoteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPromoteReq.newBuilder() to construct.
    private AvatarPromoteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPromoteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPromoteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarPromoteReq(
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
            case 64: {

              guid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.internal_static_AvatarPromoteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.internal_static_AvatarPromoteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.class, emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.Builder.class);
    }

    public static final int GUID_FIELD_NUMBER = 8;
    private long guid_;
    /**
     * <code>uint64 guid = 8;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
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
      if (guid_ != 0L) {
        output.writeUInt64(8, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq other = (emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq) obj;

      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq prototype) {
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
     * CmdId: 21972
     * </pre>
     *
     * Protobuf type {@code AvatarPromoteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPromoteReq)
        emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.internal_static_AvatarPromoteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.internal_static_AvatarPromoteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.class, emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.newBuilder()
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
        guid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.internal_static_AvatarPromoteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq build() {
        emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq buildPartial() {
        emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq result = new emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq(this);
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq other) {
        if (other == emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq.getDefaultInstance()) return this;
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
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
        emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 8;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 8;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarPromoteReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarPromoteReq)
    private static final emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq();
    }

    public static emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPromoteReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPromoteReq>() {
      @java.lang.Override
      public AvatarPromoteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarPromoteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarPromoteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPromoteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarPromoteReqOuterClass.AvatarPromoteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPromoteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPromoteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AvatarPromoteReq.proto\" \n\020AvatarPromot" +
      "eReq\022\014\n\004guid\030\010 \001(\004B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarPromoteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPromoteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPromoteReq_descriptor,
        new java.lang.String[] { "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
