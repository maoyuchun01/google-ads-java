// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/mutate_error.proto

package com.google.ads.googleads.v2.errors;

public final class MutateErrorProto {
  private MutateErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v2/errors/mutate_" +
      "error.proto\022\036google.ads.googleads.v2.err" +
      "ors\032\034google/api/annotations.proto\"\356\001\n\017Mu" +
      "tateErrorEnum\"\332\001\n\013MutateError\022\017\n\013UNSPECI" +
      "FIED\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022RESOURCE_NOT_FOUN" +
      "D\020\003\022!\n\035ID_EXISTS_IN_MULTIPLE_MUTATES\020\007\022\035" +
      "\n\031INCONSISTENT_FIELD_VALUES\020\010\022\026\n\022MUTATE_" +
      "NOT_ALLOWED\020\t\022\036\n\032RESOURCE_NOT_IN_GOOGLE_" +
      "ADS\020\n\022\033\n\027RESOURCE_ALREADY_EXISTS\020\013B\353\001\n\"c" +
      "om.google.ads.googleads.v2.errorsB\020Mutat" +
      "eErrorProtoP\001ZDgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v2/errors;err" +
      "ors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V2.Erro" +
      "rs\312\002\036Google\\Ads\\GoogleAds\\V2\\Errors\352\002\"Go" +
      "ogle::Ads::GoogleAds::V2::Errorsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_errors_MutateErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
