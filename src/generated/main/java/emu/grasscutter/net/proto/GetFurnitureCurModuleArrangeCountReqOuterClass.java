// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetFurnitureCurModuleArrangeCountReq.proto

package emu.grasscutter.net.proto;

public final class GetFurnitureCurModuleArrangeCountReqOuterClass {
  private GetFurnitureCurModuleArrangeCountReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFurnitureCurModuleArrangeCountReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFurnitureCurModuleArrangeCountReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code GetFurnitureCurModuleArrangeCountReq}
   */
  public static final class GetFurnitureCurModuleArrangeCountReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFurnitureCurModuleArrangeCountReq)
      GetFurnitureCurModuleArrangeCountReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFurnitureCurModuleArrangeCountReq.newBuilder() to construct.
    private GetFurnitureCurModuleArrangeCountReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFurnitureCurModuleArrangeCountReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetFurnitureCurModuleArrangeCountReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.internal_static_GetFurnitureCurModuleArrangeCountReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.class, emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq other = (emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq prototype) {
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
     * Protobuf type {@code GetFurnitureCurModuleArrangeCountReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFurnitureCurModuleArrangeCountReq)
        emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.internal_static_GetFurnitureCurModuleArrangeCountReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.class, emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq build() {
        emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq buildPartial() {
        emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq result = new emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq(this);
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
        if (other instanceof emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq other) {
        if (other == emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:GetFurnitureCurModuleArrangeCountReq)
    }

    // @@protoc_insertion_point(class_scope:GetFurnitureCurModuleArrangeCountReq)
    private static final emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq();
    }

    public static emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFurnitureCurModuleArrangeCountReq>
        PARSER = new com.google.protobuf.AbstractParser<GetFurnitureCurModuleArrangeCountReq>() {
      @java.lang.Override
      public GetFurnitureCurModuleArrangeCountReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetFurnitureCurModuleArrangeCountReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFurnitureCurModuleArrangeCountReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetFurnitureCurModuleArrangeCountReqOuterClass.GetFurnitureCurModuleArrangeCountReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFurnitureCurModuleArrangeCountReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*GetFurnitureCurModuleArrangeCountReq.p" +
      "roto\"&\n$GetFurnitureCurModuleArrangeCoun" +
      "tReqB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFurnitureCurModuleArrangeCountReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFurnitureCurModuleArrangeCountReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
