// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeleteFriendReq.proto

package emu.grasscutter.net.proto;

public final class DeleteFriendReqOuterClass {
  private DeleteFriendReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeleteFriendReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeleteFriendReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 4;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 26120
   * Obf: BPDICGMOACG
   * </pre>
   *
   * Protobuf type {@code DeleteFriendReq}
   */
  public static final class DeleteFriendReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeleteFriendReq)
      DeleteFriendReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeleteFriendReq.newBuilder() to construct.
    private DeleteFriendReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeleteFriendReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeleteFriendReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.internal_static_DeleteFriendReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.internal_static_DeleteFriendReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.class, emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.Builder.class);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 4;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 4;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (targetUid_ != 0) {
        output.writeUInt32(4, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq other = (emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq prototype) {
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
     * CmdId: 26120
     * Obf: BPDICGMOACG
     * </pre>
     *
     * Protobuf type {@code DeleteFriendReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeleteFriendReq)
        emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.internal_static_DeleteFriendReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.internal_static_DeleteFriendReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.class, emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.internal_static_DeleteFriendReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq build() {
        emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq buildPartial() {
        emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq result = new emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq(this);
        result.targetUid_ = targetUid_;
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
        if (other instanceof emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq) {
          return mergeFrom((emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq other) {
        if (other == emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
                targetUid_ = input.readUInt32();

                break;
              } // case 32
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

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 4;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 4;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DeleteFriendReq)
    }

    // @@protoc_insertion_point(class_scope:DeleteFriendReq)
    private static final emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq();
    }

    public static emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeleteFriendReq>
        PARSER = new com.google.protobuf.AbstractParser<DeleteFriendReq>() {
      @java.lang.Override
      public DeleteFriendReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DeleteFriendReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeleteFriendReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteFriendReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteFriendReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025DeleteFriendReq.proto\"%\n\017DeleteFriendR" +
      "eq\022\022\n\ntarget_uid\030\004 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeleteFriendReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeleteFriendReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteFriendReq_descriptor,
        new java.lang.String[] { "TargetUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
