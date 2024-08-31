// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonSetting.proto

package emu.grasscutter.net.proto;

public final class CustomDungeonSettingOuterClass {
  private CustomDungeonSettingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_arrive_finish = 1;</code>
     * @return The isArriveFinish.
     */
    boolean getIsArriveFinish();

    /**
     * <code>uint32 PPBAAMIOPGF = 2;</code>
     * @return The pPBAAMIOPGF.
     */
    int getPPBAAMIOPGF();

    /**
     * <code>bool is_forbid_skill = 9;</code>
     * @return The isForbidSkill.
     */
    boolean getIsForbidSkill();

    /**
     * <code>uint32 FCEACKKGHCL = 11;</code>
     * @return The fCEACKKGHCL.
     */
    int getFCEACKKGHCL();

    /**
     * <code>uint32 HMFACEEJJDM = 12;</code>
     * @return The hMFACEEJJDM.
     */
    int getHMFACEEJJDM();

    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @return A list containing the openRoomList.
     */
    java.util.List<java.lang.Integer> getOpenRoomListList();
    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @return The count of openRoomList.
     */
    int getOpenRoomListCount();
    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @param index The index of the element to return.
     * @return The openRoomList at the given index.
     */
    int getOpenRoomList(int index);

    /**
     * <code>uint32 PMAEONPOMJE = 14;</code>
     * @return The pMAEONPOMJE.
     */
    int getPMAEONPOMJE();
  }
  /**
   * Protobuf type {@code CustomDungeonSetting}
   */
  public static final class CustomDungeonSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonSetting)
      CustomDungeonSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonSetting.newBuilder() to construct.
    private CustomDungeonSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonSetting() {
      openRoomList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonSetting();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonSetting(
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
            case 8: {

              isArriveFinish_ = input.readBool();
              break;
            }
            case 16: {

              pPBAAMIOPGF_ = input.readUInt32();
              break;
            }
            case 72: {

              isForbidSkill_ = input.readBool();
              break;
            }
            case 88: {

              fCEACKKGHCL_ = input.readUInt32();
              break;
            }
            case 96: {

              hMFACEEJJDM_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                openRoomList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              openRoomList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                openRoomList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                openRoomList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              pMAEONPOMJE_ = input.readUInt32();
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
          openRoomList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.class, emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder.class);
    }

    public static final int IS_ARRIVE_FINISH_FIELD_NUMBER = 1;
    private boolean isArriveFinish_;
    /**
     * <code>bool is_arrive_finish = 1;</code>
     * @return The isArriveFinish.
     */
    @java.lang.Override
    public boolean getIsArriveFinish() {
      return isArriveFinish_;
    }

    public static final int PPBAAMIOPGF_FIELD_NUMBER = 2;
    private int pPBAAMIOPGF_;
    /**
     * <code>uint32 PPBAAMIOPGF = 2;</code>
     * @return The pPBAAMIOPGF.
     */
    @java.lang.Override
    public int getPPBAAMIOPGF() {
      return pPBAAMIOPGF_;
    }

    public static final int IS_FORBID_SKILL_FIELD_NUMBER = 9;
    private boolean isForbidSkill_;
    /**
     * <code>bool is_forbid_skill = 9;</code>
     * @return The isForbidSkill.
     */
    @java.lang.Override
    public boolean getIsForbidSkill() {
      return isForbidSkill_;
    }

    public static final int FCEACKKGHCL_FIELD_NUMBER = 11;
    private int fCEACKKGHCL_;
    /**
     * <code>uint32 FCEACKKGHCL = 11;</code>
     * @return The fCEACKKGHCL.
     */
    @java.lang.Override
    public int getFCEACKKGHCL() {
      return fCEACKKGHCL_;
    }

    public static final int HMFACEEJJDM_FIELD_NUMBER = 12;
    private int hMFACEEJJDM_;
    /**
     * <code>uint32 HMFACEEJJDM = 12;</code>
     * @return The hMFACEEJJDM.
     */
    @java.lang.Override
    public int getHMFACEEJJDM() {
      return hMFACEEJJDM_;
    }

    public static final int OPEN_ROOM_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList openRoomList_;
    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @return A list containing the openRoomList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOpenRoomListList() {
      return openRoomList_;
    }
    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @return The count of openRoomList.
     */
    public int getOpenRoomListCount() {
      return openRoomList_.size();
    }
    /**
     * <code>repeated uint32 open_room_list = 13;</code>
     * @param index The index of the element to return.
     * @return The openRoomList at the given index.
     */
    public int getOpenRoomList(int index) {
      return openRoomList_.getInt(index);
    }
    private int openRoomListMemoizedSerializedSize = -1;

    public static final int PMAEONPOMJE_FIELD_NUMBER = 14;
    private int pMAEONPOMJE_;
    /**
     * <code>uint32 PMAEONPOMJE = 14;</code>
     * @return The pMAEONPOMJE.
     */
    @java.lang.Override
    public int getPMAEONPOMJE() {
      return pMAEONPOMJE_;
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
      if (isArriveFinish_ != false) {
        output.writeBool(1, isArriveFinish_);
      }
      if (pPBAAMIOPGF_ != 0) {
        output.writeUInt32(2, pPBAAMIOPGF_);
      }
      if (isForbidSkill_ != false) {
        output.writeBool(9, isForbidSkill_);
      }
      if (fCEACKKGHCL_ != 0) {
        output.writeUInt32(11, fCEACKKGHCL_);
      }
      if (hMFACEEJJDM_ != 0) {
        output.writeUInt32(12, hMFACEEJJDM_);
      }
      if (getOpenRoomListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(openRoomListMemoizedSerializedSize);
      }
      for (int i = 0; i < openRoomList_.size(); i++) {
        output.writeUInt32NoTag(openRoomList_.getInt(i));
      }
      if (pMAEONPOMJE_ != 0) {
        output.writeUInt32(14, pMAEONPOMJE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isArriveFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isArriveFinish_);
      }
      if (pPBAAMIOPGF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pPBAAMIOPGF_);
      }
      if (isForbidSkill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isForbidSkill_);
      }
      if (fCEACKKGHCL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, fCEACKKGHCL_);
      }
      if (hMFACEEJJDM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, hMFACEEJJDM_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < openRoomList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(openRoomList_.getInt(i));
        }
        size += dataSize;
        if (!getOpenRoomListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        openRoomListMemoizedSerializedSize = dataSize;
      }
      if (pMAEONPOMJE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, pMAEONPOMJE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting other = (emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) obj;

      if (getIsArriveFinish()
          != other.getIsArriveFinish()) return false;
      if (getPPBAAMIOPGF()
          != other.getPPBAAMIOPGF()) return false;
      if (getIsForbidSkill()
          != other.getIsForbidSkill()) return false;
      if (getFCEACKKGHCL()
          != other.getFCEACKKGHCL()) return false;
      if (getHMFACEEJJDM()
          != other.getHMFACEEJJDM()) return false;
      if (!getOpenRoomListList()
          .equals(other.getOpenRoomListList())) return false;
      if (getPMAEONPOMJE()
          != other.getPMAEONPOMJE()) return false;
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
      hash = (37 * hash) + IS_ARRIVE_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsArriveFinish());
      hash = (37 * hash) + PPBAAMIOPGF_FIELD_NUMBER;
      hash = (53 * hash) + getPPBAAMIOPGF();
      hash = (37 * hash) + IS_FORBID_SKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForbidSkill());
      hash = (37 * hash) + FCEACKKGHCL_FIELD_NUMBER;
      hash = (53 * hash) + getFCEACKKGHCL();
      hash = (37 * hash) + HMFACEEJJDM_FIELD_NUMBER;
      hash = (53 * hash) + getHMFACEEJJDM();
      if (getOpenRoomListCount() > 0) {
        hash = (37 * hash) + OPEN_ROOM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOpenRoomListList().hashCode();
      }
      hash = (37 * hash) + PMAEONPOMJE_FIELD_NUMBER;
      hash = (53 * hash) + getPMAEONPOMJE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting prototype) {
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
     * Protobuf type {@code CustomDungeonSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonSetting)
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.class, emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.newBuilder()
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
        isArriveFinish_ = false;

        pPBAAMIOPGF_ = 0;

        isForbidSkill_ = false;

        fCEACKKGHCL_ = 0;

        hMFACEEJJDM_ = 0;

        openRoomList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        pMAEONPOMJE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting build() {
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting buildPartial() {
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting result = new emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting(this);
        int from_bitField0_ = bitField0_;
        result.isArriveFinish_ = isArriveFinish_;
        result.pPBAAMIOPGF_ = pPBAAMIOPGF_;
        result.isForbidSkill_ = isForbidSkill_;
        result.fCEACKKGHCL_ = fCEACKKGHCL_;
        result.hMFACEEJJDM_ = hMFACEEJJDM_;
        if (((bitField0_ & 0x00000001) != 0)) {
          openRoomList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.openRoomList_ = openRoomList_;
        result.pMAEONPOMJE_ = pMAEONPOMJE_;
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
        if (other instanceof emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) {
          return mergeFrom((emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting other) {
        if (other == emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance()) return this;
        if (other.getIsArriveFinish() != false) {
          setIsArriveFinish(other.getIsArriveFinish());
        }
        if (other.getPPBAAMIOPGF() != 0) {
          setPPBAAMIOPGF(other.getPPBAAMIOPGF());
        }
        if (other.getIsForbidSkill() != false) {
          setIsForbidSkill(other.getIsForbidSkill());
        }
        if (other.getFCEACKKGHCL() != 0) {
          setFCEACKKGHCL(other.getFCEACKKGHCL());
        }
        if (other.getHMFACEEJJDM() != 0) {
          setHMFACEEJJDM(other.getHMFACEEJJDM());
        }
        if (!other.openRoomList_.isEmpty()) {
          if (openRoomList_.isEmpty()) {
            openRoomList_ = other.openRoomList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOpenRoomListIsMutable();
            openRoomList_.addAll(other.openRoomList_);
          }
          onChanged();
        }
        if (other.getPMAEONPOMJE() != 0) {
          setPMAEONPOMJE(other.getPMAEONPOMJE());
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
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isArriveFinish_ ;
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @return The isArriveFinish.
       */
      @java.lang.Override
      public boolean getIsArriveFinish() {
        return isArriveFinish_;
      }
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @param value The isArriveFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsArriveFinish(boolean value) {
        
        isArriveFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsArriveFinish() {
        
        isArriveFinish_ = false;
        onChanged();
        return this;
      }

      private int pPBAAMIOPGF_ ;
      /**
       * <code>uint32 PPBAAMIOPGF = 2;</code>
       * @return The pPBAAMIOPGF.
       */
      @java.lang.Override
      public int getPPBAAMIOPGF() {
        return pPBAAMIOPGF_;
      }
      /**
       * <code>uint32 PPBAAMIOPGF = 2;</code>
       * @param value The pPBAAMIOPGF to set.
       * @return This builder for chaining.
       */
      public Builder setPPBAAMIOPGF(int value) {
        
        pPBAAMIOPGF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PPBAAMIOPGF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPPBAAMIOPGF() {
        
        pPBAAMIOPGF_ = 0;
        onChanged();
        return this;
      }

      private boolean isForbidSkill_ ;
      /**
       * <code>bool is_forbid_skill = 9;</code>
       * @return The isForbidSkill.
       */
      @java.lang.Override
      public boolean getIsForbidSkill() {
        return isForbidSkill_;
      }
      /**
       * <code>bool is_forbid_skill = 9;</code>
       * @param value The isForbidSkill to set.
       * @return This builder for chaining.
       */
      public Builder setIsForbidSkill(boolean value) {
        
        isForbidSkill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forbid_skill = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForbidSkill() {
        
        isForbidSkill_ = false;
        onChanged();
        return this;
      }

      private int fCEACKKGHCL_ ;
      /**
       * <code>uint32 FCEACKKGHCL = 11;</code>
       * @return The fCEACKKGHCL.
       */
      @java.lang.Override
      public int getFCEACKKGHCL() {
        return fCEACKKGHCL_;
      }
      /**
       * <code>uint32 FCEACKKGHCL = 11;</code>
       * @param value The fCEACKKGHCL to set.
       * @return This builder for chaining.
       */
      public Builder setFCEACKKGHCL(int value) {
        
        fCEACKKGHCL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FCEACKKGHCL = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFCEACKKGHCL() {
        
        fCEACKKGHCL_ = 0;
        onChanged();
        return this;
      }

      private int hMFACEEJJDM_ ;
      /**
       * <code>uint32 HMFACEEJJDM = 12;</code>
       * @return The hMFACEEJJDM.
       */
      @java.lang.Override
      public int getHMFACEEJJDM() {
        return hMFACEEJJDM_;
      }
      /**
       * <code>uint32 HMFACEEJJDM = 12;</code>
       * @param value The hMFACEEJJDM to set.
       * @return This builder for chaining.
       */
      public Builder setHMFACEEJJDM(int value) {
        
        hMFACEEJJDM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HMFACEEJJDM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearHMFACEEJJDM() {
        
        hMFACEEJJDM_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList openRoomList_ = emptyIntList();
      private void ensureOpenRoomListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          openRoomList_ = mutableCopy(openRoomList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @return A list containing the openRoomList.
       */
      public java.util.List<java.lang.Integer>
          getOpenRoomListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(openRoomList_) : openRoomList_;
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @return The count of openRoomList.
       */
      public int getOpenRoomListCount() {
        return openRoomList_.size();
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @param index The index of the element to return.
       * @return The openRoomList at the given index.
       */
      public int getOpenRoomList(int index) {
        return openRoomList_.getInt(index);
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The openRoomList to set.
       * @return This builder for chaining.
       */
      public Builder setOpenRoomList(
          int index, int value) {
        ensureOpenRoomListIsMutable();
        openRoomList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @param value The openRoomList to add.
       * @return This builder for chaining.
       */
      public Builder addOpenRoomList(int value) {
        ensureOpenRoomListIsMutable();
        openRoomList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @param values The openRoomList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOpenRoomList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOpenRoomListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, openRoomList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenRoomList() {
        openRoomList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int pMAEONPOMJE_ ;
      /**
       * <code>uint32 PMAEONPOMJE = 14;</code>
       * @return The pMAEONPOMJE.
       */
      @java.lang.Override
      public int getPMAEONPOMJE() {
        return pMAEONPOMJE_;
      }
      /**
       * <code>uint32 PMAEONPOMJE = 14;</code>
       * @param value The pMAEONPOMJE to set.
       * @return This builder for chaining.
       */
      public Builder setPMAEONPOMJE(int value) {
        
        pMAEONPOMJE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PMAEONPOMJE = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPMAEONPOMJE() {
        
        pMAEONPOMJE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonSetting)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonSetting)
    private static final emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting();
    }

    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonSetting>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonSetting>() {
      @java.lang.Override
      public CustomDungeonSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CustomDungeonSetting.proto\"\265\001\n\024CustomD" +
      "ungeonSetting\022\030\n\020is_arrive_finish\030\001 \001(\010\022" +
      "\023\n\013PPBAAMIOPGF\030\002 \001(\r\022\027\n\017is_forbid_skill\030" +
      "\t \001(\010\022\023\n\013FCEACKKGHCL\030\013 \001(\r\022\023\n\013HMFACEEJJD" +
      "M\030\014 \001(\r\022\026\n\016open_room_list\030\r \003(\r\022\023\n\013PMAEO" +
      "NPOMJE\030\016 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonSetting_descriptor,
        new java.lang.String[] { "IsArriveFinish", "PPBAAMIOPGF", "IsForbidSkill", "FCEACKKGHCL", "HMFACEEJJDM", "OpenRoomList", "PMAEONPOMJE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
