// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowClientGuideNotify.proto

package emu.grasscutter.net.proto;

public final class ShowClientGuideNotifyOuterClass {
  private ShowClientGuideNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowClientGuideNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowClientGuideNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string guide_name = 7;</code>
     * @return The guideName.
     */
    java.lang.String getGuideName();
    /**
     * <code>string guide_name = 7;</code>
     * @return The bytes for guideName.
     */
    com.google.protobuf.ByteString
        getGuideNameBytes();
  }
  /**
   * <pre>
   * CmdId: 24616
   * Obf: LBKMGIHFFNI
   * </pre>
   *
   * Protobuf type {@code ShowClientGuideNotify}
   */
  public static final class ShowClientGuideNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowClientGuideNotify)
      ShowClientGuideNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowClientGuideNotify.newBuilder() to construct.
    private ShowClientGuideNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowClientGuideNotify() {
      guideName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowClientGuideNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShowClientGuideNotify(
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
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              guideName_ = s;
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
      return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.class, emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.Builder.class);
    }

    public static final int GUIDE_NAME_FIELD_NUMBER = 7;
    private volatile java.lang.Object guideName_;
    /**
     * <code>string guide_name = 7;</code>
     * @return The guideName.
     */
    @java.lang.Override
    public java.lang.String getGuideName() {
      java.lang.Object ref = guideName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guideName_ = s;
        return s;
      }
    }
    /**
     * <code>string guide_name = 7;</code>
     * @return The bytes for guideName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuideNameBytes() {
      java.lang.Object ref = guideName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guideName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guideName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, guideName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guideName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, guideName_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify other = (emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify) obj;

      if (!getGuideName()
          .equals(other.getGuideName())) return false;
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
      hash = (37 * hash) + GUIDE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getGuideName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify prototype) {
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
     * CmdId: 24616
     * Obf: LBKMGIHFFNI
     * </pre>
     *
     * Protobuf type {@code ShowClientGuideNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowClientGuideNotify)
        emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.class, emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.newBuilder()
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
        guideName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify build() {
        emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify buildPartial() {
        emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify result = new emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify(this);
        result.guideName_ = guideName_;
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
        if (other instanceof emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify other) {
        if (other == emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.getDefaultInstance()) return this;
        if (!other.getGuideName().isEmpty()) {
          guideName_ = other.guideName_;
          onChanged();
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
        emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object guideName_ = "";
      /**
       * <code>string guide_name = 7;</code>
       * @return The guideName.
       */
      public java.lang.String getGuideName() {
        java.lang.Object ref = guideName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          guideName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string guide_name = 7;</code>
       * @return The bytes for guideName.
       */
      public com.google.protobuf.ByteString
          getGuideNameBytes() {
        java.lang.Object ref = guideName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guideName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string guide_name = 7;</code>
       * @param value The guideName to set.
       * @return This builder for chaining.
       */
      public Builder setGuideName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        guideName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string guide_name = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuideName() {
        
        guideName_ = getDefaultInstance().getGuideName();
        onChanged();
        return this;
      }
      /**
       * <code>string guide_name = 7;</code>
       * @param value The bytes for guideName to set.
       * @return This builder for chaining.
       */
      public Builder setGuideNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        guideName_ = value;
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


      // @@protoc_insertion_point(builder_scope:ShowClientGuideNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowClientGuideNotify)
    private static final emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify();
    }

    public static emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowClientGuideNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowClientGuideNotify>() {
      @java.lang.Override
      public ShowClientGuideNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowClientGuideNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShowClientGuideNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowClientGuideNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowClientGuideNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowClientGuideNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ShowClientGuideNotify.proto\"+\n\025ShowCli" +
      "entGuideNotify\022\022\n\nguide_name\030\007 \001(\tB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShowClientGuideNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowClientGuideNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowClientGuideNotify_descriptor,
        new java.lang.String[] { "GuideName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
