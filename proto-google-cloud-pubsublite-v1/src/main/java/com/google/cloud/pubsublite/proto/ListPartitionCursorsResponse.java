/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/cursor.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Response for ListPartitionCursors
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.ListPartitionCursorsResponse}
 */
public final class ListPartitionCursorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.ListPartitionCursorsResponse)
    ListPartitionCursorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPartitionCursorsResponse.newBuilder() to construct.
  private ListPartitionCursorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPartitionCursorsResponse() {
    partitionCursors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPartitionCursorsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_ListPartitionCursorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_ListPartitionCursorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.class,
            com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.Builder.class);
  }

  public static final int PARTITION_CURSORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.pubsublite.proto.PartitionCursor> partitionCursors_;
  /**
   *
   *
   * <pre>
   * The partition cursors from this request.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.pubsublite.proto.PartitionCursor>
      getPartitionCursorsList() {
    return partitionCursors_;
  }
  /**
   *
   *
   * <pre>
   * The partition cursors from this request.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder>
      getPartitionCursorsOrBuilderList() {
    return partitionCursors_;
  }
  /**
   *
   *
   * <pre>
   * The partition cursors from this request.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
   */
  @java.lang.Override
  public int getPartitionCursorsCount() {
    return partitionCursors_.size();
  }
  /**
   *
   *
   * <pre>
   * The partition cursors from this request.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.PartitionCursor getPartitionCursors(int index) {
    return partitionCursors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The partition cursors from this request.
   * </pre>
   *
   * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder getPartitionCursorsOrBuilder(
      int index) {
    return partitionCursors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < partitionCursors_.size(); i++) {
      output.writeMessage(1, partitionCursors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < partitionCursors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, partitionCursors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse other =
        (com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse) obj;

    if (!getPartitionCursorsList().equals(other.getPartitionCursorsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getPartitionCursorsCount() > 0) {
      hash = (37 * hash) + PARTITION_CURSORS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionCursorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for ListPartitionCursors
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.ListPartitionCursorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.ListPartitionCursorsResponse)
      com.google.cloud.pubsublite.proto.ListPartitionCursorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_ListPartitionCursorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_ListPartitionCursorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.class,
              com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (partitionCursorsBuilder_ == null) {
        partitionCursors_ = java.util.Collections.emptyList();
      } else {
        partitionCursors_ = null;
        partitionCursorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_ListPartitionCursorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse build() {
      com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse buildPartial() {
      com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse result =
          new com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse result) {
      if (partitionCursorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          partitionCursors_ = java.util.Collections.unmodifiableList(partitionCursors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partitionCursors_ = partitionCursors_;
      } else {
        result.partitionCursors_ = partitionCursorsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse other) {
      if (other
          == com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse.getDefaultInstance())
        return this;
      if (partitionCursorsBuilder_ == null) {
        if (!other.partitionCursors_.isEmpty()) {
          if (partitionCursors_.isEmpty()) {
            partitionCursors_ = other.partitionCursors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartitionCursorsIsMutable();
            partitionCursors_.addAll(other.partitionCursors_);
          }
          onChanged();
        }
      } else {
        if (!other.partitionCursors_.isEmpty()) {
          if (partitionCursorsBuilder_.isEmpty()) {
            partitionCursorsBuilder_.dispose();
            partitionCursorsBuilder_ = null;
            partitionCursors_ = other.partitionCursors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partitionCursorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPartitionCursorsFieldBuilder()
                    : null;
          } else {
            partitionCursorsBuilder_.addAllMessages(other.partitionCursors_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10:
              {
                com.google.cloud.pubsublite.proto.PartitionCursor m =
                    input.readMessage(
                        com.google.cloud.pubsublite.proto.PartitionCursor.parser(),
                        extensionRegistry);
                if (partitionCursorsBuilder_ == null) {
                  ensurePartitionCursorsIsMutable();
                  partitionCursors_.add(m);
                } else {
                  partitionCursorsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private int bitField0_;

    private java.util.List<com.google.cloud.pubsublite.proto.PartitionCursor> partitionCursors_ =
        java.util.Collections.emptyList();

    private void ensurePartitionCursorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partitionCursors_ =
            new java.util.ArrayList<com.google.cloud.pubsublite.proto.PartitionCursor>(
                partitionCursors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.PartitionCursor,
            com.google.cloud.pubsublite.proto.PartitionCursor.Builder,
            com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder>
        partitionCursorsBuilder_;

    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.PartitionCursor>
        getPartitionCursorsList() {
      if (partitionCursorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partitionCursors_);
      } else {
        return partitionCursorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public int getPartitionCursorsCount() {
      if (partitionCursorsBuilder_ == null) {
        return partitionCursors_.size();
      } else {
        return partitionCursorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PartitionCursor getPartitionCursors(int index) {
      if (partitionCursorsBuilder_ == null) {
        return partitionCursors_.get(index);
      } else {
        return partitionCursorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder setPartitionCursors(
        int index, com.google.cloud.pubsublite.proto.PartitionCursor value) {
      if (partitionCursorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionCursorsIsMutable();
        partitionCursors_.set(index, value);
        onChanged();
      } else {
        partitionCursorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder setPartitionCursors(
        int index, com.google.cloud.pubsublite.proto.PartitionCursor.Builder builderForValue) {
      if (partitionCursorsBuilder_ == null) {
        ensurePartitionCursorsIsMutable();
        partitionCursors_.set(index, builderForValue.build());
        onChanged();
      } else {
        partitionCursorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder addPartitionCursors(com.google.cloud.pubsublite.proto.PartitionCursor value) {
      if (partitionCursorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionCursorsIsMutable();
        partitionCursors_.add(value);
        onChanged();
      } else {
        partitionCursorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder addPartitionCursors(
        int index, com.google.cloud.pubsublite.proto.PartitionCursor value) {
      if (partitionCursorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionCursorsIsMutable();
        partitionCursors_.add(index, value);
        onChanged();
      } else {
        partitionCursorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder addPartitionCursors(
        com.google.cloud.pubsublite.proto.PartitionCursor.Builder builderForValue) {
      if (partitionCursorsBuilder_ == null) {
        ensurePartitionCursorsIsMutable();
        partitionCursors_.add(builderForValue.build());
        onChanged();
      } else {
        partitionCursorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder addPartitionCursors(
        int index, com.google.cloud.pubsublite.proto.PartitionCursor.Builder builderForValue) {
      if (partitionCursorsBuilder_ == null) {
        ensurePartitionCursorsIsMutable();
        partitionCursors_.add(index, builderForValue.build());
        onChanged();
      } else {
        partitionCursorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder addAllPartitionCursors(
        java.lang.Iterable<? extends com.google.cloud.pubsublite.proto.PartitionCursor> values) {
      if (partitionCursorsBuilder_ == null) {
        ensurePartitionCursorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, partitionCursors_);
        onChanged();
      } else {
        partitionCursorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder clearPartitionCursors() {
      if (partitionCursorsBuilder_ == null) {
        partitionCursors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partitionCursorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public Builder removePartitionCursors(int index) {
      if (partitionCursorsBuilder_ == null) {
        ensurePartitionCursorsIsMutable();
        partitionCursors_.remove(index);
        onChanged();
      } else {
        partitionCursorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PartitionCursor.Builder getPartitionCursorsBuilder(
        int index) {
      return getPartitionCursorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder getPartitionCursorsOrBuilder(
        int index) {
      if (partitionCursorsBuilder_ == null) {
        return partitionCursors_.get(index);
      } else {
        return partitionCursorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder>
        getPartitionCursorsOrBuilderList() {
      if (partitionCursorsBuilder_ != null) {
        return partitionCursorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partitionCursors_);
      }
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PartitionCursor.Builder addPartitionCursorsBuilder() {
      return getPartitionCursorsFieldBuilder()
          .addBuilder(com.google.cloud.pubsublite.proto.PartitionCursor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.PartitionCursor.Builder addPartitionCursorsBuilder(
        int index) {
      return getPartitionCursorsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.pubsublite.proto.PartitionCursor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The partition cursors from this request.
     * </pre>
     *
     * <code>repeated .google.cloud.pubsublite.v1.PartitionCursor partition_cursors = 1;</code>
     */
    public java.util.List<com.google.cloud.pubsublite.proto.PartitionCursor.Builder>
        getPartitionCursorsBuilderList() {
      return getPartitionCursorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.pubsublite.proto.PartitionCursor,
            com.google.cloud.pubsublite.proto.PartitionCursor.Builder,
            com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder>
        getPartitionCursorsFieldBuilder() {
      if (partitionCursorsBuilder_ == null) {
        partitionCursorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.pubsublite.proto.PartitionCursor,
                com.google.cloud.pubsublite.proto.PartitionCursor.Builder,
                com.google.cloud.pubsublite.proto.PartitionCursorOrBuilder>(
                partitionCursors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        partitionCursors_ = null;
      }
      return partitionCursorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.ListPartitionCursorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ListPartitionCursorsResponse)
  private static final com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse();
  }

  public static com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPartitionCursorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPartitionCursorsResponse>() {
        @java.lang.Override
        public ListPartitionCursorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPartitionCursorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPartitionCursorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ListPartitionCursorsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
