// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/parental_status_view.proto

package com.google.ads.googleads.v3.resources;

public final class ParentalStatusViewProto {
  private ParentalStatusViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_ParentalStatusView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_ParentalStatusView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v3/resources/pare" +
      "ntal_status_view.proto\022!google.ads.googl" +
      "eads.v3.resources\032\031google/api/resource.p" +
      "roto\032\034google/api/annotations.proto\"\236\001\n\022P" +
      "arentalStatusView\022\025\n\rresource_name\030\001 \001(\t" +
      ":q\352An\n+googleads.googleapis.com/Parental" +
      "StatusView\022?customers/{customer}/parenta" +
      "lStatusViews/{parental_status_view}B\204\002\n%" +
      "com.google.ads.googleads.v3.resourcesB\027P" +
      "arentalStatusViewProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v3" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V3.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V3\\Resources\352\002%Google::Ads::Google" +
      "Ads::V3::Resourcesb\006proto3"
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
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_ParentalStatusView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_ParentalStatusView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_ParentalStatusView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
