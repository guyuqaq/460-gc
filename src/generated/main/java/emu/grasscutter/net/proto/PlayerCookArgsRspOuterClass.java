// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCookArgsRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerCookArgsRspOuterClass {
  private PlayerCookArgsRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCookArgsRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCookArgsRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>float DIKKLMDPMAN = 15;</code>
     * @return The dIKKLMDPMAN.
     */
    float getDIKKLMDPMAN();
  }
  /**
   * <pre>
   * CmdId: 7024
   * </pre>
   *
   * Protobuf type {@code PlayerCookArgsRsp}
   */
  public static final class PlayerCookArgsRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCookArgsRsp)
      PlayerCookArgsRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCookArgsRsp.newBuilder() to construct.
    private PlayerCookArgsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCookArgsRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCookArgsRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.class, emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DIKKLMDPMAN_FIELD_NUMBER = 15;
    private float dIKKLMDPMAN_;
    /**
     * <code>float DIKKLMDPMAN = 15;</code>
     * @return The dIKKLMDPMAN.
     */
    @java.lang.Override
    public float getDIKKLMDPMAN() {
      return dIKKLMDPMAN_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (java.lang.Float.floatToRawIntBits(dIKKLMDPMAN_) != 0) {
        output.writeFloat(15, dIKKLMDPMAN_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (java.lang.Float.floatToRawIntBits(dIKKLMDPMAN_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(15, dIKKLMDPMAN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp other = (emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (java.lang.Float.floatToIntBits(getDIKKLMDPMAN())
          != java.lang.Float.floatToIntBits(
              other.getDIKKLMDPMAN())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + DIKKLMDPMAN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDIKKLMDPMAN());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp prototype) {
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
     * CmdId: 7024
     * </pre>
     *
     * Protobuf type {@code PlayerCookArgsRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCookArgsRsp)
        emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.class, emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        dIKKLMDPMAN_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp build() {
        emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp buildPartial() {
        emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp result = new emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp(this);
        result.retcode_ = retcode_;
        result.dIKKLMDPMAN_ = dIKKLMDPMAN_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp other) {
        if (other == emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getDIKKLMDPMAN() != 0F) {
          setDIKKLMDPMAN(other.getDIKKLMDPMAN());
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
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 125: {
                dIKKLMDPMAN_ = input.readFloat();

                break;
              } // case 125
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private float dIKKLMDPMAN_ ;
      /**
       * <code>float DIKKLMDPMAN = 15;</code>
       * @return The dIKKLMDPMAN.
       */
      @java.lang.Override
      public float getDIKKLMDPMAN() {
        return dIKKLMDPMAN_;
      }
      /**
       * <code>float DIKKLMDPMAN = 15;</code>
       * @param value The dIKKLMDPMAN to set.
       * @return This builder for chaining.
       */
      public Builder setDIKKLMDPMAN(float value) {
        
        dIKKLMDPMAN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float DIKKLMDPMAN = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDIKKLMDPMAN() {
        
        dIKKLMDPMAN_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:PlayerCookArgsRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerCookArgsRsp)
    private static final emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp();
    }

    public static emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCookArgsRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCookArgsRsp>() {
      @java.lang.Override
      public PlayerCookArgsRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCookArgsRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCookArgsRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCookArgsRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCookArgsRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerCookArgsRsp.proto\"9\n\021PlayerCookA" +
      "rgsRsp\022\017\n\007retcode\030\006 \001(\005\022\023\n\013DIKKLMDPMAN\030\017" +
      " \001(\002B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCookArgsRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCookArgsRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCookArgsRsp_descriptor,
        new java.lang.String[] { "Retcode", "DIKKLMDPMAN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
