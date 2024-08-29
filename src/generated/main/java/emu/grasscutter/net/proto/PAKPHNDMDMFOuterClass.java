// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PAKPHNDMDMF.proto

package emu.grasscutter.net.proto;

public final class PAKPHNDMDMFOuterClass {
  private PAKPHNDMDMFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PAKPHNDMDMFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PAKPHNDMDMF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @return A list containing the buffIdList.
     */
    java.util.List<java.lang.Integer> getBuffIdListList();
    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @return The count of buffIdList.
     */
    int getBuffIdListCount();
    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The buffIdList at the given index.
     */
    int getBuffIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 24446
   * </pre>
   *
   * Protobuf type {@code PAKPHNDMDMF}
   */
  public static final class PAKPHNDMDMF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PAKPHNDMDMF)
      PAKPHNDMDMFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PAKPHNDMDMF.newBuilder() to construct.
    private PAKPHNDMDMF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PAKPHNDMDMF() {
      buffIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PAKPHNDMDMF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PAKPHNDMDMF(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                buffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              buffIdList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                buffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                buffIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          buffIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.internal_static_PAKPHNDMDMF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.internal_static_PAKPHNDMDMF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.class, emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.Builder.class);
    }

    public static final int BUFF_ID_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList buffIdList_;
    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @return A list containing the buffIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBuffIdListList() {
      return buffIdList_;
    }
    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @return The count of buffIdList.
     */
    public int getBuffIdListCount() {
      return buffIdList_.size();
    }
    /**
     * <code>repeated uint32 buff_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The buffIdList at the given index.
     */
    public int getBuffIdList(int index) {
      return buffIdList_.getInt(index);
    }
    private int buffIdListMemoizedSerializedSize = -1;

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
      if (getBuffIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(buffIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < buffIdList_.size(); i++) {
        output.writeUInt32NoTag(buffIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < buffIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(buffIdList_.getInt(i));
        }
        size += dataSize;
        if (!getBuffIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        buffIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF other = (emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF) obj;

      if (!getBuffIdListList()
          .equals(other.getBuffIdListList())) return false;
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
      if (getBuffIdListCount() > 0) {
        hash = (37 * hash) + BUFF_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBuffIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF prototype) {
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
     * CmdId: 24446
     * </pre>
     *
     * Protobuf type {@code PAKPHNDMDMF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PAKPHNDMDMF)
        emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.internal_static_PAKPHNDMDMF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.internal_static_PAKPHNDMDMF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.class, emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.newBuilder()
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
        buffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.internal_static_PAKPHNDMDMF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF build() {
        emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF buildPartial() {
        emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF result = new emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          buffIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.buffIdList_ = buffIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF) {
          return mergeFrom((emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF other) {
        if (other == emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF.getDefaultInstance()) return this;
        if (!other.buffIdList_.isEmpty()) {
          if (buffIdList_.isEmpty()) {
            buffIdList_ = other.buffIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBuffIdListIsMutable();
            buffIdList_.addAll(other.buffIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList buffIdList_ = emptyIntList();
      private void ensureBuffIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          buffIdList_ = mutableCopy(buffIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @return A list containing the buffIdList.
       */
      public java.util.List<java.lang.Integer>
          getBuffIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(buffIdList_) : buffIdList_;
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @return The count of buffIdList.
       */
      public int getBuffIdListCount() {
        return buffIdList_.size();
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @param index The index of the element to return.
       * @return The buffIdList at the given index.
       */
      public int getBuffIdList(int index) {
        return buffIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The buffIdList to set.
       * @return This builder for chaining.
       */
      public Builder setBuffIdList(
          int index, int value) {
        ensureBuffIdListIsMutable();
        buffIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @param value The buffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addBuffIdList(int value) {
        ensureBuffIdListIsMutable();
        buffIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @param values The buffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBuffIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBuffIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, buffIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 buff_id_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffIdList() {
        buffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:PAKPHNDMDMF)
    }

    // @@protoc_insertion_point(class_scope:PAKPHNDMDMF)
    private static final emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF();
    }

    public static emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PAKPHNDMDMF>
        PARSER = new com.google.protobuf.AbstractParser<PAKPHNDMDMF>() {
      @java.lang.Override
      public PAKPHNDMDMF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PAKPHNDMDMF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PAKPHNDMDMF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PAKPHNDMDMF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PAKPHNDMDMFOuterClass.PAKPHNDMDMF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PAKPHNDMDMF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PAKPHNDMDMF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PAKPHNDMDMF.proto\"#\n\013PAKPHNDMDMF\022\024\n\014bu" +
      "ff_id_list\030\003 \003(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PAKPHNDMDMF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PAKPHNDMDMF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PAKPHNDMDMF_descriptor,
        new java.lang.String[] { "BuffIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
