// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatChannelShieldNotify.proto

package emu.grasscutter.net.proto;

public final class ChatChannelShieldNotifyOuterClass {
  private ChatChannelShieldNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatChannelShieldNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatChannelShieldNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 channel_id = 6;</code>
     * @return The channelId.
     */
    int getChannelId();

    /**
     * <code>bool is_shield = 8;</code>
     * @return The isShield.
     */
    boolean getIsShield();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 6815
   * </pre>
   *
   * Protobuf type {@code ChatChannelShieldNotify}
   */
  public static final class ChatChannelShieldNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatChannelShieldNotify)
      ChatChannelShieldNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatChannelShieldNotify.newBuilder() to construct.
    private ChatChannelShieldNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatChannelShieldNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChatChannelShieldNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatChannelShieldNotify(
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
            case 48: {

              channelId_ = input.readUInt32();
              break;
            }
            case 64: {

              isShield_ = input.readBool();
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
      return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.internal_static_ChatChannelShieldNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.internal_static_ChatChannelShieldNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.class, emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.Builder.class);
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 6;
    private int channelId_;
    /**
     * <code>uint32 channel_id = 6;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
    }

    public static final int IS_SHIELD_FIELD_NUMBER = 8;
    private boolean isShield_;
    /**
     * <code>bool is_shield = 8;</code>
     * @return The isShield.
     */
    @java.lang.Override
    public boolean getIsShield() {
      return isShield_;
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
      if (channelId_ != 0) {
        output.writeUInt32(6, channelId_);
      }
      if (isShield_ != false) {
        output.writeBool(8, isShield_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, channelId_);
      }
      if (isShield_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isShield_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify other = (emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify) obj;

      if (getChannelId()
          != other.getChannelId()) return false;
      if (getIsShield()
          != other.getIsShield()) return false;
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
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      hash = (37 * hash) + IS_SHIELD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShield());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify prototype) {
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
     * 4.6.0
     * CmdId: 6815
     * </pre>
     *
     * Protobuf type {@code ChatChannelShieldNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatChannelShieldNotify)
        emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.internal_static_ChatChannelShieldNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.internal_static_ChatChannelShieldNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.class, emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.newBuilder()
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
        channelId_ = 0;

        isShield_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.internal_static_ChatChannelShieldNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify build() {
        emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify buildPartial() {
        emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify result = new emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify(this);
        result.channelId_ = channelId_;
        result.isShield_ = isShield_;
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
        if (other instanceof emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify other) {
        if (other == emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify.getDefaultInstance()) return this;
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
        }
        if (other.getIsShield() != false) {
          setIsShield(other.getIsShield());
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
        emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 6;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 6;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isShield_ ;
      /**
       * <code>bool is_shield = 8;</code>
       * @return The isShield.
       */
      @java.lang.Override
      public boolean getIsShield() {
        return isShield_;
      }
      /**
       * <code>bool is_shield = 8;</code>
       * @param value The isShield to set.
       * @return This builder for chaining.
       */
      public Builder setIsShield(boolean value) {
        
        isShield_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_shield = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShield() {
        
        isShield_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChatChannelShieldNotify)
    }

    // @@protoc_insertion_point(class_scope:ChatChannelShieldNotify)
    private static final emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify();
    }

    public static emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatChannelShieldNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChatChannelShieldNotify>() {
      @java.lang.Override
      public ChatChannelShieldNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatChannelShieldNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatChannelShieldNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatChannelShieldNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChatChannelShieldNotifyOuterClass.ChatChannelShieldNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatChannelShieldNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatChannelShieldNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ChatChannelShieldNotify.proto\"@\n\027ChatC" +
      "hannelShieldNotify\022\022\n\nchannel_id\030\006 \001(\r\022\021" +
      "\n\tis_shield\030\010 \001(\010B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChatChannelShieldNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatChannelShieldNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatChannelShieldNotify_descriptor,
        new java.lang.String[] { "ChannelId", "IsShield", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
