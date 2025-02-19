// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BatchBuyGoodsReq.proto

package emu.grasscutter.net.proto;

public final class BatchBuyGoodsReqOuterClass {
  private BatchBuyGoodsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BatchBuyGoodsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BatchBuyGoodsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 shop_type = 2;</code>
     * @return The shopType.
     */
    int getShopType();

    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> 
        getBuyGoodsListList();
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam getBuyGoodsList(int index);
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    int getBuyGoodsListCount();
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder> 
        getBuyGoodsListOrBuilderList();
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder getBuyGoodsListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 21323
   * Version: 4.7.0
   * Obfs: GJPKFIHDNNF
   * </pre>
   *
   * Protobuf type {@code BatchBuyGoodsReq}
   */
  public static final class BatchBuyGoodsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BatchBuyGoodsReq)
      BatchBuyGoodsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BatchBuyGoodsReq.newBuilder() to construct.
    private BatchBuyGoodsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BatchBuyGoodsReq() {
      buyGoodsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BatchBuyGoodsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.internal_static_BatchBuyGoodsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.internal_static_BatchBuyGoodsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.class, emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.Builder.class);
    }

    public static final int SHOP_TYPE_FIELD_NUMBER = 2;
    private int shopType_;
    /**
     * <code>uint32 shop_type = 2;</code>
     * @return The shopType.
     */
    @java.lang.Override
    public int getShopType() {
      return shopType_;
    }

    public static final int BUY_GOODS_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> buyGoodsList_;
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> getBuyGoodsListList() {
      return buyGoodsList_;
    }
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder> 
        getBuyGoodsListOrBuilderList() {
      return buyGoodsList_;
    }
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    @java.lang.Override
    public int getBuyGoodsListCount() {
      return buyGoodsList_.size();
    }
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam getBuyGoodsList(int index) {
      return buyGoodsList_.get(index);
    }
    /**
     * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder getBuyGoodsListOrBuilder(
        int index) {
      return buyGoodsList_.get(index);
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
      if (shopType_ != 0) {
        output.writeUInt32(2, shopType_);
      }
      for (int i = 0; i < buyGoodsList_.size(); i++) {
        output.writeMessage(4, buyGoodsList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shopType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, shopType_);
      }
      for (int i = 0; i < buyGoodsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, buyGoodsList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq other = (emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq) obj;

      if (getShopType()
          != other.getShopType()) return false;
      if (!getBuyGoodsListList()
          .equals(other.getBuyGoodsListList())) return false;
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
      hash = (37 * hash) + SHOP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShopType();
      if (getBuyGoodsListCount() > 0) {
        hash = (37 * hash) + BUY_GOODS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBuyGoodsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq prototype) {
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
     * CmdId: 21323
     * Version: 4.7.0
     * Obfs: GJPKFIHDNNF
     * </pre>
     *
     * Protobuf type {@code BatchBuyGoodsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BatchBuyGoodsReq)
        emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.internal_static_BatchBuyGoodsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.internal_static_BatchBuyGoodsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.class, emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        shopType_ = 0;

        if (buyGoodsListBuilder_ == null) {
          buyGoodsList_ = java.util.Collections.emptyList();
        } else {
          buyGoodsList_ = null;
          buyGoodsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.internal_static_BatchBuyGoodsReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq build() {
        emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq buildPartial() {
        emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq result = new emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq(this);
        int from_bitField0_ = bitField0_;
        result.shopType_ = shopType_;
        if (buyGoodsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            buyGoodsList_ = java.util.Collections.unmodifiableList(buyGoodsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.buyGoodsList_ = buyGoodsList_;
        } else {
          result.buyGoodsList_ = buyGoodsListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq) {
          return mergeFrom((emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq other) {
        if (other == emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq.getDefaultInstance()) return this;
        if (other.getShopType() != 0) {
          setShopType(other.getShopType());
        }
        if (buyGoodsListBuilder_ == null) {
          if (!other.buyGoodsList_.isEmpty()) {
            if (buyGoodsList_.isEmpty()) {
              buyGoodsList_ = other.buyGoodsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBuyGoodsListIsMutable();
              buyGoodsList_.addAll(other.buyGoodsList_);
            }
            onChanged();
          }
        } else {
          if (!other.buyGoodsList_.isEmpty()) {
            if (buyGoodsListBuilder_.isEmpty()) {
              buyGoodsListBuilder_.dispose();
              buyGoodsListBuilder_ = null;
              buyGoodsList_ = other.buyGoodsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              buyGoodsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBuyGoodsListFieldBuilder() : null;
            } else {
              buyGoodsListBuilder_.addAllMessages(other.buyGoodsList_);
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
              case 16: {
                shopType_ = input.readUInt32();

                break;
              } // case 16
              case 34: {
                emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.parser(),
                        extensionRegistry);
                if (buyGoodsListBuilder_ == null) {
                  ensureBuyGoodsListIsMutable();
                  buyGoodsList_.add(m);
                } else {
                  buyGoodsListBuilder_.addMessage(m);
                }
                break;
              } // case 34
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

      private int shopType_ ;
      /**
       * <code>uint32 shop_type = 2;</code>
       * @return The shopType.
       */
      @java.lang.Override
      public int getShopType() {
        return shopType_;
      }
      /**
       * <code>uint32 shop_type = 2;</code>
       * @param value The shopType to set.
       * @return This builder for chaining.
       */
      public Builder setShopType(int value) {
        
        shopType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shop_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopType() {
        
        shopType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> buyGoodsList_ =
        java.util.Collections.emptyList();
      private void ensureBuyGoodsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          buyGoodsList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam>(buyGoodsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder> buyGoodsListBuilder_;

      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> getBuyGoodsListList() {
        if (buyGoodsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(buyGoodsList_);
        } else {
          return buyGoodsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public int getBuyGoodsListCount() {
        if (buyGoodsListBuilder_ == null) {
          return buyGoodsList_.size();
        } else {
          return buyGoodsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam getBuyGoodsList(int index) {
        if (buyGoodsListBuilder_ == null) {
          return buyGoodsList_.get(index);
        } else {
          return buyGoodsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder setBuyGoodsList(
          int index, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam value) {
        if (buyGoodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.set(index, value);
          onChanged();
        } else {
          buyGoodsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder setBuyGoodsList(
          int index, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder builderForValue) {
        if (buyGoodsListBuilder_ == null) {
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          buyGoodsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder addBuyGoodsList(emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam value) {
        if (buyGoodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.add(value);
          onChanged();
        } else {
          buyGoodsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder addBuyGoodsList(
          int index, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam value) {
        if (buyGoodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.add(index, value);
          onChanged();
        } else {
          buyGoodsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder addBuyGoodsList(
          emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder builderForValue) {
        if (buyGoodsListBuilder_ == null) {
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.add(builderForValue.build());
          onChanged();
        } else {
          buyGoodsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder addBuyGoodsList(
          int index, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder builderForValue) {
        if (buyGoodsListBuilder_ == null) {
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          buyGoodsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder addAllBuyGoodsList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam> values) {
        if (buyGoodsListBuilder_ == null) {
          ensureBuyGoodsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, buyGoodsList_);
          onChanged();
        } else {
          buyGoodsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder clearBuyGoodsList() {
        if (buyGoodsListBuilder_ == null) {
          buyGoodsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          buyGoodsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public Builder removeBuyGoodsList(int index) {
        if (buyGoodsListBuilder_ == null) {
          ensureBuyGoodsListIsMutable();
          buyGoodsList_.remove(index);
          onChanged();
        } else {
          buyGoodsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder getBuyGoodsListBuilder(
          int index) {
        return getBuyGoodsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder getBuyGoodsListOrBuilder(
          int index) {
        if (buyGoodsListBuilder_ == null) {
          return buyGoodsList_.get(index);  } else {
          return buyGoodsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder> 
           getBuyGoodsListOrBuilderList() {
        if (buyGoodsListBuilder_ != null) {
          return buyGoodsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(buyGoodsList_);
        }
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder addBuyGoodsListBuilder() {
        return getBuyGoodsListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.getDefaultInstance());
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder addBuyGoodsListBuilder(
          int index) {
        return getBuyGoodsListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.getDefaultInstance());
      }
      /**
       * <code>repeated .BuyGoodsParam buy_goods_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder> 
           getBuyGoodsListBuilderList() {
        return getBuyGoodsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder> 
          getBuyGoodsListFieldBuilder() {
        if (buyGoodsListBuilder_ == null) {
          buyGoodsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParam.Builder, emu.grasscutter.net.proto.BuyGoodsParamOuterClass.BuyGoodsParamOrBuilder>(
                  buyGoodsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          buyGoodsList_ = null;
        }
        return buyGoodsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BatchBuyGoodsReq)
    }

    // @@protoc_insertion_point(class_scope:BatchBuyGoodsReq)
    private static final emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq();
    }

    public static emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BatchBuyGoodsReq>
        PARSER = new com.google.protobuf.AbstractParser<BatchBuyGoodsReq>() {
      @java.lang.Override
      public BatchBuyGoodsReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BatchBuyGoodsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BatchBuyGoodsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BatchBuyGoodsReqOuterClass.BatchBuyGoodsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BatchBuyGoodsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BatchBuyGoodsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BatchBuyGoodsReq.proto\032\023BuyGoodsParam." +
      "proto\"M\n\020BatchBuyGoodsReq\022\021\n\tshop_type\030\002" +
      " \001(\r\022&\n\016buy_goods_list\030\004 \003(\0132\016.BuyGoodsP" +
      "aramB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BuyGoodsParamOuterClass.getDescriptor(),
        });
    internal_static_BatchBuyGoodsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BatchBuyGoodsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BatchBuyGoodsReq_descriptor,
        new java.lang.String[] { "ShopType", "BuyGoodsList", });
    emu.grasscutter.net.proto.BuyGoodsParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
