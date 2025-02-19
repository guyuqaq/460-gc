// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestUpdateQuestVarReq.proto

package emu.grasscutter.net.proto;

public final class QuestUpdateQuestVarReqOuterClass {
  private QuestUpdateQuestVarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestUpdateQuestVarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestUpdateQuestVarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 quest_id = 3;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 parent_quest_var_seq = 5;</code>
     * @return The parentQuestVarSeq.
     */
    int getParentQuestVarSeq();

    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> 
        getQuestVarOpListList();
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(int index);
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    int getQuestVarOpListCount();
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder> 
        getQuestVarOpListOrBuilderList();
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf type {@code QuestUpdateQuestVarReq}
   */
  public static final class QuestUpdateQuestVarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestUpdateQuestVarReq)
      QuestUpdateQuestVarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestUpdateQuestVarReq.newBuilder() to construct.
    private QuestUpdateQuestVarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestUpdateQuestVarReq() {
      questVarOpList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestUpdateQuestVarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.class, emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.Builder.class);
    }

    public static final int QUEST_ID_FIELD_NUMBER = 3;
    private int questId_;
    /**
     * <code>uint32 quest_id = 3;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 5;
    private int parentQuestVarSeq_;
    /**
     * <code>uint32 parent_quest_var_seq = 5;</code>
     * @return The parentQuestVarSeq.
     */
    @java.lang.Override
    public int getParentQuestVarSeq() {
      return parentQuestVarSeq_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 7;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int QUEST_VAR_OP_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> questVarOpList_;
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> getQuestVarOpListList() {
      return questVarOpList_;
    }
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder> 
        getQuestVarOpListOrBuilderList() {
      return questVarOpList_;
    }
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    @java.lang.Override
    public int getQuestVarOpListCount() {
      return questVarOpList_.size();
    }
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(int index) {
      return questVarOpList_.get(index);
    }
    /**
     * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(
        int index) {
      return questVarOpList_.get(index);
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
      if (questId_ != 0) {
        output.writeUInt32(3, questId_);
      }
      if (parentQuestVarSeq_ != 0) {
        output.writeUInt32(5, parentQuestVarSeq_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(7, parentQuestId_);
      }
      for (int i = 0; i < questVarOpList_.size(); i++) {
        output.writeMessage(13, questVarOpList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, questId_);
      }
      if (parentQuestVarSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, parentQuestVarSeq_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, parentQuestId_);
      }
      for (int i = 0; i < questVarOpList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, questVarOpList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq other = (emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq) obj;

      if (getQuestId()
          != other.getQuestId()) return false;
      if (getParentQuestVarSeq()
          != other.getParentQuestVarSeq()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (!getQuestVarOpListList()
          .equals(other.getQuestVarOpListList())) return false;
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
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + PARENT_QUEST_VAR_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestVarSeq();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (getQuestVarOpListCount() > 0) {
        hash = (37 * hash) + QUEST_VAR_OP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQuestVarOpListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq prototype) {
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
     * 4.7.0
     * </pre>
     *
     * Protobuf type {@code QuestUpdateQuestVarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestUpdateQuestVarReq)
        emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.class, emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        questId_ = 0;

        parentQuestVarSeq_ = 0;

        parentQuestId_ = 0;

        if (questVarOpListBuilder_ == null) {
          questVarOpList_ = java.util.Collections.emptyList();
        } else {
          questVarOpList_ = null;
          questVarOpListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.internal_static_QuestUpdateQuestVarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq build() {
        emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq buildPartial() {
        emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq result = new emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq(this);
        int from_bitField0_ = bitField0_;
        result.questId_ = questId_;
        result.parentQuestVarSeq_ = parentQuestVarSeq_;
        result.parentQuestId_ = parentQuestId_;
        if (questVarOpListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            questVarOpList_ = java.util.Collections.unmodifiableList(questVarOpList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.questVarOpList_ = questVarOpList_;
        } else {
          result.questVarOpList_ = questVarOpListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq other) {
        if (other == emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.getDefaultInstance()) return this;
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getParentQuestVarSeq() != 0) {
          setParentQuestVarSeq(other.getParentQuestVarSeq());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (questVarOpListBuilder_ == null) {
          if (!other.questVarOpList_.isEmpty()) {
            if (questVarOpList_.isEmpty()) {
              questVarOpList_ = other.questVarOpList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureQuestVarOpListIsMutable();
              questVarOpList_.addAll(other.questVarOpList_);
            }
            onChanged();
          }
        } else {
          if (!other.questVarOpList_.isEmpty()) {
            if (questVarOpListBuilder_.isEmpty()) {
              questVarOpListBuilder_.dispose();
              questVarOpListBuilder_ = null;
              questVarOpList_ = other.questVarOpList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              questVarOpListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getQuestVarOpListFieldBuilder() : null;
            } else {
              questVarOpListBuilder_.addAllMessages(other.questVarOpList_);
            }
          }
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
                questId_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                parentQuestVarSeq_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                parentQuestId_ = input.readUInt32();

                break;
              } // case 56
              case 106: {
                emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp m =
                    input.readMessage(
                        emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.parser(),
                        extensionRegistry);
                if (questVarOpListBuilder_ == null) {
                  ensureQuestVarOpListIsMutable();
                  questVarOpList_.add(m);
                } else {
                  questVarOpListBuilder_.addMessage(m);
                }
                break;
              } // case 106
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

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 3;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 3;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestVarSeq_ ;
      /**
       * <code>uint32 parent_quest_var_seq = 5;</code>
       * @return The parentQuestVarSeq.
       */
      @java.lang.Override
      public int getParentQuestVarSeq() {
        return parentQuestVarSeq_;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 5;</code>
       * @param value The parentQuestVarSeq to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestVarSeq(int value) {
        
        parentQuestVarSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestVarSeq() {
        
        parentQuestVarSeq_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> questVarOpList_ =
        java.util.Collections.emptyList();
      private void ensureQuestVarOpListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          questVarOpList_ = new java.util.ArrayList<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp>(questVarOpList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder> questVarOpListBuilder_;

      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> getQuestVarOpListList() {
        if (questVarOpListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(questVarOpList_);
        } else {
          return questVarOpListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public int getQuestVarOpListCount() {
        if (questVarOpListBuilder_ == null) {
          return questVarOpList_.size();
        } else {
          return questVarOpListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp getQuestVarOpList(int index) {
        if (questVarOpListBuilder_ == null) {
          return questVarOpList_.get(index);
        } else {
          return questVarOpListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder setQuestVarOpList(
          int index, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp value) {
        if (questVarOpListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestVarOpListIsMutable();
          questVarOpList_.set(index, value);
          onChanged();
        } else {
          questVarOpListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder setQuestVarOpList(
          int index, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
        if (questVarOpListBuilder_ == null) {
          ensureQuestVarOpListIsMutable();
          questVarOpList_.set(index, builderForValue.build());
          onChanged();
        } else {
          questVarOpListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder addQuestVarOpList(emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp value) {
        if (questVarOpListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestVarOpListIsMutable();
          questVarOpList_.add(value);
          onChanged();
        } else {
          questVarOpListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder addQuestVarOpList(
          int index, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp value) {
        if (questVarOpListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestVarOpListIsMutable();
          questVarOpList_.add(index, value);
          onChanged();
        } else {
          questVarOpListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder addQuestVarOpList(
          emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
        if (questVarOpListBuilder_ == null) {
          ensureQuestVarOpListIsMutable();
          questVarOpList_.add(builderForValue.build());
          onChanged();
        } else {
          questVarOpListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder addQuestVarOpList(
          int index, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder builderForValue) {
        if (questVarOpListBuilder_ == null) {
          ensureQuestVarOpListIsMutable();
          questVarOpList_.add(index, builderForValue.build());
          onChanged();
        } else {
          questVarOpListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder addAllQuestVarOpList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp> values) {
        if (questVarOpListBuilder_ == null) {
          ensureQuestVarOpListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, questVarOpList_);
          onChanged();
        } else {
          questVarOpListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder clearQuestVarOpList() {
        if (questVarOpListBuilder_ == null) {
          questVarOpList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          questVarOpListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public Builder removeQuestVarOpList(int index) {
        if (questVarOpListBuilder_ == null) {
          ensureQuestVarOpListIsMutable();
          questVarOpList_.remove(index);
          onChanged();
        } else {
          questVarOpListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder getQuestVarOpListBuilder(
          int index) {
        return getQuestVarOpListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder getQuestVarOpListOrBuilder(
          int index) {
        if (questVarOpListBuilder_ == null) {
          return questVarOpList_.get(index);  } else {
          return questVarOpListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder> 
           getQuestVarOpListOrBuilderList() {
        if (questVarOpListBuilder_ != null) {
          return questVarOpListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(questVarOpList_);
        }
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder addQuestVarOpListBuilder() {
        return getQuestVarOpListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.getDefaultInstance());
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder addQuestVarOpListBuilder(
          int index) {
        return getQuestVarOpListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.getDefaultInstance());
      }
      /**
       * <code>repeated .QuestVarOp quest_var_op_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder> 
           getQuestVarOpListBuilderList() {
        return getQuestVarOpListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder> 
          getQuestVarOpListFieldBuilder() {
        if (questVarOpListBuilder_ == null) {
          questVarOpListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOp.Builder, emu.grasscutter.net.proto.QuestVarOpOuterClass.QuestVarOpOrBuilder>(
                  questVarOpList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          questVarOpList_ = null;
        }
        return questVarOpListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:QuestUpdateQuestVarReq)
    }

    // @@protoc_insertion_point(class_scope:QuestUpdateQuestVarReq)
    private static final emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq();
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestUpdateQuestVarReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestUpdateQuestVarReq>() {
      @java.lang.Override
      public QuestUpdateQuestVarReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestUpdateQuestVarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestUpdateQuestVarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestUpdateQuestVarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestUpdateQuestVarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034QuestUpdateQuestVarReq.proto\032\020QuestVar" +
      "Op.proto\"\211\001\n\026QuestUpdateQuestVarReq\022\020\n\010q" +
      "uest_id\030\003 \001(\r\022\034\n\024parent_quest_var_seq\030\005 " +
      "\001(\r\022\027\n\017parent_quest_id\030\007 \001(\r\022&\n\021quest_va" +
      "r_op_list\030\r \003(\0132\013.QuestVarOpB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.QuestVarOpOuterClass.getDescriptor(),
        });
    internal_static_QuestUpdateQuestVarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestUpdateQuestVarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestUpdateQuestVarReq_descriptor,
        new java.lang.String[] { "QuestId", "ParentQuestVarSeq", "ParentQuestId", "QuestVarOpList", });
    emu.grasscutter.net.proto.QuestVarOpOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
