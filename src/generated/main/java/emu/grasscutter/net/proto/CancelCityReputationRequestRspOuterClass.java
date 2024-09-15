// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CancelCityReputationRequestRsp.proto

package emu.grasscutter.net.proto;

public final class CancelCityReputationRequestRspOuterClass {
  private CancelCityReputationRequestRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelCityReputationRequestRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CancelCityReputationRequestRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 city_id = 9;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>uint32 request_id = 14;</code>
     * @return The requestId.
     */
    int getRequestId();
  }
  /**
   * <pre>
   * CmdId: 7826
   * Obf: MPONNLFBBMO
   * </pre>
   *
   * Protobuf type {@code CancelCityReputationRequestRsp}
   */
  public static final class CancelCityReputationRequestRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CancelCityReputationRequestRsp)
      CancelCityReputationRequestRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelCityReputationRequestRsp.newBuilder() to construct.
    private CancelCityReputationRequestRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelCityReputationRequestRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelCityReputationRequestRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CancelCityReputationRequestRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              cityId_ = input.readUInt32();
              break;
            }
            case 112: {

              requestId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.internal_static_CancelCityReputationRequestRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.internal_static_CancelCityReputationRequestRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.class, emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CITY_ID_FIELD_NUMBER = 9;
    private int cityId_;
    /**
     * <code>uint32 city_id = 9;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 14;
    private int requestId_;
    /**
     * <code>uint32 request_id = 14;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
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
        output.writeInt32(5, retcode_);
      }
      if (cityId_ != 0) {
        output.writeUInt32(9, cityId_);
      }
      if (requestId_ != 0) {
        output.writeUInt32(14, requestId_);
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
          .computeInt32Size(5, retcode_);
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cityId_);
      }
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, requestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp other = (emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCityId()
          != other.getCityId()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
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
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp prototype) {
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
     * CmdId: 7826
     * Obf: MPONNLFBBMO
     * </pre>
     *
     * Protobuf type {@code CancelCityReputationRequestRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CancelCityReputationRequestRsp)
        emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.internal_static_CancelCityReputationRequestRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.internal_static_CancelCityReputationRequestRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.class, emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.newBuilder()
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

        cityId_ = 0;

        requestId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.internal_static_CancelCityReputationRequestRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp build() {
        emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp buildPartial() {
        emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp result = new emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp(this);
        result.retcode_ = retcode_;
        result.cityId_ = cityId_;
        result.requestId_ = requestId_;
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
        if (other instanceof emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp) {
          return mergeFrom((emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp other) {
        if (other == emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
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
        emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 9;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 9;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private int requestId_ ;
      /**
       * <code>uint32 request_id = 14;</code>
       * @return The requestId.
       */
      @java.lang.Override
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>uint32 request_id = 14;</code>
       * @param value The requestId to set.
       * @return This builder for chaining.
       */
      public Builder setRequestId(int value) {
        
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 request_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestId() {
        
        requestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CancelCityReputationRequestRsp)
    }

    // @@protoc_insertion_point(class_scope:CancelCityReputationRequestRsp)
    private static final emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp();
    }

    public static emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelCityReputationRequestRsp>
        PARSER = new com.google.protobuf.AbstractParser<CancelCityReputationRequestRsp>() {
      @java.lang.Override
      public CancelCityReputationRequestRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CancelCityReputationRequestRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CancelCityReputationRequestRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelCityReputationRequestRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CancelCityReputationRequestRspOuterClass.CancelCityReputationRequestRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CancelCityReputationRequestRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CancelCityReputationRequestRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$CancelCityReputationRequestRsp.proto\"V" +
      "\n\036CancelCityReputationRequestRsp\022\017\n\007retc" +
      "ode\030\005 \001(\005\022\017\n\007city_id\030\t \001(\r\022\022\n\nrequest_id" +
      "\030\016 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CancelCityReputationRequestRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CancelCityReputationRequestRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CancelCityReputationRequestRsp_descriptor,
        new java.lang.String[] { "Retcode", "CityId", "RequestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
