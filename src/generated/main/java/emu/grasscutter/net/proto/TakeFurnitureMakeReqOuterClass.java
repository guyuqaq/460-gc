// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeFurnitureMakeReq.proto

package emu.grasscutter.net.proto;

public final class TakeFurnitureMakeReqOuterClass {
  private TakeFurnitureMakeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeFurnitureMakeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeFurnitureMakeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 make_id = 3;</code>
     * @return The makeId.
     */
    int getMakeId();

    /**
     * <code>uint32 index = 15;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>bool is_fast_finish = 9;</code>
     * @return The isFastFinish.
     */
    boolean getIsFastFinish();
  }
  /**
   * <pre>
   * CmdId: 2795
   * obf: LCDHKFLCNBD
   * </pre>
   *
   * Protobuf type {@code TakeFurnitureMakeReq}
   */
  public static final class TakeFurnitureMakeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeFurnitureMakeReq)
      TakeFurnitureMakeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeFurnitureMakeReq.newBuilder() to construct.
    private TakeFurnitureMakeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeFurnitureMakeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeFurnitureMakeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.class, emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.Builder.class);
    }

    public static final int MAKE_ID_FIELD_NUMBER = 3;
    private int makeId_;
    /**
     * <code>uint32 make_id = 3;</code>
     * @return The makeId.
     */
    @java.lang.Override
    public int getMakeId() {
      return makeId_;
    }

    public static final int INDEX_FIELD_NUMBER = 15;
    private int index_;
    /**
     * <code>uint32 index = 15;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int IS_FAST_FINISH_FIELD_NUMBER = 9;
    private boolean isFastFinish_;
    /**
     * <code>bool is_fast_finish = 9;</code>
     * @return The isFastFinish.
     */
    @java.lang.Override
    public boolean getIsFastFinish() {
      return isFastFinish_;
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
      if (makeId_ != 0) {
        output.writeUInt32(3, makeId_);
      }
      if (isFastFinish_ != false) {
        output.writeBool(9, isFastFinish_);
      }
      if (index_ != 0) {
        output.writeUInt32(15, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (makeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, makeId_);
      }
      if (isFastFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFastFinish_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, index_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq other = (emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq) obj;

      if (getMakeId()
          != other.getMakeId()) return false;
      if (getIndex()
          != other.getIndex()) return false;
      if (getIsFastFinish()
          != other.getIsFastFinish()) return false;
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
      hash = (37 * hash) + MAKE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMakeId();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + IS_FAST_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFastFinish());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq prototype) {
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
     * CmdId: 2795
     * obf: LCDHKFLCNBD
     * </pre>
     *
     * Protobuf type {@code TakeFurnitureMakeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeFurnitureMakeReq)
        emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.class, emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        makeId_ = 0;

        index_ = 0;

        isFastFinish_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.internal_static_TakeFurnitureMakeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq build() {
        emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq buildPartial() {
        emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq result = new emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq(this);
        result.makeId_ = makeId_;
        result.index_ = index_;
        result.isFastFinish_ = isFastFinish_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq other) {
        if (other == emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.getDefaultInstance()) return this;
        if (other.getMakeId() != 0) {
          setMakeId(other.getMakeId());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getIsFastFinish() != false) {
          setIsFastFinish(other.getIsFastFinish());
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
              case 24: {
                makeId_ = input.readUInt32();

                break;
              } // case 24
              case 72: {
                isFastFinish_ = input.readBool();

                break;
              } // case 72
              case 120: {
                index_ = input.readUInt32();

                break;
              } // case 120
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

      private int makeId_ ;
      /**
       * <code>uint32 make_id = 3;</code>
       * @return The makeId.
       */
      @java.lang.Override
      public int getMakeId() {
        return makeId_;
      }
      /**
       * <code>uint32 make_id = 3;</code>
       * @param value The makeId to set.
       * @return This builder for chaining.
       */
      public Builder setMakeId(int value) {
        
        makeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 make_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMakeId() {
        
        makeId_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 15;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 15;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private boolean isFastFinish_ ;
      /**
       * <code>bool is_fast_finish = 9;</code>
       * @return The isFastFinish.
       */
      @java.lang.Override
      public boolean getIsFastFinish() {
        return isFastFinish_;
      }
      /**
       * <code>bool is_fast_finish = 9;</code>
       * @param value The isFastFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFastFinish(boolean value) {
        
        isFastFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_fast_finish = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFastFinish() {
        
        isFastFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:TakeFurnitureMakeReq)
    }

    // @@protoc_insertion_point(class_scope:TakeFurnitureMakeReq)
    private static final emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq();
    }

    public static emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeFurnitureMakeReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeFurnitureMakeReq>() {
      @java.lang.Override
      public TakeFurnitureMakeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeFurnitureMakeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeFurnitureMakeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeFurnitureMakeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeFurnitureMakeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TakeFurnitureMakeReq.proto\"N\n\024TakeFurn" +
      "itureMakeReq\022\017\n\007make_id\030\003 \001(\r\022\r\n\005index\030\017" +
      " \001(\r\022\026\n\016is_fast_finish\030\t \001(\010B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeFurnitureMakeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeFurnitureMakeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeFurnitureMakeReq_descriptor,
        new java.lang.String[] { "MakeId", "Index", "IsFastFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
