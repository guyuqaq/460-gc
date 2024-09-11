// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerMonthlyDetail.proto

package emu.grasscutter.net.proto;

public final class TowerMonthlyDetailOuterClass {
  private TowerMonthlyDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerMonthlyDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerMonthlyDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     * @return Whether the monthlyBrief field is set.
     */
    boolean hasMonthlyBrief();
    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     * @return The monthlyBrief.
     */
    emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief();
    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     */
    emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder();

    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     * @return Whether the monthlyCombatRecord field is set.
     */
    boolean hasMonthlyCombatRecord();
    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     * @return The monthlyCombatRecord.
     */
    emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord getMonthlyCombatRecord();
    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     */
    emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder getMonthlyCombatRecordOrBuilder();
  }
  /**
   * Protobuf type {@code TowerMonthlyDetail}
   */
  public static final class TowerMonthlyDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerMonthlyDetail)
      TowerMonthlyDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerMonthlyDetail.newBuilder() to construct.
    private TowerMonthlyDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerMonthlyDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerMonthlyDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.internal_static_TowerMonthlyDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.internal_static_TowerMonthlyDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.class, emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder.class);
    }

    public static final int MONTHLY_BRIEF_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief monthlyBrief_;
    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     * @return Whether the monthlyBrief field is set.
     */
    @java.lang.Override
    public boolean hasMonthlyBrief() {
      return monthlyBrief_ != null;
    }
    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     * @return The monthlyBrief.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief() {
      return monthlyBrief_ == null ? emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : monthlyBrief_;
    }
    /**
     * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder() {
      return getMonthlyBrief();
    }

    public static final int MONTHLY_COMBAT_RECORD_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord monthlyCombatRecord_;
    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     * @return Whether the monthlyCombatRecord field is set.
     */
    @java.lang.Override
    public boolean hasMonthlyCombatRecord() {
      return monthlyCombatRecord_ != null;
    }
    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     * @return The monthlyCombatRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord getMonthlyCombatRecord() {
      return monthlyCombatRecord_ == null ? emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.getDefaultInstance() : monthlyCombatRecord_;
    }
    /**
     * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder getMonthlyCombatRecordOrBuilder() {
      return getMonthlyCombatRecord();
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
      if (monthlyBrief_ != null) {
        output.writeMessage(1, getMonthlyBrief());
      }
      if (monthlyCombatRecord_ != null) {
        output.writeMessage(9, getMonthlyCombatRecord());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monthlyBrief_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMonthlyBrief());
      }
      if (monthlyCombatRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getMonthlyCombatRecord());
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail other = (emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail) obj;

      if (hasMonthlyBrief() != other.hasMonthlyBrief()) return false;
      if (hasMonthlyBrief()) {
        if (!getMonthlyBrief()
            .equals(other.getMonthlyBrief())) return false;
      }
      if (hasMonthlyCombatRecord() != other.hasMonthlyCombatRecord()) return false;
      if (hasMonthlyCombatRecord()) {
        if (!getMonthlyCombatRecord()
            .equals(other.getMonthlyCombatRecord())) return false;
      }
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
      if (hasMonthlyBrief()) {
        hash = (37 * hash) + MONTHLY_BRIEF_FIELD_NUMBER;
        hash = (53 * hash) + getMonthlyBrief().hashCode();
      }
      if (hasMonthlyCombatRecord()) {
        hash = (37 * hash) + MONTHLY_COMBAT_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getMonthlyCombatRecord().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail prototype) {
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
     * Protobuf type {@code TowerMonthlyDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerMonthlyDetail)
        emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.internal_static_TowerMonthlyDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.internal_static_TowerMonthlyDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.class, emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (monthlyBriefBuilder_ == null) {
          monthlyBrief_ = null;
        } else {
          monthlyBrief_ = null;
          monthlyBriefBuilder_ = null;
        }
        if (monthlyCombatRecordBuilder_ == null) {
          monthlyCombatRecord_ = null;
        } else {
          monthlyCombatRecord_ = null;
          monthlyCombatRecordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.internal_static_TowerMonthlyDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail build() {
        emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail buildPartial() {
        emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail result = new emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail(this);
        if (monthlyBriefBuilder_ == null) {
          result.monthlyBrief_ = monthlyBrief_;
        } else {
          result.monthlyBrief_ = monthlyBriefBuilder_.build();
        }
        if (monthlyCombatRecordBuilder_ == null) {
          result.monthlyCombatRecord_ = monthlyCombatRecord_;
        } else {
          result.monthlyCombatRecord_ = monthlyCombatRecordBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail) {
          return mergeFrom((emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail other) {
        if (other == emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.getDefaultInstance()) return this;
        if (other.hasMonthlyBrief()) {
          mergeMonthlyBrief(other.getMonthlyBrief());
        }
        if (other.hasMonthlyCombatRecord()) {
          mergeMonthlyCombatRecord(other.getMonthlyCombatRecord());
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
              case 10: {
                input.readMessage(
                    getMonthlyBriefFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 74: {
                input.readMessage(
                    getMonthlyCombatRecordFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 74
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

      private emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief monthlyBrief_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> monthlyBriefBuilder_;
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       * @return Whether the monthlyBrief field is set.
       */
      public boolean hasMonthlyBrief() {
        return monthlyBriefBuilder_ != null || monthlyBrief_ != null;
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       * @return The monthlyBrief.
       */
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getMonthlyBrief() {
        if (monthlyBriefBuilder_ == null) {
          return monthlyBrief_ == null ? emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : monthlyBrief_;
        } else {
          return monthlyBriefBuilder_.getMessage();
        }
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public Builder setMonthlyBrief(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
        if (monthlyBriefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monthlyBrief_ = value;
          onChanged();
        } else {
          monthlyBriefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public Builder setMonthlyBrief(
          emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder builderForValue) {
        if (monthlyBriefBuilder_ == null) {
          monthlyBrief_ = builderForValue.build();
          onChanged();
        } else {
          monthlyBriefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public Builder mergeMonthlyBrief(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief value) {
        if (monthlyBriefBuilder_ == null) {
          if (monthlyBrief_ != null) {
            monthlyBrief_ =
              emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.newBuilder(monthlyBrief_).mergeFrom(value).buildPartial();
          } else {
            monthlyBrief_ = value;
          }
          onChanged();
        } else {
          monthlyBriefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public Builder clearMonthlyBrief() {
        if (monthlyBriefBuilder_ == null) {
          monthlyBrief_ = null;
          onChanged();
        } else {
          monthlyBrief_ = null;
          monthlyBriefBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder getMonthlyBriefBuilder() {
        
        onChanged();
        return getMonthlyBriefFieldBuilder().getBuilder();
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder getMonthlyBriefOrBuilder() {
        if (monthlyBriefBuilder_ != null) {
          return monthlyBriefBuilder_.getMessageOrBuilder();
        } else {
          return monthlyBrief_ == null ?
              emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance() : monthlyBrief_;
        }
      }
      /**
       * <code>.TowerMonthlyBrief monthly_brief = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder> 
          getMonthlyBriefFieldBuilder() {
        if (monthlyBriefBuilder_ == null) {
          monthlyBriefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder>(
                  getMonthlyBrief(),
                  getParentForChildren(),
                  isClean());
          monthlyBrief_ = null;
        }
        return monthlyBriefBuilder_;
      }

      private emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord monthlyCombatRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.Builder, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder> monthlyCombatRecordBuilder_;
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       * @return Whether the monthlyCombatRecord field is set.
       */
      public boolean hasMonthlyCombatRecord() {
        return monthlyCombatRecordBuilder_ != null || monthlyCombatRecord_ != null;
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       * @return The monthlyCombatRecord.
       */
      public emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord getMonthlyCombatRecord() {
        if (monthlyCombatRecordBuilder_ == null) {
          return monthlyCombatRecord_ == null ? emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.getDefaultInstance() : monthlyCombatRecord_;
        } else {
          return monthlyCombatRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public Builder setMonthlyCombatRecord(emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord value) {
        if (monthlyCombatRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monthlyCombatRecord_ = value;
          onChanged();
        } else {
          monthlyCombatRecordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public Builder setMonthlyCombatRecord(
          emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.Builder builderForValue) {
        if (monthlyCombatRecordBuilder_ == null) {
          monthlyCombatRecord_ = builderForValue.build();
          onChanged();
        } else {
          monthlyCombatRecordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public Builder mergeMonthlyCombatRecord(emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord value) {
        if (monthlyCombatRecordBuilder_ == null) {
          if (monthlyCombatRecord_ != null) {
            monthlyCombatRecord_ =
              emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.newBuilder(monthlyCombatRecord_).mergeFrom(value).buildPartial();
          } else {
            monthlyCombatRecord_ = value;
          }
          onChanged();
        } else {
          monthlyCombatRecordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public Builder clearMonthlyCombatRecord() {
        if (monthlyCombatRecordBuilder_ == null) {
          monthlyCombatRecord_ = null;
          onChanged();
        } else {
          monthlyCombatRecord_ = null;
          monthlyCombatRecordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.Builder getMonthlyCombatRecordBuilder() {
        
        onChanged();
        return getMonthlyCombatRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      public emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder getMonthlyCombatRecordOrBuilder() {
        if (monthlyCombatRecordBuilder_ != null) {
          return monthlyCombatRecordBuilder_.getMessageOrBuilder();
        } else {
          return monthlyCombatRecord_ == null ?
              emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.getDefaultInstance() : monthlyCombatRecord_;
        }
      }
      /**
       * <code>.TowerMonthlyCombatRecord monthly_combat_record = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.Builder, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder> 
          getMonthlyCombatRecordFieldBuilder() {
        if (monthlyCombatRecordBuilder_ == null) {
          monthlyCombatRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecord.Builder, emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.TowerMonthlyCombatRecordOrBuilder>(
                  getMonthlyCombatRecord(),
                  getParentForChildren(),
                  isClean());
          monthlyCombatRecord_ = null;
        }
        return monthlyCombatRecordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerMonthlyDetail)
    }

    // @@protoc_insertion_point(class_scope:TowerMonthlyDetail)
    private static final emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail();
    }

    public static emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerMonthlyDetail>
        PARSER = new com.google.protobuf.AbstractParser<TowerMonthlyDetail>() {
      @java.lang.Override
      public TowerMonthlyDetail parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerMonthlyDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerMonthlyDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerMonthlyDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerMonthlyDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TowerMonthlyDetail.proto\032\027TowerMonthly" +
      "Brief.proto\032\036TowerMonthlyCombatRecord.pr" +
      "oto\"y\n\022TowerMonthlyDetail\022)\n\rmonthly_bri" +
      "ef\030\001 \001(\0132\022.TowerMonthlyBrief\0228\n\025monthly_" +
      "combat_record\030\t \001(\0132\031.TowerMonthlyCombat" +
      "RecordB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.getDescriptor(),
        });
    internal_static_TowerMonthlyDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerMonthlyDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerMonthlyDetail_descriptor,
        new java.lang.String[] { "MonthlyBrief", "MonthlyCombatRecord", });
    emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.getDescriptor();
    emu.grasscutter.net.proto.TowerMonthlyCombatRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
