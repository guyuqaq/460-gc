// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskInfo.proto

package emu.grasscutter.net.proto;

public final class DailyTaskInfoOuterClass {
  private DailyTaskInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 13;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 progress = 8;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 daily_task_id = 12;</code>
     * @return The dailyTaskId.
     */
    int getDailyTaskId();

    /**
     * <code>uint32 finish_progress = 11;</code>
     * @return The finishProgress.
     */
    int getFinishProgress();

    /**
     * <code>uint32 reward_id = 10;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * <pre>
   * Obf: IIIDCAPCJOI
   * </pre>
   *
   * Protobuf type {@code DailyTaskInfo}
   */
  public static final class DailyTaskInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskInfo)
      DailyTaskInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskInfo.newBuilder() to construct.
    private DailyTaskInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskInfo(
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
            case 64: {

              progress_ = input.readUInt32();
              break;
            }
            case 80: {

              rewardId_ = input.readUInt32();
              break;
            }
            case 88: {

              finishProgress_ = input.readUInt32();
              break;
            }
            case 96: {

              dailyTaskId_ = input.readUInt32();
              break;
            }
            case 104: {

              isFinished_ = input.readBool();
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
      return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.class, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 13;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 13;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 8;
    private int progress_;
    /**
     * <code>uint32 progress = 8;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int DAILY_TASK_ID_FIELD_NUMBER = 12;
    private int dailyTaskId_;
    /**
     * <code>uint32 daily_task_id = 12;</code>
     * @return The dailyTaskId.
     */
    @java.lang.Override
    public int getDailyTaskId() {
      return dailyTaskId_;
    }

    public static final int FINISH_PROGRESS_FIELD_NUMBER = 11;
    private int finishProgress_;
    /**
     * <code>uint32 finish_progress = 11;</code>
     * @return The finishProgress.
     */
    @java.lang.Override
    public int getFinishProgress() {
      return finishProgress_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 10;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 10;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
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
      if (progress_ != 0) {
        output.writeUInt32(8, progress_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(10, rewardId_);
      }
      if (finishProgress_ != 0) {
        output.writeUInt32(11, finishProgress_);
      }
      if (dailyTaskId_ != 0) {
        output.writeUInt32(12, dailyTaskId_);
      }
      if (isFinished_ != false) {
        output.writeBool(13, isFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, progress_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, rewardId_);
      }
      if (finishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, finishProgress_);
      }
      if (dailyTaskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dailyTaskId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo other = (emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getDailyTaskId()
          != other.getDailyTaskId()) return false;
      if (getFinishProgress()
          != other.getFinishProgress()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + DAILY_TASK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDailyTaskId();
      hash = (37 * hash) + FINISH_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFinishProgress();
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo prototype) {
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
     * Obf: IIIDCAPCJOI
     * </pre>
     *
     * Protobuf type {@code DailyTaskInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskInfo)
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.class, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.newBuilder()
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
        isFinished_ = false;

        progress_ = 0;

        dailyTaskId_ = 0;

        finishProgress_ = 0;

        rewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo build() {
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo buildPartial() {
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo result = new emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo(this);
        result.isFinished_ = isFinished_;
        result.progress_ = progress_;
        result.dailyTaskId_ = dailyTaskId_;
        result.finishProgress_ = finishProgress_;
        result.rewardId_ = rewardId_;
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
        if (other instanceof emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo other) {
        if (other == emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getDailyTaskId() != 0) {
          setDailyTaskId(other.getDailyTaskId());
        }
        if (other.getFinishProgress() != 0) {
          setFinishProgress(other.getFinishProgress());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
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
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 13;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 13;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 8;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 8;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
        onChanged();
        return this;
      }

      private int dailyTaskId_ ;
      /**
       * <code>uint32 daily_task_id = 12;</code>
       * @return The dailyTaskId.
       */
      @java.lang.Override
      public int getDailyTaskId() {
        return dailyTaskId_;
      }
      /**
       * <code>uint32 daily_task_id = 12;</code>
       * @param value The dailyTaskId to set.
       * @return This builder for chaining.
       */
      public Builder setDailyTaskId(int value) {
        
        dailyTaskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 daily_task_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDailyTaskId() {
        
        dailyTaskId_ = 0;
        onChanged();
        return this;
      }

      private int finishProgress_ ;
      /**
       * <code>uint32 finish_progress = 11;</code>
       * @return The finishProgress.
       */
      @java.lang.Override
      public int getFinishProgress() {
        return finishProgress_;
      }
      /**
       * <code>uint32 finish_progress = 11;</code>
       * @param value The finishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgress(int value) {
        
        finishProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_progress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgress() {
        
        finishProgress_ = 0;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 10;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 10;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DailyTaskInfo)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskInfo)
    private static final emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo();
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskInfo>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskInfo>() {
      @java.lang.Override
      public DailyTaskInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023DailyTaskInfo.proto\"y\n\rDailyTaskInfo\022\023" +
      "\n\013is_finished\030\r \001(\010\022\020\n\010progress\030\010 \001(\r\022\025\n" +
      "\rdaily_task_id\030\014 \001(\r\022\027\n\017finish_progress\030" +
      "\013 \001(\r\022\021\n\treward_id\030\n \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskInfo_descriptor,
        new java.lang.String[] { "IsFinished", "Progress", "DailyTaskId", "FinishProgress", "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
