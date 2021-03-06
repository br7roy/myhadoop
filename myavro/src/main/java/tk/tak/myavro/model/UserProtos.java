// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package tk.tak.myavro.model;

public final class UserProtos {
  private UserProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string name = 1;
    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // required int32 favorite_number = 2;
    /**
     * <code>required int32 favorite_number = 2;</code>
     */
    boolean hasFavoriteNumber();
    /**
     * <code>required int32 favorite_number = 2;</code>
     */
    int getFavoriteNumber();

    // required string favorite_color = 3;
    /**
     * <code>required string favorite_color = 3;</code>
     */
    boolean hasFavoriteColor();
    /**
     * <code>required string favorite_color = 3;</code>
     */
    String getFavoriteColor();
    /**
     * <code>required string favorite_color = 3;</code>
     */
    com.google.protobuf.ByteString
        getFavoriteColorBytes();
  }
  /**
   * Protobuf type {@code tutorial.User}
   */
  public static final class User extends
      com.google.protobuf.GeneratedMessage
      implements UserOrBuilder {
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private User(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final User defaultInstance;
    public static User getDefaultInstance() {
      return defaultInstance;
    }

    public User getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private User(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              favoriteNumber_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              favoriteColor_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserProtos.internal_static_tutorial_User_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserProtos.internal_static_tutorial_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              User.class, Builder.class);
    }

    public static com.google.protobuf.Parser<User> PARSER =
        new com.google.protobuf.AbstractParser<User>() {
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 favorite_number = 2;
    public static final int FAVORITE_NUMBER_FIELD_NUMBER = 2;
    private int favoriteNumber_;
    /**
     * <code>required int32 favorite_number = 2;</code>
     */
    public boolean hasFavoriteNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 favorite_number = 2;</code>
     */
    public int getFavoriteNumber() {
      return favoriteNumber_;
    }

    // required string favorite_color = 3;
    public static final int FAVORITE_COLOR_FIELD_NUMBER = 3;
    private Object favoriteColor_;
    /**
     * <code>required string favorite_color = 3;</code>
     */
    public boolean hasFavoriteColor() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string favorite_color = 3;</code>
     */
    public String getFavoriteColor() {
      Object ref = favoriteColor_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          favoriteColor_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string favorite_color = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFavoriteColorBytes() {
      Object ref = favoriteColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        favoriteColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      name_ = "";
      favoriteNumber_ = 0;
      favoriteColor_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFavoriteNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFavoriteColor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, favoriteNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getFavoriteColorBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, favoriteNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFavoriteColorBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(User prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return UserProtos.internal_static_tutorial_User_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return UserProtos.internal_static_tutorial_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                User.class, Builder.class);
      }

      // Construct using tk.tak.myavro.model.UserProtos.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        favoriteNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        favoriteColor_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UserProtos.internal_static_tutorial_User_descriptor;
      }

      public User getDefaultInstanceForType() {
        return User.getDefaultInstance();
      }

      public User build() {
        User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public User buildPartial() {
        User result = new User(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.favoriteNumber_ = favoriteNumber_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.favoriteColor_ = favoriteColor_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof User) {
          return mergeFrom((User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(User other) {
        if (other == User.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasFavoriteNumber()) {
          setFavoriteNumber(other.getFavoriteNumber());
        }
        if (other.hasFavoriteColor()) {
          bitField0_ |= 0x00000004;
          favoriteColor_ = other.favoriteColor_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasFavoriteNumber()) {
          
          return false;
        }
        if (!hasFavoriteColor()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        User parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (User) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string name = 1;
      private Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // required int32 favorite_number = 2;
      private int favoriteNumber_ ;
      /**
       * <code>required int32 favorite_number = 2;</code>
       */
      public boolean hasFavoriteNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 favorite_number = 2;</code>
       */
      public int getFavoriteNumber() {
        return favoriteNumber_;
      }
      /**
       * <code>required int32 favorite_number = 2;</code>
       */
      public Builder setFavoriteNumber(int value) {
        bitField0_ |= 0x00000002;
        favoriteNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 favorite_number = 2;</code>
       */
      public Builder clearFavoriteNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        favoriteNumber_ = 0;
        onChanged();
        return this;
      }

      // required string favorite_color = 3;
      private Object favoriteColor_ = "";
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public boolean hasFavoriteColor() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public String getFavoriteColor() {
        Object ref = favoriteColor_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          favoriteColor_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFavoriteColorBytes() {
        Object ref = favoriteColor_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          favoriteColor_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public Builder setFavoriteColor(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        favoriteColor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public Builder clearFavoriteColor() {
        bitField0_ = (bitField0_ & ~0x00000004);
        favoriteColor_ = getDefaultInstance().getFavoriteColor();
        onChanged();
        return this;
      }
      /**
       * <code>required string favorite_color = 3;</code>
       */
      public Builder setFavoriteColorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        favoriteColor_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:tutorial.User)
    }

    static {
      defaultInstance = new User(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:tutorial.User)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_User_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tutorial_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nuser.proto\022\010tutorial\"E\n\004User\022\014\n\004name\030\001" +
      " \002(\t\022\027\n\017favorite_number\030\002 \002(\005\022\026\n\016favorit" +
      "e_color\030\003 \002(\tB#\n\025tk.tak.myavro.modelB\n" +
      "UserProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_tutorial_User_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_tutorial_User_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_tutorial_User_descriptor,
              new String[] { "Name", "FavoriteNumber", "FavoriteColor", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
