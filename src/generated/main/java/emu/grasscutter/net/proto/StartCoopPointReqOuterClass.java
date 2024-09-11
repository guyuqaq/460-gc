// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartCoopPointReq.proto

package emu.grasscutter.net.proto;

public final class StartCoopPointReqOuterClass {
  private StartCoopPointReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartCoopPointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartCoopPointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coop_point = 7;</code>
     * @return The coopPoint.
     */
    int getCoopPoint();
  }
  /**
   * <pre>
   * CmdId: 27436
   * obf: PPGIKABMIAK
   * </pre>
   *
   * Protobuf type {@code StartCoopPointReq}
   */
  public static final class StartCoopPointReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartCoopPointReq)
      StartCoopPointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartCoopPointReq.newBuilder() to construct.
    private StartCoopPointReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartCoopPointReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartCoopPointReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.internal_static_StartCoopPointReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.internal_static_StartCoopPointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.class, emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.Builder.class);
    }

    public static final int COOP_POINT_FIELD_NUMBER = 7;
    private int coopPoint_;
    /**
     * <code>uint32 coop_point = 7;</code>
     * @return The coopPoint.
     */
    @java.lang.Override
    public int getCoopPoint() {
      return coopPoint_;
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
      if (coopPoint_ != 0) {
        output.writeUInt32(7, coopPoint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coopPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, coopPoint_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq other = (emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq) obj;

      if (getCoopPoint()
          != other.getCoopPoint()) return false;
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
      hash = (37 * hash) + COOP_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getCoopPoint();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq prototype) {
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
     * CmdId: 27436
     * obf: PPGIKABMIAK
     * </pre>
     *
     * Protobuf type {@code StartCoopPointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartCoopPointReq)
        emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.internal_static_StartCoopPointReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.internal_static_StartCoopPointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.class, emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        coopPoint_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.internal_static_StartCoopPointReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq build() {
        emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq buildPartial() {
        emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq result = new emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq(this);
        result.coopPoint_ = coopPoint_;
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
        if (other instanceof emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq) {
          return mergeFrom((emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq other) {
        if (other == emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq.getDefaultInstance()) return this;
        if (other.getCoopPoint() != 0) {
          setCoopPoint(other.getCoopPoint());
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
              case 56: {
                coopPoint_ = input.readUInt32();

                break;
              } // case 56
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

      private int coopPoint_ ;
      /**
       * <code>uint32 coop_point = 7;</code>
       * @return The coopPoint.
       */
      @java.lang.Override
      public int getCoopPoint() {
        return coopPoint_;
      }
      /**
       * <code>uint32 coop_point = 7;</code>
       * @param value The coopPoint to set.
       * @return This builder for chaining.
       */
      public Builder setCoopPoint(int value) {
        
        coopPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coop_point = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoopPoint() {
        
        coopPoint_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartCoopPointReq)
    }

    // @@protoc_insertion_point(class_scope:StartCoopPointReq)
    private static final emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq();
    }

    public static emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartCoopPointReq>
        PARSER = new com.google.protobuf.AbstractParser<StartCoopPointReq>() {
      @java.lang.Override
      public StartCoopPointReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartCoopPointReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartCoopPointReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StartCoopPointReqOuterClass.StartCoopPointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartCoopPointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartCoopPointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027StartCoopPointReq.proto\"\'\n\021StartCoopPo" +
      "intReq\022\022\n\ncoop_point\030\007 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartCoopPointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartCoopPointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartCoopPointReq_descriptor,
        new java.lang.String[] { "CoopPoint", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
