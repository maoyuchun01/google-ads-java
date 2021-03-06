// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/campaign_service.proto

package com.google.ads.googleads.v3.services;

public final class CampaignServiceProto {
  private CampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_CampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_CampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v3/services/campa" +
      "ign_service.proto\022 google.ads.googleads." +
      "v3.services\0320google/ads/googleads/v3/res" +
      "ources/campaign.proto\032\034google/api/annota" +
      "tions.proto\032\027google/api/client.proto\032\037go" +
      "ogle/api/field_behavior.proto\032 google/pr" +
      "otobuf/field_mask.proto\032\027google/rpc/stat" +
      "us.proto\"0\n\022GetCampaignRequest\022\032\n\rresour" +
      "ce_name\030\001 \001(\tB\003\340A\002\"\260\001\n\026MutateCampaignsRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\nopera" +
      "tions\030\002 \003(\01323.google.ads.googleads.v3.se" +
      "rvices.CampaignOperationB\003\340A\002\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\341\001" +
      "\n\021CampaignOperation\022/\n\013update_mask\030\004 \001(\013" +
      "2\032.google.protobuf.FieldMask\022=\n\006create\030\001" +
      " \001(\0132+.google.ads.googleads.v3.resources" +
      ".CampaignH\000\022=\n\006update\030\002 \001(\0132+.google.ads" +
      ".googleads.v3.resources.CampaignH\000\022\020\n\006re" +
      "move\030\003 \001(\tH\000B\013\n\toperation\"\225\001\n\027MutateCamp" +
      "aignsResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022G\n\007results\030\002 \003(" +
      "\01326.google.ads.googleads.v3.services.Mut" +
      "ateCampaignResult\"-\n\024MutateCampaignResul" +
      "t\022\025\n\rresource_name\030\001 \001(\t2\303\003\n\017CampaignSer" +
      "vice\022\265\001\n\013GetCampaign\0224.google.ads.google" +
      "ads.v3.services.GetCampaignRequest\032+.goo" +
      "gle.ads.googleads.v3.resources.Campaign\"" +
      "C\202\323\344\223\002-\022+/v3/{resource_name=customers/*/" +
      "campaigns/*}\332A\rresource_name\022\332\001\n\017MutateC" +
      "ampaigns\0228.google.ads.googleads.v3.servi" +
      "ces.MutateCampaignsRequest\0329.google.ads." +
      "googleads.v3.services.MutateCampaignsRes" +
      "ponse\"R\202\323\344\223\0023\"./v3/customers/{customer_i" +
      "d=*}/campaigns:mutate:\001*\332A\026customer_id,o" +
      "perations\032\033\312A\030googleads.googleapis.comB\373" +
      "\001\n$com.google.ads.googleads.v3.servicesB" +
      "\024CampaignServiceProtoP\001ZHgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v3/" +
      "services;services\242\002\003GAA\252\002 Google.Ads.Goo" +
      "gleAds.V3.Services\312\002 Google\\Ads\\GoogleAd" +
      "s\\V3\\Services\352\002$Google::Ads::GoogleAds::" +
      "V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.CampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_CampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_CampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_CampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.CampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
