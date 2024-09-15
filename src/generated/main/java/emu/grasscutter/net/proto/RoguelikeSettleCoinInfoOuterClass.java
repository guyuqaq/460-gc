// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeSettleCoinInfo.proto

package emu.grasscutter.net.proto;

public final class RoguelikeSettleCoinInfoOuterClass {
  private RoguelikeSettleCoinInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeSettleCoinInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeSettleCoinInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cell_num = 10;</code>
     * @return The cellNum.
     */
    int getCellNum();

    /**
     * <code>uint32 coin_b = 14;</code>
     * @return The coinB.
     */
    int getCoinB();

    /**
     * <code>uint32 coin_c = 15;</code>
     * @return The coinC.
     */
    int getCoinC();
  }
  /**
   * Protobuf type {@code RoguelikeSettleCoinInfo}
   */
  public static final class RoguelikeSettleCoinInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeSettleCoinInfo)
      RoguelikeSettleCoinInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeSettleCoinInfo.newBuilder() to construct.
    private RoguelikeSettleCoinInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeSettleCoinInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeSettleCoinInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeSettleCoinInfo(
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
            case 80: {

              cellNum_ = input.readUInt32();
              break;
            }
            case 112: {

              coinB_ = input.readUInt32();
              break;
            }
            case 120: {

              coinC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.class, emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.Builder.class);
    }

    public static final int CELL_NUM_FIELD_NUMBER = 10;
    private int cellNum_;
    /**
     * <code>uint32 cell_num = 10;</code>
     * @return The cellNum.
     */
    @java.lang.Override
    public int getCellNum() {
      return cellNum_;
    }

    public static final int COIN_B_FIELD_NUMBER = 14;
    private int coinB_;
    /**
     * <code>uint32 coin_b = 14;</code>
     * @return The coinB.
     */
    @java.lang.Override
    public int getCoinB() {
      return coinB_;
    }

    public static final int COIN_C_FIELD_NUMBER = 15;
    private int coinC_;
    /**
     * <code>uint32 coin_c = 15;</code>
     * @return The coinC.
     */
    @java.lang.Override
    public int getCoinC() {
      return coinC_;
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
      if (cellNum_ != 0) {
        output.writeUInt32(10, cellNum_);
      }
      if (coinB_ != 0) {
        output.writeUInt32(14, coinB_);
      }
      if (coinC_ != 0) {
        output.writeUInt32(15, coinC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cellNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cellNum_);
      }
      if (coinB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, coinB_);
      }
      if (coinC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, coinC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo other = (emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo) obj;

      if (getCellNum()
          != other.getCellNum()) return false;
      if (getCoinB()
          != other.getCoinB()) return false;
      if (getCoinC()
          != other.getCoinC()) return false;
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
      hash = (37 * hash) + CELL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCellNum();
      hash = (37 * hash) + COIN_B_FIELD_NUMBER;
      hash = (53 * hash) + getCoinB();
      hash = (37 * hash) + COIN_C_FIELD_NUMBER;
      hash = (53 * hash) + getCoinC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo prototype) {
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
     * Protobuf type {@code RoguelikeSettleCoinInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeSettleCoinInfo)
        emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.class, emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.newBuilder()
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
        cellNum_ = 0;

        coinB_ = 0;

        coinC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo build() {
        emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo buildPartial() {
        emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo result = new emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo(this);
        result.cellNum_ = cellNum_;
        result.coinB_ = coinB_;
        result.coinC_ = coinC_;
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
        if (other instanceof emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo) {
          return mergeFrom((emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo other) {
        if (other == emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo.getDefaultInstance()) return this;
        if (other.getCellNum() != 0) {
          setCellNum(other.getCellNum());
        }
        if (other.getCoinB() != 0) {
          setCoinB(other.getCoinB());
        }
        if (other.getCoinC() != 0) {
          setCoinC(other.getCoinC());
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
        emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cellNum_ ;
      /**
       * <code>uint32 cell_num = 10;</code>
       * @return The cellNum.
       */
      @java.lang.Override
      public int getCellNum() {
        return cellNum_;
      }
      /**
       * <code>uint32 cell_num = 10;</code>
       * @param value The cellNum to set.
       * @return This builder for chaining.
       */
      public Builder setCellNum(int value) {
        
        cellNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellNum() {
        
        cellNum_ = 0;
        onChanged();
        return this;
      }

      private int coinB_ ;
      /**
       * <code>uint32 coin_b = 14;</code>
       * @return The coinB.
       */
      @java.lang.Override
      public int getCoinB() {
        return coinB_;
      }
      /**
       * <code>uint32 coin_b = 14;</code>
       * @param value The coinB to set.
       * @return This builder for chaining.
       */
      public Builder setCoinB(int value) {
        
        coinB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_b = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinB() {
        
        coinB_ = 0;
        onChanged();
        return this;
      }

      private int coinC_ ;
      /**
       * <code>uint32 coin_c = 15;</code>
       * @return The coinC.
       */
      @java.lang.Override
      public int getCoinC() {
        return coinC_;
      }
      /**
       * <code>uint32 coin_c = 15;</code>
       * @param value The coinC to set.
       * @return This builder for chaining.
       */
      public Builder setCoinC(int value) {
        
        coinC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_c = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinC() {
        
        coinC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeSettleCoinInfo)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeSettleCoinInfo)
    private static final emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo();
    }

    public static emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeSettleCoinInfo>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeSettleCoinInfo>() {
      @java.lang.Override
      public RoguelikeSettleCoinInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeSettleCoinInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeSettleCoinInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeSettleCoinInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeSettleCoinInfoOuterClass.RoguelikeSettleCoinInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeSettleCoinInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RoguelikeSettleCoinInfo.proto\"K\n\027Rogue" +
      "likeSettleCoinInfo\022\020\n\010cell_num\030\n \001(\r\022\016\n\006" +
      "coin_b\030\016 \001(\r\022\016\n\006coin_c\030\017 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeSettleCoinInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeSettleCoinInfo_descriptor,
        new java.lang.String[] { "CellNum", "CoinB", "CoinC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
