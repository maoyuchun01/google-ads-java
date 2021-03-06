// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/text_label.proto

package com.google.ads.googleads.v3.common;

public interface TextLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.TextLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   */
  boolean hasBackgroundColor();
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   */
  com.google.protobuf.StringValue getBackgroundColor();
  /**
   * <pre>
   * Background color of the label in RGB format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>.google.protobuf.StringValue background_color = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBackgroundColorOrBuilder();

  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();
}
