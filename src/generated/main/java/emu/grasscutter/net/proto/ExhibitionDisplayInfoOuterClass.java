// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExhibitionDisplayInfo.proto

package emu.grasscutter.net.proto;

public final class ExhibitionDisplayInfoOuterClass {
  private ExhibitionDisplayInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExhibitionDisplayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExhibitionDisplayInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 detail_param = 3;</code>
     * @return The detailParam.
     */
    int getDetailParam();

    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code ExhibitionDisplayInfo}
   */
  public static final class ExhibitionDisplayInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExhibitionDisplayInfo)
      ExhibitionDisplayInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExhibitionDisplayInfo.newBuilder() to construct.
    private ExhibitionDisplayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExhibitionDisplayInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExhibitionDisplayInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExhibitionDisplayInfo(
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
            case 8: {

              id_ = input.readUInt32();
              break;
            }
            case 16: {

              param_ = input.readUInt32();
              break;
            }
            case 24: {

              detailParam_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.class, emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder.class);
    }

    public static final int DETAIL_PARAM_FIELD_NUMBER = 3;
    private int detailParam_;
    /**
     * <code>uint32 detail_param = 3;</code>
     * @return The detailParam.
     */
    @java.lang.Override
    public int getDetailParam() {
      return detailParam_;
    }

    public static final int PARAM_FIELD_NUMBER = 2;
    private int param_;
    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (param_ != 0) {
        output.writeUInt32(2, param_);
      }
      if (detailParam_ != 0) {
        output.writeUInt32(3, detailParam_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, param_);
      }
      if (detailParam_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, detailParam_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo other = (emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo) obj;

      if (getDetailParam()
          != other.getDetailParam()) return false;
      if (getParam()
          != other.getParam()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + DETAIL_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getDetailParam();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo prototype) {
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
     * Protobuf type {@code ExhibitionDisplayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExhibitionDisplayInfo)
        emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.class, emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.newBuilder()
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
        detailParam_ = 0;

        param_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo build() {
        emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo buildPartial() {
        emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo result = new emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo(this);
        result.detailParam_ = detailParam_;
        result.param_ = param_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo other) {
        if (other == emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance()) return this;
        if (other.getDetailParam() != 0) {
          setDetailParam(other.getDetailParam());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int detailParam_ ;
      /**
       * <code>uint32 detail_param = 3;</code>
       * @return The detailParam.
       */
      @java.lang.Override
      public int getDetailParam() {
        return detailParam_;
      }
      /**
       * <code>uint32 detail_param = 3;</code>
       * @param value The detailParam to set.
       * @return This builder for chaining.
       */
      public Builder setDetailParam(int value) {
        
        detailParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 detail_param = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDetailParam() {
        
        detailParam_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 2;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExhibitionDisplayInfo)
    }

    // @@protoc_insertion_point(class_scope:ExhibitionDisplayInfo)
    private static final emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo();
    }

    public static emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExhibitionDisplayInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExhibitionDisplayInfo>() {
      @java.lang.Override
      public ExhibitionDisplayInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExhibitionDisplayInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExhibitionDisplayInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExhibitionDisplayInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExhibitionDisplayInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExhibitionDisplayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ExhibitionDisplayInfo.proto\"H\n\025Exhibit" +
      "ionDisplayInfo\022\024\n\014detail_param\030\003 \001(\r\022\r\n\005" +
      "param\030\002 \001(\r\022\n\n\002id\030\001 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExhibitionDisplayInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExhibitionDisplayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExhibitionDisplayInfo_descriptor,
        new java.lang.String[] { "DetailParam", "Param", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
