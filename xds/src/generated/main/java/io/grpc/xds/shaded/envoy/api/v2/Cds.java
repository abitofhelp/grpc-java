// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/cds.proto

package io.grpc.xds.shaded.envoy.api.v2;

public final class Cds {
  private Cds() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_EdsClusterConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_EdsClusterConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_ExtensionProtocolOptionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_ExtensionProtocolOptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_TypedExtensionProtocolOptionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_TypedExtensionProtocolOptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_LbSubsetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_LbSubsetSelector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_LbSubsetConfig_LbSubsetSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_LeastRequestLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_LeastRequestLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_RingHashLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_DeprecatedV1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_RingHashLbConfig_DeprecatedV1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_OriginalDstLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_OriginalDstLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_CommonLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_ZoneAwareLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_CommonLbConfig_ZoneAwareLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_LocalityWeightedLbConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Cluster_CommonLbConfig_LocalityWeightedLbConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_UpstreamBindConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_UpstreamBindConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_UpstreamConnectionOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_UpstreamConnectionOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026envoy/api/v2/cds.proto\022\014envoy.api.v2\032\037" +
      "envoy/api/v2/core/address.proto\032\034envoy/a" +
      "pi/v2/auth/cert.proto\032\034envoy/api/v2/core" +
      "/base.proto\032%envoy/api/v2/core/config_so" +
      "urce.proto\032\034envoy/api/v2/discovery.proto" +
      "\032$envoy/api/v2/core/health_check.proto\032 " +
      "envoy/api/v2/core/protocol.proto\032*envoy/" +
      "api/v2/cluster/circuit_breaker.proto\032,en" +
      "voy/api/v2/cluster/outlier_detection.pro" +
      "to\032\026envoy/api/v2/eds.proto\032\030envoy/type/p" +
      "ercent.proto\032\034google/api/annotations.pro" +
      "to\032\031google/protobuf/any.proto\032\036google/pr" +
      "otobuf/duration.proto\032\034google/protobuf/s" +
      "truct.proto\032\036google/protobuf/wrappers.pr" +
      "oto\032\027validate/validate.proto\"\336 \n\007Cluster" +
      "\022\027\n\004name\030\001 \001(\tB\t\272\351\300\003\004r\002 \001\022\025\n\ralt_stat_na" +
      "me\030\034 \001(\t\022=\n\004type\030\002 \001(\0162#.envoy.api.v2.Cl" +
      "uster.DiscoveryTypeB\n\272\351\300\003\005\202\001\002\020\001\022B\n\022eds_c" +
      "luster_config\030\003 \001(\0132&.envoy.api.v2.Clust" +
      "er.EdsClusterConfig\022>\n\017connect_timeout\030\004" +
      " \001(\0132\031.google.protobuf.DurationB\n\272\351\300\003\005\252\001" +
      "\002*\000\022G\n!per_connection_buffer_limit_bytes" +
      "\030\005 \001(\0132\034.google.protobuf.UInt32Value\022=\n\t" +
      "lb_policy\030\006 \001(\0162\036.envoy.api.v2.Cluster.L" +
      "bPolicyB\n\272\351\300\003\005\202\001\002\020\001\022-\n\005hosts\030\007 \003(\0132\032.env" +
      "oy.api.v2.core.AddressB\002\030\001\022<\n\017load_assig" +
      "nment\030! \001(\0132#.envoy.api.v2.ClusterLoadAs" +
      "signment\0225\n\rhealth_checks\030\010 \003(\0132\036.envoy." +
      "api.v2.core.HealthCheck\022A\n\033max_requests_" +
      "per_connection\030\t \001(\0132\034.google.protobuf.U" +
      "Int32Value\022?\n\020circuit_breakers\030\n \001(\0132%.e" +
      "nvoy.api.v2.cluster.CircuitBreakers\022:\n\013t" +
      "ls_context\030\013 \001(\0132%.envoy.api.v2.auth.Ups" +
      "treamTlsContext\022L\n\034common_http_protocol_" +
      "options\030\035 \001(\0132&.envoy.api.v2.core.HttpPr" +
      "otocolOptions\022F\n\025http_protocol_options\030\r" +
      " \001(\0132\'.envoy.api.v2.core.Http1ProtocolOp" +
      "tions\022G\n\026http2_protocol_options\030\016 \001(\0132\'." +
      "envoy.api.v2.core.Http2ProtocolOptions\022W" +
      "\n\032extension_protocol_options\030# \003(\01323.env" +
      "oy.api.v2.Cluster.ExtensionProtocolOptio" +
      "nsEntry\022b\n typed_extension_protocol_opti" +
      "ons\030$ \003(\01328.envoy.api.v2.Cluster.TypedEx" +
      "tensionProtocolOptionsEntry\022?\n\020dns_refre" +
      "sh_rate\030\020 \001(\0132\031.google.protobuf.Duration" +
      "B\n\272\351\300\003\005\252\001\002*\000\022L\n\021dns_lookup_family\030\021 \001(\0162" +
      "%.envoy.api.v2.Cluster.DnsLookupFamilyB\n" +
      "\272\351\300\003\005\202\001\002\020\001\0221\n\rdns_resolvers\030\022 \003(\0132\032.envo" +
      "y.api.v2.core.Address\022A\n\021outlier_detecti" +
      "on\030\023 \001(\0132&.envoy.api.v2.cluster.OutlierD" +
      "etection\022?\n\020cleanup_interval\030\024 \001(\0132\031.goo" +
      "gle.protobuf.DurationB\n\272\351\300\003\005\252\001\002*\000\022;\n\024ups" +
      "tream_bind_config\030\025 \001(\0132\035.envoy.api.v2.c" +
      "ore.BindConfig\022>\n\020lb_subset_config\030\026 \001(\013" +
      "2$.envoy.api.v2.Cluster.LbSubsetConfig\022E" +
      "\n\023ring_hash_lb_config\030\027 \001(\0132&.envoy.api." +
      "v2.Cluster.RingHashLbConfigH\000\022K\n\026origina" +
      "l_dst_lb_config\030\" \001(\0132).envoy.api.v2.Clu" +
      "ster.OriginalDstLbConfigH\000\022M\n\027least_requ" +
      "est_lb_config\030% \001(\0132*.envoy.api.v2.Clust" +
      "er.LeastRequestLbConfigH\000\022>\n\020common_lb_c" +
      "onfig\030\033 \001(\0132$.envoy.api.v2.Cluster.Commo" +
      "nLbConfig\022<\n\020transport_socket\030\030 \001(\0132\".en" +
      "voy.api.v2.core.TransportSocket\022-\n\010metad" +
      "ata\030\031 \001(\0132\033.envoy.api.v2.core.Metadata\022J" +
      "\n\022protocol_selection\030\032 \001(\0162..envoy.api.v" +
      "2.Cluster.ClusterProtocolSelection\022L\n\033up" +
      "stream_connection_options\030\036 \001(\0132\'.envoy." +
      "api.v2.UpstreamConnectionOptions\0220\n(clos" +
      "e_connections_on_host_health_failure\030\037 \001" +
      "(\010\022)\n!drain_connections_on_host_removal\030" +
      "  \001(\010\032]\n\020EdsClusterConfig\0223\n\neds_config\030" +
      "\001 \001(\0132\037.envoy.api.v2.core.ConfigSource\022\024" +
      "\n\014service_name\030\002 \001(\t\032X\n\035ExtensionProtoco" +
      "lOptionsEntry\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 \001(" +
      "\0132\027.google.protobuf.Struct:\0028\001\032Z\n\"TypedE" +
      "xtensionProtocolOptionsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022#\n\005value\030\002 \001(\0132\024.google.protobuf.Any:\002" +
      "8\001\032\245\003\n\016LbSubsetConfig\022`\n\017fallback_policy" +
      "\030\001 \001(\0162;.envoy.api.v2.Cluster.LbSubsetCo" +
      "nfig.LbSubsetFallbackPolicyB\n\272\351\300\003\005\202\001\002\020\001\022" +
      "/\n\016default_subset\030\002 \001(\0132\027.google.protobu" +
      "f.Struct\022O\n\020subset_selectors\030\003 \003(\01325.env" +
      "oy.api.v2.Cluster.LbSubsetConfig.LbSubse" +
      "tSelector\022\035\n\025locality_weight_aware\030\004 \001(\010" +
      "\022\035\n\025scale_locality_weight\030\005 \001(\010\032 \n\020LbSub" +
      "setSelector\022\014\n\004keys\030\001 \003(\t\"O\n\026LbSubsetFal" +
      "lbackPolicy\022\017\n\013NO_FALLBACK\020\000\022\020\n\014ANY_ENDP" +
      "OINT\020\001\022\022\n\016DEFAULT_SUBSET\020\002\032U\n\024LeastReque" +
      "stLbConfig\022=\n\014choice_count\030\001 \001(\0132\034.googl" +
      "e.protobuf.UInt32ValueB\t\272\351\300\003\004*\002(\002\032\353\001\n\020Ri" +
      "ngHashLbConfig\022E\n\021minimum_ring_size\030\001 \001(" +
      "\0132\034.google.protobuf.UInt64ValueB\014\272\351\300\003\0072\005" +
      "\030\200\200\200\004\022N\n\rdeprecated_v1\030\002 \001(\01323.envoy.api" +
      ".v2.Cluster.RingHashLbConfig.DeprecatedV" +
      "1B\002\030\001\032@\n\014DeprecatedV1\0220\n\014use_std_hash\030\001 " +
      "\001(\0132\032.google.protobuf.BoolValue\032.\n\023Origi" +
      "nalDstLbConfig\022\027\n\017use_http_header\030\001 \001(\010\032" +
      "\360\003\n\016CommonLbConfig\0224\n\027healthy_panic_thre" +
      "shold\030\001 \001(\0132\023.envoy.type.Percent\022V\n\024zone" +
      "_aware_lb_config\030\002 \001(\01326.envoy.api.v2.Cl" +
      "uster.CommonLbConfig.ZoneAwareLbConfigH\000" +
      "\022d\n\033locality_weighted_lb_config\030\003 \001(\0132=." +
      "envoy.api.v2.Cluster.CommonLbConfig.Loca" +
      "lityWeightedLbConfigH\000\0226\n\023update_merge_w" +
      "indow\030\004 \001(\0132\031.google.protobuf.Duration\032y" +
      "\n\021ZoneAwareLbConfig\022,\n\017routing_enabled\030\001" +
      " \001(\0132\023.envoy.type.Percent\0226\n\020min_cluster" +
      "_size\030\002 \001(\0132\034.google.protobuf.UInt64Valu" +
      "e\032\032\n\030LocalityWeightedLbConfigB\033\n\031localit" +
      "y_config_specifier\"W\n\rDiscoveryType\022\n\n\006S" +
      "TATIC\020\000\022\016\n\nSTRICT_DNS\020\001\022\017\n\013LOGICAL_DNS\020\002" +
      "\022\007\n\003EDS\020\003\022\020\n\014ORIGINAL_DST\020\004\"j\n\010LbPolicy\022" +
      "\017\n\013ROUND_ROBIN\020\000\022\021\n\rLEAST_REQUEST\020\001\022\r\n\tR" +
      "ING_HASH\020\002\022\n\n\006RANDOM\020\003\022\023\n\017ORIGINAL_DST_L" +
      "B\020\004\022\n\n\006MAGLEV\020\005\"5\n\017DnsLookupFamily\022\010\n\004AU" +
      "TO\020\000\022\013\n\007V4_ONLY\020\001\022\013\n\007V6_ONLY\020\002\"T\n\030Cluste" +
      "rProtocolSelection\022\033\n\027USE_CONFIGURED_PRO" +
      "TOCOL\020\000\022\033\n\027USE_DOWNSTREAM_PROTOCOL\020\001B\013\n\t" +
      "lb_configJ\004\010\014\020\rJ\004\010\017\020\020\"H\n\022UpstreamBindCon" +
      "fig\0222\n\016source_address\030\001 \001(\0132\032.envoy.api." +
      "v2.core.Address\"S\n\031UpstreamConnectionOpt" +
      "ions\0226\n\rtcp_keepalive\030\001 \001(\0132\037.envoy.api." +
      "v2.core.TcpKeepalive2\333\002\n\027ClusterDiscover" +
      "yService\022W\n\016StreamClusters\022\036.envoy.api.v" +
      "2.DiscoveryRequest\032\037.envoy.api.v2.Discov" +
      "eryResponse\"\000(\0010\001\022r\n\023IncrementalClusters" +
      "\022).envoy.api.v2.IncrementalDiscoveryRequ" +
      "est\032*.envoy.api.v2.IncrementalDiscoveryR" +
      "esponse\"\000(\0010\001\022s\n\rFetchClusters\022\036.envoy.a" +
      "pi.v2.DiscoveryRequest\032\037.envoy.api.v2.Di" +
      "scoveryResponse\"!\202\323\344\223\002\033\"\026/v2/discovery:c" +
      "lusters:\001*B&\n\037io.grpc.xds.shaded.envoy.a" +
      "pi.v2P\001\210\001\001b\006proto3"
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
          io.grpc.xds.shaded.envoy.api.v2.core.AddressOuterClass.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.auth.Cert.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.Discovery.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.core.HealthCheckOuterClass.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.core.Protocol.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.cluster.CircuitBreaker.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.cluster.OutlierDetectionOuterClass.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.Eds.getDescriptor(),
          io.grpc.xds.shaded.envoy.type.PercentOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          io.grpc.xds.shaded.validate.Validate.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_Cluster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_Cluster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_descriptor,
        new java.lang.String[] { "Name", "AltStatName", "Type", "EdsClusterConfig", "ConnectTimeout", "PerConnectionBufferLimitBytes", "LbPolicy", "Hosts", "LoadAssignment", "HealthChecks", "MaxRequestsPerConnection", "CircuitBreakers", "TlsContext", "CommonHttpProtocolOptions", "HttpProtocolOptions", "Http2ProtocolOptions", "ExtensionProtocolOptions", "TypedExtensionProtocolOptions", "DnsRefreshRate", "DnsLookupFamily", "DnsResolvers", "OutlierDetection", "CleanupInterval", "UpstreamBindConfig", "LbSubsetConfig", "RingHashLbConfig", "OriginalDstLbConfig", "LeastRequestLbConfig", "CommonLbConfig", "TransportSocket", "Metadata", "ProtocolSelection", "UpstreamConnectionOptions", "CloseConnectionsOnHostHealthFailure", "DrainConnectionsOnHostRemoval", "LbConfig", });
    internal_static_envoy_api_v2_Cluster_EdsClusterConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_Cluster_EdsClusterConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_EdsClusterConfig_descriptor,
        new java.lang.String[] { "EdsConfig", "ServiceName", });
    internal_static_envoy_api_v2_Cluster_ExtensionProtocolOptionsEntry_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(1);
    internal_static_envoy_api_v2_Cluster_ExtensionProtocolOptionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_ExtensionProtocolOptionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_api_v2_Cluster_TypedExtensionProtocolOptionsEntry_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(2);
    internal_static_envoy_api_v2_Cluster_TypedExtensionProtocolOptionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_TypedExtensionProtocolOptionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(3);
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_LbSubsetConfig_descriptor,
        new java.lang.String[] { "FallbackPolicy", "DefaultSubset", "SubsetSelectors", "LocalityWeightAware", "ScaleLocalityWeight", });
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_LbSubsetSelector_descriptor =
      internal_static_envoy_api_v2_Cluster_LbSubsetConfig_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_Cluster_LbSubsetConfig_LbSubsetSelector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_LbSubsetConfig_LbSubsetSelector_descriptor,
        new java.lang.String[] { "Keys", });
    internal_static_envoy_api_v2_Cluster_LeastRequestLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(4);
    internal_static_envoy_api_v2_Cluster_LeastRequestLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_LeastRequestLbConfig_descriptor,
        new java.lang.String[] { "ChoiceCount", });
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(5);
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_RingHashLbConfig_descriptor,
        new java.lang.String[] { "MinimumRingSize", "DeprecatedV1", });
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_DeprecatedV1_descriptor =
      internal_static_envoy_api_v2_Cluster_RingHashLbConfig_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_Cluster_RingHashLbConfig_DeprecatedV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_RingHashLbConfig_DeprecatedV1_descriptor,
        new java.lang.String[] { "UseStdHash", });
    internal_static_envoy_api_v2_Cluster_OriginalDstLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(6);
    internal_static_envoy_api_v2_Cluster_OriginalDstLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_OriginalDstLbConfig_descriptor,
        new java.lang.String[] { "UseHttpHeader", });
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_descriptor.getNestedTypes().get(7);
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_CommonLbConfig_descriptor,
        new java.lang.String[] { "HealthyPanicThreshold", "ZoneAwareLbConfig", "LocalityWeightedLbConfig", "UpdateMergeWindow", "LocalityConfigSpecifier", });
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_ZoneAwareLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_CommonLbConfig_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_ZoneAwareLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_CommonLbConfig_ZoneAwareLbConfig_descriptor,
        new java.lang.String[] { "RoutingEnabled", "MinClusterSize", });
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_LocalityWeightedLbConfig_descriptor =
      internal_static_envoy_api_v2_Cluster_CommonLbConfig_descriptor.getNestedTypes().get(1);
    internal_static_envoy_api_v2_Cluster_CommonLbConfig_LocalityWeightedLbConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Cluster_CommonLbConfig_LocalityWeightedLbConfig_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_api_v2_UpstreamBindConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_UpstreamBindConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_UpstreamBindConfig_descriptor,
        new java.lang.String[] { "SourceAddress", });
    internal_static_envoy_api_v2_UpstreamConnectionOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_UpstreamConnectionOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_UpstreamConnectionOptions_descriptor,
        new java.lang.String[] { "TcpKeepalive", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(io.grpc.xds.shaded.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.grpc.xds.shaded.envoy.api.v2.core.AddressOuterClass.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.auth.Cert.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.Discovery.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.core.HealthCheckOuterClass.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.core.Protocol.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.cluster.CircuitBreaker.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.cluster.OutlierDetectionOuterClass.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.Eds.getDescriptor();
    io.grpc.xds.shaded.envoy.type.PercentOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    io.grpc.xds.shaded.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
