// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetInvestigationMonsterRsp.proto

package emu.grasscutter.net.proto;

public final class GetInvestigationMonsterRspOuterClass {
  private GetInvestigationMonsterRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetInvestigationMonsterRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetInvestigationMonsterRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> 
        getMonsterListList();
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(int index);
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    int getMonsterListCount();
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> 
        getMonsterListOrBuilderList();
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(
        int index);

    /**
     * <code>bool kis_for_mark = 13;</code>
     * @return The kisForMark.
     */
    boolean getKisForMark();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code GetInvestigationMonsterRsp}
   */
  public static final class GetInvestigationMonsterRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetInvestigationMonsterRsp)
      GetInvestigationMonsterRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetInvestigationMonsterRsp.newBuilder() to construct.
    private GetInvestigationMonsterRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetInvestigationMonsterRsp() {
      monsterList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetInvestigationMonsterRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.class, emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.Builder.class);
    }

    public static final int MONSTER_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> monsterList_;
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> getMonsterListList() {
      return monsterList_;
    }
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> 
        getMonsterListOrBuilderList() {
      return monsterList_;
    }
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    @java.lang.Override
    public int getMonsterListCount() {
      return monsterList_.size();
    }
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(int index) {
      return monsterList_.get(index);
    }
    /**
     * <code>repeated .InvestigationMonster monster_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(
        int index) {
      return monsterList_.get(index);
    }

    public static final int KIS_FOR_MARK_FIELD_NUMBER = 13;
    private boolean kisForMark_;
    /**
     * <code>bool kis_for_mark = 13;</code>
     * @return The kisForMark.
     */
    @java.lang.Override
    public boolean getKisForMark() {
      return kisForMark_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < monsterList_.size(); i++) {
        output.writeMessage(4, monsterList_.get(i));
      }
      if (kisForMark_ != false) {
        output.writeBool(13, kisForMark_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < monsterList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, monsterList_.get(i));
      }
      if (kisForMark_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, kisForMark_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp other = (emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp) obj;

      if (!getMonsterListList()
          .equals(other.getMonsterListList())) return false;
      if (getKisForMark()
          != other.getKisForMark()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getMonsterListCount() > 0) {
        hash = (37 * hash) + MONSTER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterListList().hashCode();
      }
      hash = (37 * hash) + KIS_FOR_MARK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKisForMark());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp prototype) {
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
     * Protobuf type {@code GetInvestigationMonsterRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetInvestigationMonsterRsp)
        emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.class, emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (monsterListBuilder_ == null) {
          monsterList_ = java.util.Collections.emptyList();
        } else {
          monsterList_ = null;
          monsterListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        kisForMark_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp build() {
        emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp buildPartial() {
        emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp result = new emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp(this);
        int from_bitField0_ = bitField0_;
        if (monsterListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            monsterList_ = java.util.Collections.unmodifiableList(monsterList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.monsterList_ = monsterList_;
        } else {
          result.monsterList_ = monsterListBuilder_.build();
        }
        result.kisForMark_ = kisForMark_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp other) {
        if (other == emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.getDefaultInstance()) return this;
        if (monsterListBuilder_ == null) {
          if (!other.monsterList_.isEmpty()) {
            if (monsterList_.isEmpty()) {
              monsterList_ = other.monsterList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMonsterListIsMutable();
              monsterList_.addAll(other.monsterList_);
            }
            onChanged();
          }
        } else {
          if (!other.monsterList_.isEmpty()) {
            if (monsterListBuilder_.isEmpty()) {
              monsterListBuilder_.dispose();
              monsterListBuilder_ = null;
              monsterList_ = other.monsterList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              monsterListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonsterListFieldBuilder() : null;
            } else {
              monsterListBuilder_.addAllMessages(other.monsterList_);
            }
          }
        }
        if (other.getKisForMark() != false) {
          setKisForMark(other.getKisForMark());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 34: {
                emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster m =
                    input.readMessage(
                        emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.parser(),
                        extensionRegistry);
                if (monsterListBuilder_ == null) {
                  ensureMonsterListIsMutable();
                  monsterList_.add(m);
                } else {
                  monsterListBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 104: {
                kisForMark_ = input.readBool();

                break;
              } // case 104
              case 120: {
                retcode_ = input.readInt32();

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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> monsterList_ =
        java.util.Collections.emptyList();
      private void ensureMonsterListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monsterList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster>(monsterList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> monsterListBuilder_;

      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> getMonsterListList() {
        if (monsterListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsterList_);
        } else {
          return monsterListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public int getMonsterListCount() {
        if (monsterListBuilder_ == null) {
          return monsterList_.size();
        } else {
          return monsterListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(int index) {
        if (monsterListBuilder_ == null) {
          return monsterList_.get(index);
        } else {
          return monsterListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder setMonsterList(
          int index, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.set(index, value);
          onChanged();
        } else {
          monsterListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder setMonsterList(
          int index, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.set(index, builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder addMonsterList(emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.add(value);
          onChanged();
        } else {
          monsterListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder addMonsterList(
          int index, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.add(index, value);
          onChanged();
        } else {
          monsterListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder addMonsterList(
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.add(builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder addMonsterList(
          int index, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.add(index, builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder addAllMonsterList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster> values) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsterList_);
          onChanged();
        } else {
          monsterListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder clearMonsterList() {
        if (monsterListBuilder_ == null) {
          monsterList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          monsterListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public Builder removeMonsterList(int index) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.remove(index);
          onChanged();
        } else {
          monsterListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder getMonsterListBuilder(
          int index) {
        return getMonsterListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(
          int index) {
        if (monsterListBuilder_ == null) {
          return monsterList_.get(index);  } else {
          return monsterListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> 
           getMonsterListOrBuilderList() {
        if (monsterListBuilder_ != null) {
          return monsterListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsterList_);
        }
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder addMonsterListBuilder() {
        return getMonsterListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance());
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder addMonsterListBuilder(
          int index) {
        return getMonsterListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance());
      }
      /**
       * <code>repeated .InvestigationMonster monster_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder> 
           getMonsterListBuilderList() {
        return getMonsterListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> 
          getMonsterListFieldBuilder() {
        if (monsterListBuilder_ == null) {
          monsterListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonster.Builder, emu.grasscutter.net.proto.InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder>(
                  monsterList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          monsterList_ = null;
        }
        return monsterListBuilder_;
      }

      private boolean kisForMark_ ;
      /**
       * <code>bool kis_for_mark = 13;</code>
       * @return The kisForMark.
       */
      @java.lang.Override
      public boolean getKisForMark() {
        return kisForMark_;
      }
      /**
       * <code>bool kis_for_mark = 13;</code>
       * @param value The kisForMark to set.
       * @return This builder for chaining.
       */
      public Builder setKisForMark(boolean value) {
        
        kisForMark_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool kis_for_mark = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearKisForMark() {
        
        kisForMark_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetInvestigationMonsterRsp)
    }

    // @@protoc_insertion_point(class_scope:GetInvestigationMonsterRsp)
    private static final emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp();
    }

    public static emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetInvestigationMonsterRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetInvestigationMonsterRsp>() {
      @java.lang.Override
      public GetInvestigationMonsterRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetInvestigationMonsterRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetInvestigationMonsterRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetInvestigationMonsterRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetInvestigationMonsterRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetInvestigationMonsterRsp.proto\032\032Inve" +
      "stigationMonster.proto\"p\n\032GetInvestigati" +
      "onMonsterRsp\022+\n\014monster_list\030\004 \003(\0132\025.Inv" +
      "estigationMonster\022\024\n\014kis_for_mark\030\r \001(\010\022" +
      "\017\n\007retcode\030\017 \001(\005B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InvestigationMonsterOuterClass.getDescriptor(),
        });
    internal_static_GetInvestigationMonsterRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetInvestigationMonsterRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetInvestigationMonsterRsp_descriptor,
        new java.lang.String[] { "MonsterList", "KisForMark", "Retcode", });
    emu.grasscutter.net.proto.InvestigationMonsterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
