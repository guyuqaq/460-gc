// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StrengthenPointData.proto

package emu.grasscutter.net.proto;

public final class StrengthenPointDataOuterClass {
  private StrengthenPointDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StrengthenPointDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StrengthenPointData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 base_point = 3;</code>
     * @return The basePoint.
     */
    int getBasePoint();

    /**
     * <code>uint32 cur_point = 7;</code>
     * @return The curPoint.
     */
    int getCurPoint();
  }
  /**
   * Protobuf type {@code StrengthenPointData}
   */
  public static final class StrengthenPointData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StrengthenPointData)
      StrengthenPointDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StrengthenPointData.newBuilder() to construct.
    private StrengthenPointData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StrengthenPointData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StrengthenPointData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.class, emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.Builder.class);
    }

    public static final int BASE_POINT_FIELD_NUMBER = 3;
    private int basePoint_;
    /**
     * <code>uint32 base_point = 3;</code>
     * @return The basePoint.
     */
    @java.lang.Override
    public int getBasePoint() {
      return basePoint_;
    }

    public static final int CUR_POINT_FIELD_NUMBER = 7;
    private int curPoint_;
    /**
     * <code>uint32 cur_point = 7;</code>
     * @return The curPoint.
     */
    @java.lang.Override
    public int getCurPoint() {
      return curPoint_;
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
      if (basePoint_ != 0) {
        output.writeUInt32(3, basePoint_);
      }
      if (curPoint_ != 0) {
        output.writeUInt32(7, curPoint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (basePoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, basePoint_);
      }
      if (curPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, curPoint_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData other = (emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData) obj;

      if (getBasePoint()
          != other.getBasePoint()) return false;
      if (getCurPoint()
          != other.getCurPoint()) return false;
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
      hash = (37 * hash) + BASE_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getBasePoint();
      hash = (37 * hash) + CUR_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getCurPoint();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData prototype) {
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
     * Protobuf type {@code StrengthenPointData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StrengthenPointData)
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.class, emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        basePoint_ = 0;

        curPoint_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData build() {
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData buildPartial() {
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData result = new emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData(this);
        result.basePoint_ = basePoint_;
        result.curPoint_ = curPoint_;
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
        if (other instanceof emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData) {
          return mergeFrom((emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData other) {
        if (other == emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance()) return this;
        if (other.getBasePoint() != 0) {
          setBasePoint(other.getBasePoint());
        }
        if (other.getCurPoint() != 0) {
          setCurPoint(other.getCurPoint());
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
                basePoint_ = input.readUInt32();

                break;
              } // case 24
              case 56: {
                curPoint_ = input.readUInt32();

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

      private int basePoint_ ;
      /**
       * <code>uint32 base_point = 3;</code>
       * @return The basePoint.
       */
      @java.lang.Override
      public int getBasePoint() {
        return basePoint_;
      }
      /**
       * <code>uint32 base_point = 3;</code>
       * @param value The basePoint to set.
       * @return This builder for chaining.
       */
      public Builder setBasePoint(int value) {
        
        basePoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 base_point = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBasePoint() {
        
        basePoint_ = 0;
        onChanged();
        return this;
      }

      private int curPoint_ ;
      /**
       * <code>uint32 cur_point = 7;</code>
       * @return The curPoint.
       */
      @java.lang.Override
      public int getCurPoint() {
        return curPoint_;
      }
      /**
       * <code>uint32 cur_point = 7;</code>
       * @param value The curPoint to set.
       * @return This builder for chaining.
       */
      public Builder setCurPoint(int value) {
        
        curPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_point = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurPoint() {
        
        curPoint_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StrengthenPointData)
    }

    // @@protoc_insertion_point(class_scope:StrengthenPointData)
    private static final emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData();
    }

    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StrengthenPointData>
        PARSER = new com.google.protobuf.AbstractParser<StrengthenPointData>() {
      @java.lang.Override
      public StrengthenPointData parsePartialFrom(
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

    public static com.google.protobuf.Parser<StrengthenPointData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StrengthenPointData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StrengthenPointData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StrengthenPointData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031StrengthenPointData.proto\"<\n\023Strengthe" +
      "nPointData\022\022\n\nbase_point\030\003 \001(\r\022\021\n\tcur_po" +
      "int\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StrengthenPointData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StrengthenPointData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StrengthenPointData_descriptor,
        new java.lang.String[] { "BasePoint", "CurPoint", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
