// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneAudioNotify.proto

package emu.grasscutter.net.proto;

public final class SceneAudioNotifyOuterClass {
  private SceneAudioNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneAudioNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneAudioNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @return A list containing the param1.
     */
    java.util.List<java.lang.Integer> getParam1List();
    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @return The count of param1.
     */
    int getParam1Count();
    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @param index The index of the element to return.
     * @return The param1 at the given index.
     */
    int getParam1(int index);

    /**
     * <code>repeated float param2 = 7;</code>
     * @return A list containing the param2.
     */
    java.util.List<java.lang.Float> getParam2List();
    /**
     * <code>repeated float param2 = 7;</code>
     * @return The count of param2.
     */
    int getParam2Count();
    /**
     * <code>repeated float param2 = 7;</code>
     * @param index The index of the element to return.
     * @return The param2 at the given index.
     */
    float getParam2(int index);

    /**
     * <code>uint32 source_uid = 9;</code>
     * @return The sourceUid.
     */
    int getSourceUid();

    /**
     * <code>repeated string param3 = 10;</code>
     * @return A list containing the param3.
     */
    java.util.List<java.lang.String>
        getParam3List();
    /**
     * <code>repeated string param3 = 10;</code>
     * @return The count of param3.
     */
    int getParam3Count();
    /**
     * <code>repeated string param3 = 10;</code>
     * @param index The index of the element to return.
     * @return The param3 at the given index.
     */
    java.lang.String getParam3(int index);
    /**
     * <code>repeated string param3 = 10;</code>
     * @param index The index of the value to return.
     * @return The bytes of the param3 at the given index.
     */
    com.google.protobuf.ByteString
        getParam3Bytes(int index);

