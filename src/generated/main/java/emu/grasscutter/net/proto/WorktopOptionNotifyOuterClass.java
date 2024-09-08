// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorktopOptionNotify.proto

package emu.grasscutter.net.proto;

public final class WorktopOptionNotifyOuterClass {
  private WorktopOptionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorktopOptionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorktopOptionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @return A list containing the optionList.
     */
    java.util.List<java.lang.Integer> getOptionListList();
    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @return The count of optionList.
     */
    int getOptionListCount();
    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @param index The index of the element to return.
     * @return The optionList at the given index.
     */
    int getOptionList(int index);
  }
  /**
   * Protobuf type {@code WorktopOptionNotify}
   */
  public static final class WorktopOptionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorktopOptionNotify)
      WorktopOptionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorktopOptionNotify.newBuilder() to construct.
    private WorktopOptionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorktopOptionNotify() {
      optionList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorktopOptionNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.class, emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 7;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int OPTION_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList optionList_;
    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @return A list containing the optionList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOptionListList() {
      return optionList_;
    }
    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @return The count of optionList.
     */
    public int getOptionListCount() {
      return optionList_.size();
    }
    /**
     * <code>repeated uint32 option_list = 11;</code>
     * @param index The index of the element to return.
     * @return The optionList at the given index.
     */
    public int getOptionList(int index) {
      return optionList_.getInt(index);
    }
    private int optionListMemoizedSerializedSize = -1;

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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(7, gadgetEntityId_);
      }
      if (getOptionListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(optionListMemoizedSerializedSize);
      }
      for (int i = 0; i < optionList_.size(); i++) {
        output.writeUInt32NoTag(optionList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gadgetEntityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < optionList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(optionList_.getInt(i));
        }
        size += dataSize;
        if (!getOptionListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        optionListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify other = (emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (!getOptionListList()
          .equals(other.getOptionListList())) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      if (getOptionListCount() > 0) {
        hash = (37 * hash) + OPTION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOptionListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify prototype) {
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
     * Protobuf type {@code WorktopOptionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorktopOptionNotify)
        emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.class, emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gadgetEntityId_ = 0;

        optionList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify build() {
        emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify buildPartial() {
        emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify result = new emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify(this);
        int from_bitField0_ = bitField0_;
        result.gadgetEntityId_ = gadgetEntityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          optionList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.optionList_ = optionList_;
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
        if (other instanceof emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify other) {
        if (other == emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (!other.optionList_.isEmpty()) {
          if (optionList_.isEmpty()) {
            optionList_ = other.optionList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOptionListIsMutable();
            optionList_.addAll(other.optionList_);
          }
          onChanged();
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
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 56
              case 88: {
                int v = input.readUInt32();
                ensureOptionListIsMutable();
                optionList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureOptionListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  optionList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList optionList_ = emptyIntList();
      private void ensureOptionListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          optionList_ = mutableCopy(optionList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @return A list containing the optionList.
       */
      public java.util.List<java.lang.Integer>
          getOptionListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(optionList_) : optionList_;
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @return The count of optionList.
       */
      public int getOptionListCount() {
        return optionList_.size();
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @param index The index of the element to return.
       * @return The optionList at the given index.
       */
      public int getOptionList(int index) {
        return optionList_.getInt(index);
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The optionList to set.
       * @return This builder for chaining.
       */
      public Builder setOptionList(
          int index, int value) {
        ensureOptionListIsMutable();
        optionList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @param value The optionList to add.
       * @return This builder for chaining.
       */
      public Builder addOptionList(int value) {
        ensureOptionListIsMutable();
        optionList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @param values The optionList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOptionList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOptionListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, optionList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionList() {
        optionList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:WorktopOptionNotify)
    }

    // @@protoc_insertion_point(class_scope:WorktopOptionNotify)
    private static final emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify();
    }

    public static emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorktopOptionNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorktopOptionNotify>() {
      @java.lang.Override
      public WorktopOptionNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorktopOptionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorktopOptionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorktopOptionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorktopOptionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WorktopOptionNotify.proto\"D\n\023WorktopOp" +
      "tionNotify\022\030\n\020gadget_entity_id\030\007 \001(\r\022\023\n\013" +
      "option_list\030\013 \003(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WorktopOptionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorktopOptionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorktopOptionNotify_descriptor,
        new java.lang.String[] { "GadgetEntityId", "OptionList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
