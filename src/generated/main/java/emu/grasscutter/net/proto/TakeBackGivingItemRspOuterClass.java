// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeBackGivingItemRsp.proto

package emu.grasscutter.net.proto;

public final class TakeBackGivingItemRspOuterClass {
  private TakeBackGivingItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeBackGivingItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeBackGivingItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 giving_id = 4;</code>
     * @return The givingId.
     */
    int getGivingId();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 770
   * </pre>
   *
   * Protobuf type {@code TakeBackGivingItemRsp}
   */
  public static final class TakeBackGivingItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeBackGivingItemRsp)
      TakeBackGivingItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeBackGivingItemRsp.newBuilder() to construct.
    private TakeBackGivingItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeBackGivingItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeBackGivingItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeBackGivingItemRsp(
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
            case 32: {

              givingId_ = input.readUInt32();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.internal_static_TakeBackGivingItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.internal_static_TakeBackGivingItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.class, emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.Builder.class);
    }

    public static final int GIVING_ID_FIELD_NUMBER = 4;
    private int givingId_;
    /**
     * <code>uint32 giving_id = 4;</code>
     * @return The givingId.
     */
    @java.lang.Override
    public int getGivingId() {
      return givingId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (givingId_ != 0) {
        output.writeUInt32(4, givingId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (givingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, givingId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp other = (emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp) obj;

      if (getGivingId()
          != other.getGivingId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + GIVING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGivingId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp prototype) {
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
     * CmdId: 770
     * </pre>
     *
     * Protobuf type {@code TakeBackGivingItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeBackGivingItemRsp)
        emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.internal_static_TakeBackGivingItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.internal_static_TakeBackGivingItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.class, emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.newBuilder()
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
        givingId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.internal_static_TakeBackGivingItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp build() {
        emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp buildPartial() {
        emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp result = new emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp(this);
        result.givingId_ = givingId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp other) {
        if (other == emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp.getDefaultInstance()) return this;
        if (other.getGivingId() != 0) {
          setGivingId(other.getGivingId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int givingId_ ;
      /**
       * <code>uint32 giving_id = 4;</code>
       * @return The givingId.
       */
      @java.lang.Override
      public int getGivingId() {
        return givingId_;
      }
      /**
       * <code>uint32 giving_id = 4;</code>
       * @param value The givingId to set.
       * @return This builder for chaining.
       */
      public Builder setGivingId(int value) {
        
        givingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 giving_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGivingId() {
        
        givingId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeBackGivingItemRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeBackGivingItemRsp)
    private static final emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp();
    }

    public static emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeBackGivingItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeBackGivingItemRsp>() {
      @java.lang.Override
      public TakeBackGivingItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeBackGivingItemRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeBackGivingItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeBackGivingItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeBackGivingItemRspOuterClass.TakeBackGivingItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeBackGivingItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeBackGivingItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033TakeBackGivingItemRsp.proto\";\n\025TakeBac" +
      "kGivingItemRsp\022\021\n\tgiving_id\030\004 \001(\r\022\017\n\007ret" +
      "code\030\n \001(\005B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeBackGivingItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeBackGivingItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeBackGivingItemRsp_descriptor,
        new java.lang.String[] { "GivingId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
