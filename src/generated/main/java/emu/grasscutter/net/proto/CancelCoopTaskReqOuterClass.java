// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CancelCoopTaskReq.proto

package emu.grasscutter.net.proto;

public final class CancelCoopTaskReqOuterClass {
  private CancelCoopTaskReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelCoopTaskReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CancelCoopTaskReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 chapter_id = 9;</code>
     * @return The chapterId.
     */
    int getChapterId();
  }
  /**
   * <pre>
   * CmdId: 27925
   * Obf: EGFKMLLMKGB
   * </pre>
   *
   * Protobuf type {@code CancelCoopTaskReq}
   */
  public static final class CancelCoopTaskReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CancelCoopTaskReq)
      CancelCoopTaskReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelCoopTaskReq.newBuilder() to construct.
    private CancelCoopTaskReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelCoopTaskReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CancelCoopTaskReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.internal_static_CancelCoopTaskReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.internal_static_CancelCoopTaskReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.class, emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.Builder.class);
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 9;
    private int chapterId_;
    /**
     * <code>uint32 chapter_id = 9;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
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
      if (chapterId_ != 0) {
        output.writeUInt32(9, chapterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, chapterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq other = (emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq) obj;

      if (getChapterId()
          != other.getChapterId()) return false;
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
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq prototype) {
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
     * CmdId: 27925
     * Obf: EGFKMLLMKGB
     * </pre>
     *
     * Protobuf type {@code CancelCoopTaskReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CancelCoopTaskReq)
        emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.internal_static_CancelCoopTaskReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.internal_static_CancelCoopTaskReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.class, emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        chapterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.internal_static_CancelCoopTaskReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq build() {
        emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq buildPartial() {
        emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq result = new emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq(this);
        result.chapterId_ = chapterId_;
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
        if (other instanceof emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq) {
          return mergeFrom((emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq other) {
        if (other == emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq.getDefaultInstance()) return this;
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
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
              case 72: {
                chapterId_ = input.readUInt32();

                break;
              } // case 72
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

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 9;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 9;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        
        chapterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CancelCoopTaskReq)
    }

    // @@protoc_insertion_point(class_scope:CancelCoopTaskReq)
    private static final emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq();
    }

    public static emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelCoopTaskReq>
        PARSER = new com.google.protobuf.AbstractParser<CancelCoopTaskReq>() {
      @java.lang.Override
      public CancelCoopTaskReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<CancelCoopTaskReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelCoopTaskReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CancelCoopTaskReqOuterClass.CancelCoopTaskReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CancelCoopTaskReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CancelCoopTaskReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CancelCoopTaskReq.proto\"\'\n\021CancelCoopT" +
      "askReq\022\022\n\nchapter_id\030\t \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CancelCoopTaskReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CancelCoopTaskReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CancelCoopTaskReq_descriptor,
        new java.lang.String[] { "ChapterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
