// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeRegionSearchRewardRsp.proto

package emu.grasscutter.net.proto;

public final class TakeRegionSearchRewardRspOuterClass {
  private TakeRegionSearchRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeRegionSearchRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeRegionSearchRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 search_id = 14;</code>
     * @return The searchId.
     */
    int getSearchId();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 21785
   * </pre>
   *
   * Protobuf type {@code TakeRegionSearchRewardRsp}
   */
  public static final class TakeRegionSearchRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeRegionSearchRewardRsp)
      TakeRegionSearchRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeRegionSearchRewardRsp.newBuilder() to construct.
    private TakeRegionSearchRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeRegionSearchRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeRegionSearchRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.internal_static_TakeRegionSearchRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.internal_static_TakeRegionSearchRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.class, emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.Builder.class);
    }

    public static final int SEARCH_ID_FIELD_NUMBER = 14;
    private int searchId_;
    /**
     * <code>uint32 search_id = 14;</code>
     * @return The searchId.
     */
    @java.lang.Override
    public int getSearchId() {
      return searchId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
        output.writeInt32(5, retcode_);
      }
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      if (searchId_ != 0) {
        output.writeUInt32(14, searchId_);
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
          .computeInt32Size(5, retcode_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
      }
      if (searchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, searchId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp other = (emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp) obj;

      if (getSearchId()
          != other.getSearchId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + SEARCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSearchId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp prototype) {
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
     * CmdId: 21785
     * </pre>
     *
     * Protobuf type {@code TakeRegionSearchRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeRegionSearchRewardRsp)
        emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.internal_static_TakeRegionSearchRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.internal_static_TakeRegionSearchRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.class, emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        searchId_ = 0;

        retcode_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.internal_static_TakeRegionSearchRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp build() {
        emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp buildPartial() {
        emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp result = new emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp(this);
        result.searchId_ = searchId_;
        result.retcode_ = retcode_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp other) {
        if (other == emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp.getDefaultInstance()) return this;
        if (other.getSearchId() != 0) {
          setSearchId(other.getSearchId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 40: {
                retcode_ = input.readInt32();

                break;
              } // case 40
              case 64: {
                id_ = input.readUInt32();

                break;
              } // case 64
              case 112: {
                searchId_ = input.readUInt32();

                break;
              } // case 112
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

      private int searchId_ ;
      /**
       * <code>uint32 search_id = 14;</code>
       * @return The searchId.
       */
      @java.lang.Override
      public int getSearchId() {
        return searchId_;
      }
      /**
       * <code>uint32 search_id = 14;</code>
       * @param value The searchId to set.
       * @return This builder for chaining.
       */
      public Builder setSearchId(int value) {
        
        searchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 search_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSearchId() {
        
        searchId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeRegionSearchRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeRegionSearchRewardRsp)
    private static final emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp();
    }

    public static emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeRegionSearchRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeRegionSearchRewardRsp>() {
      @java.lang.Override
      public TakeRegionSearchRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeRegionSearchRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeRegionSearchRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeRegionSearchRewardRspOuterClass.TakeRegionSearchRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeRegionSearchRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeRegionSearchRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TakeRegionSearchRewardRsp.proto\"K\n\031Tak" +
      "eRegionSearchRewardRsp\022\021\n\tsearch_id\030\016 \001(" +
      "\r\022\017\n\007retcode\030\005 \001(\005\022\n\n\002id\030\010 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeRegionSearchRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeRegionSearchRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeRegionSearchRewardRsp_descriptor,
        new java.lang.String[] { "SearchId", "Retcode", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
