// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/currency_constant_service.proto

package com.google.ads.googleads.v3.services;

public final class CurrencyConstantServiceProto {
  private CurrencyConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetCurrencyConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetCurrencyConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v3/services/curre" +
      "ncy_constant_service.proto\022 google.ads.g" +
      "oogleads.v3.services\0329google/ads/googlea" +
      "ds/v3/resources/currency_constant.proto\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\"8\n\032GetCurrencyConstantRequest\022\032\n" +
      "\rresource_name\030\001 \001(\tB\003\340A\0022\202\002\n\027CurrencyCo" +
      "nstantService\022\311\001\n\023GetCurrencyConstant\022<." +
      "google.ads.googleads.v3.services.GetCurr" +
      "encyConstantRequest\0323.google.ads.googlea" +
      "ds.v3.resources.CurrencyConstant\"?\202\323\344\223\002)" +
      "\022\'/v3/{resource_name=currencyConstants/*" +
      "}\332A\rresource_name\032\033\312A\030googleads.googleap" +
      "is.comB\203\002\n$com.google.ads.googleads.v3.s" +
      "ervicesB\034CurrencyConstantServiceProtoP\001Z" +
      "Hgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v3/services;services\242\002\003GAA\252" +
      "\002 Google.Ads.GoogleAds.V3.Services\312\002 Goo" +
      "gle\\Ads\\GoogleAds\\V3\\Services\352\002$Google::" +
      "Ads::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.CurrencyConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetCurrencyConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetCurrencyConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetCurrencyConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.CurrencyConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
