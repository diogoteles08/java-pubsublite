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
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Request for CreateReservation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.CreateReservationRequest}
 */
public final class CreateReservationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.CreateReservationRequest)
    CreateReservationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateReservationRequest.newBuilder() to construct.
  private CreateReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReservationRequest() {
    parent_ = "";
    reservationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateReservationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateReservationRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.pubsublite.proto.Reservation.Builder subBuilder = null;
              if (reservation_ != null) {
                subBuilder = reservation_.toBuilder();
              }
              reservation_ =
                  input.readMessage(
                      com.google.cloud.pubsublite.proto.Reservation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reservation_);
                reservation_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              reservationId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_CreateReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.AdminProto
        .internal_static_google_cloud_pubsublite_v1_CreateReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.CreateReservationRequest.class,
            com.google.cloud.pubsublite.proto.CreateReservationRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent location in which to create the reservation.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent location in which to create the reservation.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESERVATION_FIELD_NUMBER = 2;
  private com.google.cloud.pubsublite.proto.Reservation reservation_;
  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reservation field is set.
   */
  @java.lang.Override
  public boolean hasReservation() {
    return reservation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reservation.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Reservation getReservation() {
    return reservation_ == null
        ? com.google.cloud.pubsublite.proto.Reservation.getDefaultInstance()
        : reservation_;
  }
  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationOrBuilder() {
    return getReservation();
  }

  public static final int RESERVATION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object reservationId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reservation, which will become the final component of
   * the reservation's name.
   * This value is structured like: `my-reservation-name`.
   * </pre>
   *
   * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The reservationId.
   */
  @java.lang.Override
  public java.lang.String getReservationId() {
    java.lang.Object ref = reservationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reservationId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reservation, which will become the final component of
   * the reservation's name.
   * This value is structured like: `my-reservation-name`.
   * </pre>
   *
   * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for reservationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReservationIdBytes() {
    java.lang.Object ref = reservationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reservationId_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (reservation_ != null) {
      output.writeMessage(2, getReservation());
    }
    if (!getReservationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reservationId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (reservation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReservation());
    }
    if (!getReservationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reservationId_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.CreateReservationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.CreateReservationRequest other =
        (com.google.cloud.pubsublite.proto.CreateReservationRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReservation() != other.hasReservation()) return false;
    if (hasReservation()) {
      if (!getReservation().equals(other.getReservation())) return false;
    }
    if (!getReservationId().equals(other.getReservationId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasReservation()) {
      hash = (37 * hash) + RESERVATION_FIELD_NUMBER;
      hash = (53 * hash) + getReservation().hashCode();
    }
    hash = (37 * hash) + RESERVATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReservationId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest parseFrom(
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
      com.google.cloud.pubsublite.proto.CreateReservationRequest prototype) {
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
   * Request for CreateReservation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.CreateReservationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.CreateReservationRequest)
      com.google.cloud.pubsublite.proto.CreateReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_CreateReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_CreateReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.CreateReservationRequest.class,
              com.google.cloud.pubsublite.proto.CreateReservationRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.CreateReservationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (reservationBuilder_ == null) {
        reservation_ = null;
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }
      reservationId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.AdminProto
          .internal_static_google_cloud_pubsublite_v1_CreateReservationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateReservationRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.CreateReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateReservationRequest build() {
      com.google.cloud.pubsublite.proto.CreateReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CreateReservationRequest buildPartial() {
      com.google.cloud.pubsublite.proto.CreateReservationRequest result =
          new com.google.cloud.pubsublite.proto.CreateReservationRequest(this);
      result.parent_ = parent_;
      if (reservationBuilder_ == null) {
        result.reservation_ = reservation_;
      } else {
        result.reservation_ = reservationBuilder_.build();
      }
      result.reservationId_ = reservationId_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.pubsublite.proto.CreateReservationRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.CreateReservationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.CreateReservationRequest other) {
      if (other == com.google.cloud.pubsublite.proto.CreateReservationRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasReservation()) {
        mergeReservation(other.getReservation());
      }
      if (!other.getReservationId().isEmpty()) {
        reservationId_ = other.reservationId_;
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
      com.google.cloud.pubsublite.proto.CreateReservationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.pubsublite.proto.CreateReservationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent location in which to create the reservation.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location in which to create the reservation.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location in which to create the reservation.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location in which to create the reservation.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location in which to create the reservation.
     * Structured like `projects/{project_number}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.pubsublite.proto.Reservation reservation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Reservation,
            com.google.cloud.pubsublite.proto.Reservation.Builder,
            com.google.cloud.pubsublite.proto.ReservationOrBuilder>
        reservationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the reservation field is set.
     */
    public boolean hasReservation() {
      return reservationBuilder_ != null || reservation_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The reservation.
     */
    public com.google.cloud.pubsublite.proto.Reservation getReservation() {
      if (reservationBuilder_ == null) {
        return reservation_ == null
            ? com.google.cloud.pubsublite.proto.Reservation.getDefaultInstance()
            : reservation_;
      } else {
        return reservationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReservation(com.google.cloud.pubsublite.proto.Reservation value) {
      if (reservationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reservation_ = value;
        onChanged();
      } else {
        reservationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReservation(
        com.google.cloud.pubsublite.proto.Reservation.Builder builderForValue) {
      if (reservationBuilder_ == null) {
        reservation_ = builderForValue.build();
        onChanged();
      } else {
        reservationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReservation(com.google.cloud.pubsublite.proto.Reservation value) {
      if (reservationBuilder_ == null) {
        if (reservation_ != null) {
          reservation_ =
              com.google.cloud.pubsublite.proto.Reservation.newBuilder(reservation_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          reservation_ = value;
        }
        onChanged();
      } else {
        reservationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReservation() {
      if (reservationBuilder_ == null) {
        reservation_ = null;
        onChanged();
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.pubsublite.proto.Reservation.Builder getReservationBuilder() {

      onChanged();
      return getReservationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationOrBuilder() {
      if (reservationBuilder_ != null) {
        return reservationBuilder_.getMessageOrBuilder();
      } else {
        return reservation_ == null
            ? com.google.cloud.pubsublite.proto.Reservation.getDefaultInstance()
            : reservation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration of the reservation to create. Its `name` field is ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Reservation,
            com.google.cloud.pubsublite.proto.Reservation.Builder,
            com.google.cloud.pubsublite.proto.ReservationOrBuilder>
        getReservationFieldBuilder() {
      if (reservationBuilder_ == null) {
        reservationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.Reservation,
                com.google.cloud.pubsublite.proto.Reservation.Builder,
                com.google.cloud.pubsublite.proto.ReservationOrBuilder>(
                getReservation(), getParentForChildren(), isClean());
        reservation_ = null;
      }
      return reservationBuilder_;
    }

    private java.lang.Object reservationId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reservation, which will become the final component of
     * the reservation's name.
     * This value is structured like: `my-reservation-name`.
     * </pre>
     *
     * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The reservationId.
     */
    public java.lang.String getReservationId() {
      java.lang.Object ref = reservationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reservationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reservation, which will become the final component of
     * the reservation's name.
     * This value is structured like: `my-reservation-name`.
     * </pre>
     *
     * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for reservationId.
     */
    public com.google.protobuf.ByteString getReservationIdBytes() {
      java.lang.Object ref = reservationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reservationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reservation, which will become the final component of
     * the reservation's name.
     * This value is structured like: `my-reservation-name`.
     * </pre>
     *
     * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The reservationId to set.
     * @return This builder for chaining.
     */
    public Builder setReservationId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      reservationId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reservation, which will become the final component of
     * the reservation's name.
     * This value is structured like: `my-reservation-name`.
     * </pre>
     *
     * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReservationId() {

      reservationId_ = getDefaultInstance().getReservationId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reservation, which will become the final component of
     * the reservation's name.
     * This value is structured like: `my-reservation-name`.
     * </pre>
     *
     * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for reservationId to set.
     * @return This builder for chaining.
     */
    public Builder setReservationIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      reservationId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.CreateReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.CreateReservationRequest)
  private static final com.google.cloud.pubsublite.proto.CreateReservationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.CreateReservationRequest();
  }

  public static com.google.cloud.pubsublite.proto.CreateReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReservationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReservationRequest>() {
        @java.lang.Override
        public CreateReservationRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateReservationRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.CreateReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}