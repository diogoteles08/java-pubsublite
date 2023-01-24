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
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

public interface PubSubMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.PubSubMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The key used for routing messages to partitions or for compaction (e.g.,
   * keep the last N messages per key). If the key is empty, the message is
   * routed to an arbitrary partition.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   *
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   *
   *
   * <pre>
   * The payload of the message.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   *
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   *
   *
   * <pre>
   * Optional attributes that can be used for message metadata/headers.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.pubsublite.v1.AttributeValues&gt; attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional attributes that can be used for message metadata/headers.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.pubsublite.v1.AttributeValues&gt; attributes = 3;</code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.pubsublite.proto.AttributeValues>
      getAttributes();
  /**
   *
   *
   * <pre>
   * Optional attributes that can be used for message metadata/headers.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.pubsublite.v1.AttributeValues&gt; attributes = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.pubsublite.proto.AttributeValues>
      getAttributesMap();
  /**
   *
   *
   * <pre>
   * Optional attributes that can be used for message metadata/headers.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.pubsublite.v1.AttributeValues&gt; attributes = 3;</code>
   */
  /* nullable */
  com.google.cloud.pubsublite.proto.AttributeValues getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.pubsublite.proto.AttributeValues defaultValue);
  /**
   *
   *
   * <pre>
   * Optional attributes that can be used for message metadata/headers.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.pubsublite.v1.AttributeValues&gt; attributes = 3;</code>
   */
  com.google.cloud.pubsublite.proto.AttributeValues getAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * An optional, user-specified event time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * An optional, user-specified event time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * An optional, user-specified event time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();
}
