// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/operating_system_version_constant.proto

package com.google.ads.googleads.v3.resources;

public final class OperatingSystemVersionConstantProto {
  private OperatingSystemVersionConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_OperatingSystemVersionConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_OperatingSystemVersionConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v3/resources/oper" +
      "ating_system_version_constant.proto\022!goo" +
      "gle.ads.googleads.v3.resources\032Jgoogle/a" +
      "ds/googleads/v3/enums/operating_system_v" +
      "ersion_operator_type.proto\032\031google/api/r" +
      "esource.proto\032\036google/protobuf/wrappers." +
      "proto\032\034google/api/annotations.proto\"\377\003\n\036" +
      "OperatingSystemVersionConstant\022\025\n\rresour" +
      "ce_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.proto" +
      "buf.Int64Value\022*\n\004name\030\003 \001(\0132\034.google.pr" +
      "otobuf.StringValue\0225\n\020os_major_version\030\004" +
      " \001(\0132\033.google.protobuf.Int32Value\0225\n\020os_" +
      "minor_version\030\005 \001(\0132\033.google.protobuf.In" +
      "t32Value\022\177\n\roperator_type\030\006 \001(\0162h.google" +
      ".ads.googleads.v3.enums.OperatingSystemV" +
      "ersionOperatorTypeEnum.OperatingSystemVe" +
      "rsionOperatorType:\201\001\352A~\n7googleads.googl" +
      "eapis.com/OperatingSystemVersionConstant" +
      "\022CoperatingSystemVersionConstants/{opera" +
      "ting_system_version_constant}B\220\002\n%com.go" +
      "ogle.ads.googleads.v3.resourcesB#Operati" +
      "ngSystemVersionConstantProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v3/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V3.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V3\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_OperatingSystemVersionConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_OperatingSystemVersionConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_OperatingSystemVersionConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "OsMajorVersion", "OsMinorVersion", "OperatorType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
