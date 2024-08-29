// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassRewardTakeOption.proto

package emu.grasscutter.net.proto;

public final class BattlePassRewardTakeOptionOuterClass {
  private BattlePassRewardTakeOptionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassRewardTakeOptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassRewardTakeOption)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 option_idx = 4;</code>
     * @return The optionIdx.
     */
    int getOptionIdx();

    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     * @return Whether the tag field is set.
     */
    boolean hasTag();
    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     * @return The tag.
     */
    emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getTag();
    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     */
    emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder();
  }
  /**
   * <pre>
   * Version: 4.7.0
   * Obfs: FIMEPLBAJMH
   * </pre>
   *
   * Protobuf type {@code BattlePassRewardTakeOption}
   */
  public static final class BattlePassRewardTakeOption extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassRewardTakeOption)
      BattlePassRewardTakeOptionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassRewardTakeOption.newBuilder() to construct.
    private BattlePassRewardTakeOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassRewardTakeOption() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassRewardTakeOption();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.class, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder.class);
    }

    public static final int OPTION_IDX_FIELD_NUMBER = 4;
    private int optionIdx_;
    /**
     * <code>uint32 option_idx = 4;</code>
     * @return The optionIdx.
     */
    @java.lang.Override
    public int getOptionIdx() {
      return optionIdx_;
    }

    public static final int TAG_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag tag_;
    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     * @return Whether the tag field is set.
     */
    @java.lang.Override
    public boolean hasTag() {
      return tag_ != null;
    }
    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     * @return The tag.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getTag() {
      return tag_ == null ? emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : tag_;
    }
    /**
     * <code>.BattlePassRewardTag tag = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder() {
      return getTag();
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
      if (optionIdx_ != 0) {
        output.writeUInt32(4, optionIdx_);
      }
      if (tag_ != null) {
        output.writeMessage(11, getTag());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (optionIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, optionIdx_);
      }
      if (tag_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getTag());
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption other = (emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption) obj;

      if (getOptionIdx()
          != other.getOptionIdx()) return false;
      if (hasTag() != other.hasTag()) return false;
      if (hasTag()) {
        if (!getTag()
            .equals(other.getTag())) return false;
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
      hash = (37 * hash) + OPTION_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getOptionIdx();
      if (hasTag()) {
        hash = (37 * hash) + TAG_FIELD_NUMBER;
        hash = (53 * hash) + getTag().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption prototype) {
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
     * Version: 4.7.0
     * Obfs: FIMEPLBAJMH
     * </pre>
     *
     * Protobuf type {@code BattlePassRewardTakeOption}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassRewardTakeOption)
        emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.class, emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        optionIdx_ = 0;

        if (tagBuilder_ == null) {
          tag_ = null;
        } else {
          tag_ = null;
          tagBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption build() {
        emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption buildPartial() {
        emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption result = new emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption(this);
        result.optionIdx_ = optionIdx_;
        if (tagBuilder_ == null) {
          result.tag_ = tag_;
        } else {
          result.tag_ = tagBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption other) {
        if (other == emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance()) return this;
        if (other.getOptionIdx() != 0) {
          setOptionIdx(other.getOptionIdx());
        }
        if (other.hasTag()) {
          mergeTag(other.getTag());
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
              case 32: {
                optionIdx_ = input.readUInt32();

                break;
              } // case 32
              case 90: {
                input.readMessage(
                    getTagFieldBuilder().getBuilder(),
                    extensionRegistry);

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

      private int optionIdx_ ;
      /**
       * <code>uint32 option_idx = 4;</code>
       * @return The optionIdx.
       */
      @java.lang.Override
      public int getOptionIdx() {
        return optionIdx_;
      }
      /**
       * <code>uint32 option_idx = 4;</code>
       * @param value The optionIdx to set.
       * @return This builder for chaining.
       */
      public Builder setOptionIdx(int value) {
        
        optionIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_idx = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionIdx() {
        
        optionIdx_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag tag_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> tagBuilder_;
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       * @return Whether the tag field is set.
       */
      public boolean hasTag() {
        return tagBuilder_ != null || tag_ != null;
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       * @return The tag.
       */
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getTag() {
        if (tagBuilder_ == null) {
          return tag_ == null ? emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : tag_;
        } else {
          return tagBuilder_.getMessage();
        }
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public Builder setTag(emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
        if (tagBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tag_ = value;
          onChanged();
        } else {
          tagBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public Builder setTag(
          emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder builderForValue) {
        if (tagBuilder_ == null) {
          tag_ = builderForValue.build();
          onChanged();
        } else {
          tagBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public Builder mergeTag(emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
        if (tagBuilder_ == null) {
          if (tag_ != null) {
            tag_ =
              emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.newBuilder(tag_).mergeFrom(value).buildPartial();
          } else {
            tag_ = value;
          }
          onChanged();
        } else {
          tagBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public Builder clearTag() {
        if (tagBuilder_ == null) {
          tag_ = null;
          onChanged();
        } else {
          tag_ = null;
          tagBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder getTagBuilder() {
        
        onChanged();
        return getTagFieldBuilder().getBuilder();
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder() {
        if (tagBuilder_ != null) {
          return tagBuilder_.getMessageOrBuilder();
        } else {
          return tag_ == null ?
              emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : tag_;
        }
      }
      /**
       * <code>.BattlePassRewardTag tag = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> 
          getTagFieldBuilder() {
        if (tagBuilder_ == null) {
          tagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder>(
                  getTag(),
                  getParentForChildren(),
                  isClean());
          tag_ = null;
        }
        return tagBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BattlePassRewardTakeOption)
    }

    // @@protoc_insertion_point(class_scope:BattlePassRewardTakeOption)
    private static final emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption();
    }

    public static emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassRewardTakeOption>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassRewardTakeOption>() {
      @java.lang.Override
      public BattlePassRewardTakeOption parsePartialFrom(
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

    public static com.google.protobuf.Parser<BattlePassRewardTakeOption> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassRewardTakeOption> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassRewardTakeOption_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassRewardTakeOption_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BattlePassRewardTakeOption.proto\032\031Batt" +
      "lePassRewardTag.proto\"S\n\032BattlePassRewar" +
      "dTakeOption\022\022\n\noption_idx\030\004 \001(\r\022!\n\003tag\030\013" +
      " \001(\0132\024.BattlePassRewardTagB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.getDescriptor(),
        });
    internal_static_BattlePassRewardTakeOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassRewardTakeOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassRewardTakeOption_descriptor,
        new java.lang.String[] { "OptionIdx", "Tag", });
    emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