    /**
     * <code>int32 type = 12;</code>
     * @return The type.
     */
    int getType();
  }
  /**
   * <pre>
   * CmdId: 21580
   * </pre>
   *
   * Protobuf type {@code SceneAudioNotify}
   */
  public static final class SceneAudioNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneAudioNotify)
      SceneAudioNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneAudioNotify.newBuilder() to construct.
    private SceneAudioNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneAudioNotify() {
      param1_ = emptyIntList();
      param2_ = emptyFloatList();
      param3_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneAudioNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.internal_static_SceneAudioNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.internal_static_SceneAudioNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.class, emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.Builder.class);
    }

    public static final int PARAM1_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList param1_;
    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @return A list containing the param1.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParam1List() {
      return param1_;
    }
    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @return The count of param1.
     */
    public int getParam1Count() {
      return param1_.size();
    }
    /**
     * <code>repeated uint32 param1 = 1;</code>
     * @param index The index of the element to return.
     * @return The param1 at the given index.
     */
    public int getParam1(int index) {
      return param1_.getInt(index);
    }
    private int param1MemoizedSerializedSize = -1;

    public static final int PARAM2_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.FloatList param2_;
    /**
     * <code>repeated float param2 = 7;</code>
     * @return A list containing the param2.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getParam2List() {
      return param2_;
    }
    /**
     * <code>repeated float param2 = 7;</code>
     * @return The count of param2.
     */
    public int getParam2Count() {
      return param2_.size();
    }
    /**
     * <code>repeated float param2 = 7;</code>
     * @param index The index of the element to return.
     * @return The param2 at the given index.
     */
    public float getParam2(int index) {
      return param2_.getFloat(index);
    }
    private int param2MemoizedSerializedSize = -1;

    public static final int SOURCE_UID_FIELD_NUMBER = 9;
    private int sourceUid_;
    /**
     * <code>uint32 source_uid = 9;</code>
     * @return The sourceUid.
     */
    @java.lang.Override
    public int getSourceUid() {
      return sourceUid_;
    }

    public static final int PARAM3_FIELD_NUMBER = 10;
    private com.google.protobuf.LazyStringList param3_;
    /**
     * <code>repeated string param3 = 10;</code>
     * @return A list containing the param3.
     */
    public com.google.protobuf.ProtocolStringList
        getParam3List() {
      return param3_;
    }
    /**
     * <code>repeated string param3 = 10;</code>
     * @return The count of param3.
     */
    public int getParam3Count() {
      return param3_.size();
    }
    /**
     * <code>repeated string param3 = 10;</code>
     * @param index The index of the element to return.
     * @return The param3 at the given index.
     */
    public java.lang.String getParam3(int index) {
      return param3_.get(index);
    }
    /**
     * <code>repeated string param3 = 10;</code>
     * @param index The index of the value to return.
     * @return The bytes of the param3 at the given index.
     */
    public com.google.protobuf.ByteString
        getParam3Bytes(int index) {
      return param3_.getByteString(index);
    }

    public static final int TYPE_FIELD_NUMBER = 12;
    private int type_;
    /**
     * <code>int32 type = 12;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
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
      getSerializedSize();
      if (getParam1List().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(param1MemoizedSerializedSize);
      }
      for (int i = 0; i < param1_.size(); i++) {
        output.writeUInt32NoTag(param1_.getInt(i));
      }
      if (getParam2List().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(param2MemoizedSerializedSize);
      }
      for (int i = 0; i < param2_.size(); i++) {
        output.writeFloatNoTag(param2_.getFloat(i));
      }
      if (sourceUid_ != 0) {
        output.writeUInt32(9, sourceUid_);
      }
      for (int i = 0; i < param3_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, param3_.getRaw(i));
      }
      if (type_ != 0) {
        output.writeInt32(12, type_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < param1_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(param1_.getInt(i));
        }
        size += dataSize;
        if (!getParam1List().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        param1MemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        dataSize = 4 * getParam2List().size();
        size += dataSize;
        if (!getParam2List().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        param2MemoizedSerializedSize = dataSize;
      }
      if (sourceUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sourceUid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < param3_.size(); i++) {
          dataSize += computeStringSizeNoTag(param3_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getParam3List().size();
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, type_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify other = (emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify) obj;

      if (!getParam1List()
          .equals(other.getParam1List())) return false;
      if (!getParam2List()
          .equals(other.getParam2List())) return false;
      if (getSourceUid()
          != other.getSourceUid()) return false;
      if (!getParam3List()
          .equals(other.getParam3List())) return false;
      if (getType()
          != other.getType()) return false;
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
      if (getParam1Count() > 0) {
        hash = (37 * hash) + PARAM1_FIELD_NUMBER;
        hash = (53 * hash) + getParam1List().hashCode();
      }
      if (getParam2Count() > 0) {
        hash = (37 * hash) + PARAM2_FIELD_NUMBER;
        hash = (53 * hash) + getParam2List().hashCode();
      }
      hash = (37 * hash) + SOURCE_UID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceUid();
      if (getParam3Count() > 0) {
        hash = (37 * hash) + PARAM3_FIELD_NUMBER;
        hash = (53 * hash) + getParam3List().hashCode();
      }
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify prototype) {
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
     * CmdId: 21580
     * </pre>
     *
     * Protobuf type {@code SceneAudioNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneAudioNotify)
        emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.internal_static_SceneAudioNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.internal_static_SceneAudioNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.class, emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        param1_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        param2_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        sourceUid_ = 0;

        param3_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.internal_static_SceneAudioNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify build() {
        emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify buildPartial() {
        emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify result = new emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          param1_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.param1_ = param1_;
        if (((bitField0_ & 0x00000002) != 0)) {
          param2_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.param2_ = param2_;
        result.sourceUid_ = sourceUid_;
        if (((bitField0_ & 0x00000004) != 0)) {
          param3_ = param3_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.param3_ = param3_;
        result.type_ = type_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify other) {
        if (other == emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify.getDefaultInstance()) return this;
        if (!other.param1_.isEmpty()) {
          if (param1_.isEmpty()) {
            param1_ = other.param1_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParam1IsMutable();
            param1_.addAll(other.param1_);
          }
          onChanged();
        }
        if (!other.param2_.isEmpty()) {
          if (param2_.isEmpty()) {
            param2_ = other.param2_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParam2IsMutable();
            param2_.addAll(other.param2_);
          }
          onChanged();
        }
        if (other.getSourceUid() != 0) {
          setSourceUid(other.getSourceUid());
        }
        if (!other.param3_.isEmpty()) {
          if (param3_.isEmpty()) {
            param3_ = other.param3_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureParam3IsMutable();
            param3_.addAll(other.param3_);
          }
          onChanged();
        }
        if (other.getType() != 0) {
          setType(other.getType());
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
              case 8: {
                int v = input.readUInt32();
                ensureParam1IsMutable();
                param1_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParam1IsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  param1_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 61: {
                float v = input.readFloat();
                ensureParam2IsMutable();
                param2_.addFloat(v);
                break;
              } // case 61
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParam2IsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  param2_.addFloat(input.readFloat());
                }
                input.popLimit(limit);
                break;
              } // case 58
              case 72: {
                sourceUid_ = input.readUInt32();

                break;
              } // case 72
              case 82: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureParam3IsMutable();
                param3_.add(s);
                break;
              } // case 82
              case 96: {
                type_ = input.readInt32();

                break;
              } // case 96
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
      private int bitField0_;

      private com.google.protobuf.Internal.IntList param1_ = emptyIntList();
      private void ensureParam1IsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          param1_ = mutableCopy(param1_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @return A list containing the param1.
       */
      public java.util.List<java.lang.Integer>
          getParam1List() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(param1_) : param1_;
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @return The count of param1.
       */
      public int getParam1Count() {
        return param1_.size();
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @param index The index of the element to return.
       * @return The param1 at the given index.
       */
      public int getParam1(int index) {
        return param1_.getInt(index);
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @param index The index to set the value at.
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(
          int index, int value) {
        ensureParam1IsMutable();
        param1_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @param value The param1 to add.
       * @return This builder for chaining.
       */
      public Builder addParam1(int value) {
        ensureParam1IsMutable();
        param1_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @param values The param1 to add.
       * @return This builder for chaining.
       */
      public Builder addAllParam1(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParam1IsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, param1_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param1 = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        param1_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList param2_ = emptyFloatList();
      private void ensureParam2IsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          param2_ = mutableCopy(param2_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @return A list containing the param2.
       */
      public java.util.List<java.lang.Float>
          getParam2List() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(param2_) : param2_;
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @return The count of param2.
       */
      public int getParam2Count() {
        return param2_.size();
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @param index The index of the element to return.
       * @return The param2 at the given index.
       */
      public float getParam2(int index) {
        return param2_.getFloat(index);
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @param index The index to set the value at.
       * @param value The param2 to set.
       * @return This builder for chaining.
       */
      public Builder setParam2(
          int index, float value) {
        ensureParam2IsMutable();
        param2_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @param value The param2 to add.
       * @return This builder for chaining.
       */
      public Builder addParam2(float value) {
        ensureParam2IsMutable();
        param2_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @param values The param2 to add.
       * @return This builder for chaining.
       */
      public Builder addAllParam2(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureParam2IsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, param2_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param2 = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam2() {
        param2_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int sourceUid_ ;
      /**
       * <code>uint32 source_uid = 9;</code>
       * @return The sourceUid.
       */
      @java.lang.Override
      public int getSourceUid() {
        return sourceUid_;
      }
      /**
       * <code>uint32 source_uid = 9;</code>
       * @param value The sourceUid to set.
       * @return This builder for chaining.
       */
      public Builder setSourceUid(int value) {
        
        sourceUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceUid() {
        
        sourceUid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList param3_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureParam3IsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          param3_ = new com.google.protobuf.LazyStringArrayList(param3_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @return A list containing the param3.
       */
      public com.google.protobuf.ProtocolStringList
          getParam3List() {
        return param3_.getUnmodifiableView();
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @return The count of param3.
       */
      public int getParam3Count() {
        return param3_.size();
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param index The index of the element to return.
       * @return The param3 at the given index.
       */
      public java.lang.String getParam3(int index) {
        return param3_.get(index);
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param index The index of the value to return.
       * @return The bytes of the param3 at the given index.
       */
      public com.google.protobuf.ByteString
          getParam3Bytes(int index) {
        return param3_.getByteString(index);
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param index The index to set the value at.
       * @param value The param3 to set.
       * @return This builder for chaining.
       */
      public Builder setParam3(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureParam3IsMutable();
        param3_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param value The param3 to add.
       * @return This builder for chaining.
       */
      public Builder addParam3(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureParam3IsMutable();
        param3_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param values The param3 to add.
       * @return This builder for chaining.
       */
      public Builder addAllParam3(
          java.lang.Iterable<java.lang.String> values) {
        ensureParam3IsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, param3_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam3() {
        param3_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string param3 = 10;</code>
       * @param value The bytes of the param3 to add.
       * @return This builder for chaining.
       */
      public Builder addParam3Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureParam3IsMutable();
        param3_.add(value);
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 12;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 12;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneAudioNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneAudioNotify)
    private static final emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify();
    }

    public static emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneAudioNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneAudioNotify>() {
      @java.lang.Override
      public SceneAudioNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneAudioNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneAudioNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneAudioNotifyOuterClass.SceneAudioNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneAudioNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneAudioNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SceneAudioNotify.proto\"d\n\020SceneAudioNo" +
      "tify\022\016\n\006param1\030\001 \003(\r\022\016\n\006param2\030\007 \003(\002\022\022\n\n" +
      "source_uid\030\t \001(\r\022\016\n\006param3\030\n \003(\t\022\014\n\004type" +
      "\030\014 \001(\005B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneAudioNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneAudioNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneAudioNotify_descriptor,
        new java.lang.String[] { "Param1", "Param2", "SourceUid", "Param3", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
