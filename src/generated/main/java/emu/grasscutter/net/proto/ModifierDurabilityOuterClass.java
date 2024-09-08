// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ModifierDurability.proto

package emu.grasscutter.net.proto;

public final class ModifierDurabilityOuterClass {
  private ModifierDurabilityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModifierDurabilityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ModifierDurability)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float reduce_ratio = 1;</code>
     * @return The reduceRatio.
     */
    float getReduceRatio();

    /**
     * <code>float remaining_durability = 2;</code>
     * @return The remainingDurability.
     */
    float getRemainingDurability();
  }
  /**
   * <pre>
   * 5.0.0
   * </pre>
   *
   * Protobuf type {@code ModifierDurability}
   */
  public static final class ModifierDurability extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ModifierDurability)
      ModifierDurabilityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifierDurability.newBuilder() to construct.
    private ModifierDurability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifierDurability() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ModifierDurability();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.class, emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.Builder.class);
    }

    public static final int REDUCE_RATIO_FIELD_NUMBER = 1;
    private float reduceRatio_;
    /**
     * <code>float reduce_ratio = 1;</code>
     * @return The reduceRatio.
     */
    @java.lang.Override
    public float getReduceRatio() {
      return reduceRatio_;
    }

    public static final int REMAINING_DURABILITY_FIELD_NUMBER = 2;
    private float remainingDurability_;
    /**
     * <code>float remaining_durability = 2;</code>
     * @return The remainingDurability.
     */
    @java.lang.Override
    public float getRemainingDurability() {
      return remainingDurability_;
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
      if (java.lang.Float.floatToRawIntBits(reduceRatio_) != 0) {
        output.writeFloat(1, reduceRatio_);
      }
      if (java.lang.Float.floatToRawIntBits(remainingDurability_) != 0) {
        output.writeFloat(2, remainingDurability_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(reduceRatio_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, reduceRatio_);
      }
      if (java.lang.Float.floatToRawIntBits(remainingDurability_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, remainingDurability_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability other = (emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability) obj;

      if (java.lang.Float.floatToIntBits(getReduceRatio())
          != java.lang.Float.floatToIntBits(
              other.getReduceRatio())) return false;
      if (java.lang.Float.floatToIntBits(getRemainingDurability())
          != java.lang.Float.floatToIntBits(
              other.getRemainingDurability())) return false;
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
      hash = (37 * hash) + REDUCE_RATIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getReduceRatio());
      hash = (37 * hash) + REMAINING_DURABILITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRemainingDurability());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability prototype) {
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
     * 5.0.0
     * </pre>
     *
     * Protobuf type {@code ModifierDurability}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ModifierDurability)
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.class, emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reduceRatio_ = 0F;

        remainingDurability_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability build() {
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability buildPartial() {
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability result = new emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability(this);
        result.reduceRatio_ = reduceRatio_;
        result.remainingDurability_ = remainingDurability_;
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
        if (other instanceof emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability) {
          return mergeFrom((emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability other) {
        if (other == emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance()) return this;
        if (other.getReduceRatio() != 0F) {
          setReduceRatio(other.getReduceRatio());
        }
        if (other.getRemainingDurability() != 0F) {
          setRemainingDurability(other.getRemainingDurability());
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
              case 13: {
                reduceRatio_ = input.readFloat();

                break;
              } // case 13
              case 21: {
                remainingDurability_ = input.readFloat();

                break;
              } // case 21
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

      private float reduceRatio_ ;
      /**
       * <code>float reduce_ratio = 1;</code>
       * @return The reduceRatio.
       */
      @java.lang.Override
      public float getReduceRatio() {
        return reduceRatio_;
      }
      /**
       * <code>float reduce_ratio = 1;</code>
       * @param value The reduceRatio to set.
       * @return This builder for chaining.
       */
      public Builder setReduceRatio(float value) {
        
        reduceRatio_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float reduce_ratio = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReduceRatio() {
        
        reduceRatio_ = 0F;
        onChanged();
        return this;
      }

      private float remainingDurability_ ;
      /**
       * <code>float remaining_durability = 2;</code>
       * @return The remainingDurability.
       */
      @java.lang.Override
      public float getRemainingDurability() {
        return remainingDurability_;
      }
      /**
       * <code>float remaining_durability = 2;</code>
       * @param value The remainingDurability to set.
       * @return This builder for chaining.
       */
      public Builder setRemainingDurability(float value) {
        
        remainingDurability_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float remaining_durability = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainingDurability() {
        
        remainingDurability_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:ModifierDurability)
    }

    // @@protoc_insertion_point(class_scope:ModifierDurability)
    private static final emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability();
    }

    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ModifierDurability>
        PARSER = new com.google.protobuf.AbstractParser<ModifierDurability>() {
      @java.lang.Override
      public ModifierDurability parsePartialFrom(
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

    public static com.google.protobuf.Parser<ModifierDurability> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ModifierDurability> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifierDurability_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifierDurability_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ModifierDurability.proto\"H\n\022ModifierDu" +
      "rability\022\024\n\014reduce_ratio\030\001 \001(\002\022\034\n\024remain" +
      "ing_durability\030\002 \001(\002B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ModifierDurability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ModifierDurability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifierDurability_descriptor,
        new java.lang.String[] { "ReduceRatio", "RemainingDurability", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
