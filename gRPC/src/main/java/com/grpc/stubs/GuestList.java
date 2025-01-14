// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

package com.grpc.stubs;

/**
 * Protobuf type {@code GuestList}
 */
public  final class GuestList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuestList)
    GuestListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuestList.newBuilder() to construct.
  private GuestList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuestList() {
    guests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuestList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuestList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              guests_ = new java.util.ArrayList<com.grpc.stubs.Guest>();
              mutable_bitField0_ |= 0x00000001;
            }
            guests_.add(
                input.readMessage(com.grpc.stubs.Guest.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        guests_ = java.util.Collections.unmodifiableList(guests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.stubs.Hotel.internal_static_GuestList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.stubs.Hotel.internal_static_GuestList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.stubs.GuestList.class, com.grpc.stubs.GuestList.Builder.class);
  }

  public static final int GUESTS_FIELD_NUMBER = 1;
  private java.util.List<com.grpc.stubs.Guest> guests_;
  /**
   * <code>repeated .Guest guests = 1;</code>
   */
  public java.util.List<com.grpc.stubs.Guest> getGuestsList() {
    return guests_;
  }
  /**
   * <code>repeated .Guest guests = 1;</code>
   */
  public java.util.List<? extends com.grpc.stubs.GuestOrBuilder> 
      getGuestsOrBuilderList() {
    return guests_;
  }
  /**
   * <code>repeated .Guest guests = 1;</code>
   */
  public int getGuestsCount() {
    return guests_.size();
  }
  /**
   * <code>repeated .Guest guests = 1;</code>
   */
  public com.grpc.stubs.Guest getGuests(int index) {
    return guests_.get(index);
  }
  /**
   * <code>repeated .Guest guests = 1;</code>
   */
  public com.grpc.stubs.GuestOrBuilder getGuestsOrBuilder(
      int index) {
    return guests_.get(index);
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
    for (int i = 0; i < guests_.size(); i++) {
      output.writeMessage(1, guests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < guests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, guests_.get(i));
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
    if (!(obj instanceof com.grpc.stubs.GuestList)) {
      return super.equals(obj);
    }
    com.grpc.stubs.GuestList other = (com.grpc.stubs.GuestList) obj;

    if (!getGuestsList()
        .equals(other.getGuestsList())) return false;
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
    if (getGuestsCount() > 0) {
      hash = (37 * hash) + GUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getGuestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.stubs.GuestList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.GuestList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.stubs.GuestList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.stubs.GuestList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.GuestList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.stubs.GuestList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.stubs.GuestList parseFrom(
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
  public static Builder newBuilder(com.grpc.stubs.GuestList prototype) {
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
   * Protobuf type {@code GuestList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuestList)
      com.grpc.stubs.GuestListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.stubs.Hotel.internal_static_GuestList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.stubs.Hotel.internal_static_GuestList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.stubs.GuestList.class, com.grpc.stubs.GuestList.Builder.class);
    }

    // Construct using com.grpc.stubs.GuestList.newBuilder()
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
        getGuestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (guestsBuilder_ == null) {
        guests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        guestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.stubs.Hotel.internal_static_GuestList_descriptor;
    }

    @java.lang.Override
    public com.grpc.stubs.GuestList getDefaultInstanceForType() {
      return com.grpc.stubs.GuestList.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.stubs.GuestList build() {
      com.grpc.stubs.GuestList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.stubs.GuestList buildPartial() {
      com.grpc.stubs.GuestList result = new com.grpc.stubs.GuestList(this);
      int from_bitField0_ = bitField0_;
      if (guestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          guests_ = java.util.Collections.unmodifiableList(guests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guests_ = guests_;
      } else {
        result.guests_ = guestsBuilder_.build();
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
      if (other instanceof com.grpc.stubs.GuestList) {
        return mergeFrom((com.grpc.stubs.GuestList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.stubs.GuestList other) {
      if (other == com.grpc.stubs.GuestList.getDefaultInstance()) return this;
      if (guestsBuilder_ == null) {
        if (!other.guests_.isEmpty()) {
          if (guests_.isEmpty()) {
            guests_ = other.guests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuestsIsMutable();
            guests_.addAll(other.guests_);
          }
          onChanged();
        }
      } else {
        if (!other.guests_.isEmpty()) {
          if (guestsBuilder_.isEmpty()) {
            guestsBuilder_.dispose();
            guestsBuilder_ = null;
            guests_ = other.guests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            guestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGuestsFieldBuilder() : null;
          } else {
            guestsBuilder_.addAllMessages(other.guests_);
          }
        }
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
      com.grpc.stubs.GuestList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.stubs.GuestList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.grpc.stubs.Guest> guests_ =
      java.util.Collections.emptyList();
    private void ensureGuestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        guests_ = new java.util.ArrayList<com.grpc.stubs.Guest>(guests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.stubs.Guest, com.grpc.stubs.Guest.Builder, com.grpc.stubs.GuestOrBuilder> guestsBuilder_;

    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public java.util.List<com.grpc.stubs.Guest> getGuestsList() {
      if (guestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(guests_);
      } else {
        return guestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public int getGuestsCount() {
      if (guestsBuilder_ == null) {
        return guests_.size();
      } else {
        return guestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public com.grpc.stubs.Guest getGuests(int index) {
      if (guestsBuilder_ == null) {
        return guests_.get(index);
      } else {
        return guestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder setGuests(
        int index, com.grpc.stubs.Guest value) {
      if (guestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestsIsMutable();
        guests_.set(index, value);
        onChanged();
      } else {
        guestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder setGuests(
        int index, com.grpc.stubs.Guest.Builder builderForValue) {
      if (guestsBuilder_ == null) {
        ensureGuestsIsMutable();
        guests_.set(index, builderForValue.build());
        onChanged();
      } else {
        guestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder addGuests(com.grpc.stubs.Guest value) {
      if (guestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestsIsMutable();
        guests_.add(value);
        onChanged();
      } else {
        guestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder addGuests(
        int index, com.grpc.stubs.Guest value) {
      if (guestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestsIsMutable();
        guests_.add(index, value);
        onChanged();
      } else {
        guestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder addGuests(
        com.grpc.stubs.Guest.Builder builderForValue) {
      if (guestsBuilder_ == null) {
        ensureGuestsIsMutable();
        guests_.add(builderForValue.build());
        onChanged();
      } else {
        guestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder addGuests(
        int index, com.grpc.stubs.Guest.Builder builderForValue) {
      if (guestsBuilder_ == null) {
        ensureGuestsIsMutable();
        guests_.add(index, builderForValue.build());
        onChanged();
      } else {
        guestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder addAllGuests(
        java.lang.Iterable<? extends com.grpc.stubs.Guest> values) {
      if (guestsBuilder_ == null) {
        ensureGuestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guests_);
        onChanged();
      } else {
        guestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder clearGuests() {
      if (guestsBuilder_ == null) {
        guests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        guestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public Builder removeGuests(int index) {
      if (guestsBuilder_ == null) {
        ensureGuestsIsMutable();
        guests_.remove(index);
        onChanged();
      } else {
        guestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public com.grpc.stubs.Guest.Builder getGuestsBuilder(
        int index) {
      return getGuestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public com.grpc.stubs.GuestOrBuilder getGuestsOrBuilder(
        int index) {
      if (guestsBuilder_ == null) {
        return guests_.get(index);  } else {
        return guestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public java.util.List<? extends com.grpc.stubs.GuestOrBuilder> 
         getGuestsOrBuilderList() {
      if (guestsBuilder_ != null) {
        return guestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(guests_);
      }
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public com.grpc.stubs.Guest.Builder addGuestsBuilder() {
      return getGuestsFieldBuilder().addBuilder(
          com.grpc.stubs.Guest.getDefaultInstance());
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public com.grpc.stubs.Guest.Builder addGuestsBuilder(
        int index) {
      return getGuestsFieldBuilder().addBuilder(
          index, com.grpc.stubs.Guest.getDefaultInstance());
    }
    /**
     * <code>repeated .Guest guests = 1;</code>
     */
    public java.util.List<com.grpc.stubs.Guest.Builder> 
         getGuestsBuilderList() {
      return getGuestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.stubs.Guest, com.grpc.stubs.Guest.Builder, com.grpc.stubs.GuestOrBuilder> 
        getGuestsFieldBuilder() {
      if (guestsBuilder_ == null) {
        guestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.stubs.Guest, com.grpc.stubs.Guest.Builder, com.grpc.stubs.GuestOrBuilder>(
                guests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        guests_ = null;
      }
      return guestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GuestList)
  }

  // @@protoc_insertion_point(class_scope:GuestList)
  private static final com.grpc.stubs.GuestList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.stubs.GuestList();
  }

  public static com.grpc.stubs.GuestList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestList>
      PARSER = new com.google.protobuf.AbstractParser<GuestList>() {
    @java.lang.Override
    public GuestList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuestList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuestList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.stubs.GuestList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

