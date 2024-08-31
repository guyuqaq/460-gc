// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSaveArrangementNoChangeRsp.proto

package emu.grasscutter.net.proto;

public final class HomeSaveArrangementNoChangeRspOuterClass {
  private HomeSaveArrangementNoChangeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSaveArrangementNoChangeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSaveArrangementNoChangeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 6397,
   * Version: 4.7.0
   * Obfs: ?
   * </pre>
   *
   * Protobuf type {@code HomeSaveArrangementNoChangeRsp}
   */
  public static final class HomeSaveArrangementNoChangeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSaveArrangementNoChangeRsp)
      HomeSaveArrangementNoChangeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSaveArrangementNoChangeRsp.newBuilder() to construct.
    private HomeSaveArrangementNoChangeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSaveArrangementNoChangeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSaveArrangementNoChangeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.internal_static_HomeSaveArrangementNoChangeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.internal_static_HomeSaveArrangementNoChangeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.class, emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 11;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
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
      if (sceneId_ != 0) {
        output.writeUInt32(11, sceneId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sceneId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp other = (emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp prototype) {
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
     * CmdId: 6397,
     * Version: 4.7.0
     * Obfs: ?
     * </pre>
     *
     * Protobuf type {@code HomeSaveArrangementNoChangeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSaveArrangementNoChangeRsp)
        emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.internal_static_HomeSaveArrangementNoChangeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.internal_static_HomeSaveArrangementNoChangeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.class, emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.internal_static_HomeSaveArrangementNoChangeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp build() {
        emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp buildPartial() {
        emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp result = new emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp(this);
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp other) {
        if (other == emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
              case 88: {
                sceneId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                retcode_ = input.readInt32();

                break;
              } // case 96
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

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 11;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 11;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeSaveArrangementNoChangeRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSaveArrangementNoChangeRsp)
    private static final emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp();
    }

    public static emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSaveArrangementNoChangeRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSaveArrangementNoChangeRsp>() {
      @java.lang.Override
      public HomeSaveArrangementNoChangeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSaveArrangementNoChangeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSaveArrangementNoChangeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSaveArrangementNoChangeRspOuterClass.HomeSaveArrangementNoChangeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSaveArrangementNoChangeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSaveArrangementNoChangeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeSaveArrangementNoChangeRsp.proto\"C" +
      "\n\036HomeSaveArrangementNoChangeRsp\022\020\n\010scen" +
      "e_id\030\013 \001(\r\022\017\n\007retcode\030\014 \001(\005B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSaveArrangementNoChangeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSaveArrangementNoChangeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSaveArrangementNoChangeRsp_descriptor,
        new java.lang.String[] { "SceneId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
