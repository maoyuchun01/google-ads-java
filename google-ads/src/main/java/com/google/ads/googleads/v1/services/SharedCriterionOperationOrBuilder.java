// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/shared_criterion_service.proto

package com.google.ads.googleads.v1.services;

public interface SharedCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.SharedCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.SharedCriterion create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.SharedCriterion create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.SharedCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.SharedCriterion create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.SharedCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v1.services.SharedCriterionOperation.OperationCase getOperationCase();
}