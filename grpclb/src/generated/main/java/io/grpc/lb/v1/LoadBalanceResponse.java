// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lb/v1/load_balancer.proto

package io.grpc.lb.v1;

/**
 * Protobuf type {@code grpc.lb.v1.LoadBalanceResponse}
 */
public  final class LoadBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.lb.v1.LoadBalanceResponse)
    LoadBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadBalanceResponse.newBuilder() to construct.
  private LoadBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadBalanceResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoadBalanceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            io.grpc.lb.v1.InitialLoadBalanceResponse.Builder subBuilder = null;
            if (loadBalanceResponseTypeCase_ == 1) {
              subBuilder = ((io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_).toBuilder();
            }
            loadBalanceResponseType_ =
                input.readMessage(io.grpc.lb.v1.InitialLoadBalanceResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_);
              loadBalanceResponseType_ = subBuilder.buildPartial();
            }
            loadBalanceResponseTypeCase_ = 1;
            break;
          }
          case 18: {
            io.grpc.lb.v1.ServerList.Builder subBuilder = null;
            if (loadBalanceResponseTypeCase_ == 2) {
              subBuilder = ((io.grpc.lb.v1.ServerList) loadBalanceResponseType_).toBuilder();
            }
            loadBalanceResponseType_ =
                input.readMessage(io.grpc.lb.v1.ServerList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.lb.v1.ServerList) loadBalanceResponseType_);
              loadBalanceResponseType_ = subBuilder.buildPartial();
            }
            loadBalanceResponseTypeCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.lb.v1.LoadBalanceResponse.class, io.grpc.lb.v1.LoadBalanceResponse.Builder.class);
  }

  private int loadBalanceResponseTypeCase_ = 0;
  private java.lang.Object loadBalanceResponseType_;
  public enum LoadBalanceResponseTypeCase
      implements com.google.protobuf.Internal.EnumLite {
    INITIAL_RESPONSE(1),
    SERVER_LIST(2),
    LOADBALANCERESPONSETYPE_NOT_SET(0);
    private final int value;
    private LoadBalanceResponseTypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoadBalanceResponseTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static LoadBalanceResponseTypeCase forNumber(int value) {
      switch (value) {
        case 1: return INITIAL_RESPONSE;
        case 2: return SERVER_LIST;
        case 0: return LOADBALANCERESPONSETYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public LoadBalanceResponseTypeCase
  getLoadBalanceResponseTypeCase() {
    return LoadBalanceResponseTypeCase.forNumber(
        loadBalanceResponseTypeCase_);
  }

  public static final int INITIAL_RESPONSE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * This message should be sent on the first response to the client.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
   */
  public boolean hasInitialResponse() {
    return loadBalanceResponseTypeCase_ == 1;
  }
  /**
   * <pre>
   * This message should be sent on the first response to the client.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
   */
  public io.grpc.lb.v1.InitialLoadBalanceResponse getInitialResponse() {
    if (loadBalanceResponseTypeCase_ == 1) {
       return (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_;
    }
    return io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
  }
  /**
   * <pre>
   * This message should be sent on the first response to the client.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
   */
  public io.grpc.lb.v1.InitialLoadBalanceResponseOrBuilder getInitialResponseOrBuilder() {
    if (loadBalanceResponseTypeCase_ == 1) {
       return (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_;
    }
    return io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
  }

  public static final int SERVER_LIST_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Contains the list of servers selected by the load balancer. The client
   * should send requests to these servers in the specified order.
   * </pre>
   *
   * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
   */
  public boolean hasServerList() {
    return loadBalanceResponseTypeCase_ == 2;
  }
  /**
   * <pre>
   * Contains the list of servers selected by the load balancer. The client
   * should send requests to these servers in the specified order.
   * </pre>
   *
   * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
   */
  public io.grpc.lb.v1.ServerList getServerList() {
    if (loadBalanceResponseTypeCase_ == 2) {
       return (io.grpc.lb.v1.ServerList) loadBalanceResponseType_;
    }
    return io.grpc.lb.v1.ServerList.getDefaultInstance();
  }
  /**
   * <pre>
   * Contains the list of servers selected by the load balancer. The client
   * should send requests to these servers in the specified order.
   * </pre>
   *
   * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
   */
  public io.grpc.lb.v1.ServerListOrBuilder getServerListOrBuilder() {
    if (loadBalanceResponseTypeCase_ == 2) {
       return (io.grpc.lb.v1.ServerList) loadBalanceResponseType_;
    }
    return io.grpc.lb.v1.ServerList.getDefaultInstance();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (loadBalanceResponseTypeCase_ == 1) {
      output.writeMessage(1, (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_);
    }
    if (loadBalanceResponseTypeCase_ == 2) {
      output.writeMessage(2, (io.grpc.lb.v1.ServerList) loadBalanceResponseType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loadBalanceResponseTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_);
    }
    if (loadBalanceResponseTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.grpc.lb.v1.ServerList) loadBalanceResponseType_);
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
    if (!(obj instanceof io.grpc.lb.v1.LoadBalanceResponse)) {
      return super.equals(obj);
    }
    io.grpc.lb.v1.LoadBalanceResponse other = (io.grpc.lb.v1.LoadBalanceResponse) obj;

    boolean result = true;
    result = result && getLoadBalanceResponseTypeCase().equals(
        other.getLoadBalanceResponseTypeCase());
    if (!result) return false;
    switch (loadBalanceResponseTypeCase_) {
      case 1:
        result = result && getInitialResponse()
            .equals(other.getInitialResponse());
        break;
      case 2:
        result = result && getServerList()
            .equals(other.getServerList());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (loadBalanceResponseTypeCase_) {
      case 1:
        hash = (37 * hash) + INITIAL_RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getInitialResponse().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SERVER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getServerList().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.lb.v1.LoadBalanceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.lb.v1.LoadBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.lb.v1.LoadBalanceResponse)
      io.grpc.lb.v1.LoadBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.lb.v1.LoadBalanceResponse.class, io.grpc.lb.v1.LoadBalanceResponse.Builder.class);
    }

    // Construct using io.grpc.lb.v1.LoadBalanceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      loadBalanceResponseTypeCase_ = 0;
      loadBalanceResponseType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceResponse getDefaultInstanceForType() {
      return io.grpc.lb.v1.LoadBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceResponse build() {
      io.grpc.lb.v1.LoadBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceResponse buildPartial() {
      io.grpc.lb.v1.LoadBalanceResponse result = new io.grpc.lb.v1.LoadBalanceResponse(this);
      if (loadBalanceResponseTypeCase_ == 1) {
        if (initialResponseBuilder_ == null) {
          result.loadBalanceResponseType_ = loadBalanceResponseType_;
        } else {
          result.loadBalanceResponseType_ = initialResponseBuilder_.build();
        }
      }
      if (loadBalanceResponseTypeCase_ == 2) {
        if (serverListBuilder_ == null) {
          result.loadBalanceResponseType_ = loadBalanceResponseType_;
        } else {
          result.loadBalanceResponseType_ = serverListBuilder_.build();
        }
      }
      result.loadBalanceResponseTypeCase_ = loadBalanceResponseTypeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.lb.v1.LoadBalanceResponse) {
        return mergeFrom((io.grpc.lb.v1.LoadBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.lb.v1.LoadBalanceResponse other) {
      if (other == io.grpc.lb.v1.LoadBalanceResponse.getDefaultInstance()) return this;
      switch (other.getLoadBalanceResponseTypeCase()) {
        case INITIAL_RESPONSE: {
          mergeInitialResponse(other.getInitialResponse());
          break;
        }
        case SERVER_LIST: {
          mergeServerList(other.getServerList());
          break;
        }
        case LOADBALANCERESPONSETYPE_NOT_SET: {
          break;
        }
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
      io.grpc.lb.v1.LoadBalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.lb.v1.LoadBalanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int loadBalanceResponseTypeCase_ = 0;
    private java.lang.Object loadBalanceResponseType_;
    public LoadBalanceResponseTypeCase
        getLoadBalanceResponseTypeCase() {
      return LoadBalanceResponseTypeCase.forNumber(
          loadBalanceResponseTypeCase_);
    }

    public Builder clearLoadBalanceResponseType() {
      loadBalanceResponseTypeCase_ = 0;
      loadBalanceResponseType_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.InitialLoadBalanceResponse, io.grpc.lb.v1.InitialLoadBalanceResponse.Builder, io.grpc.lb.v1.InitialLoadBalanceResponseOrBuilder> initialResponseBuilder_;
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public boolean hasInitialResponse() {
      return loadBalanceResponseTypeCase_ == 1;
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceResponse getInitialResponse() {
      if (initialResponseBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 1) {
          return (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_;
        }
        return io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
      } else {
        if (loadBalanceResponseTypeCase_ == 1) {
          return initialResponseBuilder_.getMessage();
        }
        return io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public Builder setInitialResponse(io.grpc.lb.v1.InitialLoadBalanceResponse value) {
      if (initialResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loadBalanceResponseType_ = value;
        onChanged();
      } else {
        initialResponseBuilder_.setMessage(value);
      }
      loadBalanceResponseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public Builder setInitialResponse(
        io.grpc.lb.v1.InitialLoadBalanceResponse.Builder builderForValue) {
      if (initialResponseBuilder_ == null) {
        loadBalanceResponseType_ = builderForValue.build();
        onChanged();
      } else {
        initialResponseBuilder_.setMessage(builderForValue.build());
      }
      loadBalanceResponseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public Builder mergeInitialResponse(io.grpc.lb.v1.InitialLoadBalanceResponse value) {
      if (initialResponseBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 1 &&
            loadBalanceResponseType_ != io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance()) {
          loadBalanceResponseType_ = io.grpc.lb.v1.InitialLoadBalanceResponse.newBuilder((io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_)
              .mergeFrom(value).buildPartial();
        } else {
          loadBalanceResponseType_ = value;
        }
        onChanged();
      } else {
        if (loadBalanceResponseTypeCase_ == 1) {
          initialResponseBuilder_.mergeFrom(value);
        }
        initialResponseBuilder_.setMessage(value);
      }
      loadBalanceResponseTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public Builder clearInitialResponse() {
      if (initialResponseBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 1) {
          loadBalanceResponseTypeCase_ = 0;
          loadBalanceResponseType_ = null;
          onChanged();
        }
      } else {
        if (loadBalanceResponseTypeCase_ == 1) {
          loadBalanceResponseTypeCase_ = 0;
          loadBalanceResponseType_ = null;
        }
        initialResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceResponse.Builder getInitialResponseBuilder() {
      return getInitialResponseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceResponseOrBuilder getInitialResponseOrBuilder() {
      if ((loadBalanceResponseTypeCase_ == 1) && (initialResponseBuilder_ != null)) {
        return initialResponseBuilder_.getMessageOrBuilder();
      } else {
        if (loadBalanceResponseTypeCase_ == 1) {
          return (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_;
        }
        return io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * This message should be sent on the first response to the client.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceResponse initial_response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.InitialLoadBalanceResponse, io.grpc.lb.v1.InitialLoadBalanceResponse.Builder, io.grpc.lb.v1.InitialLoadBalanceResponseOrBuilder> 
        getInitialResponseFieldBuilder() {
      if (initialResponseBuilder_ == null) {
        if (!(loadBalanceResponseTypeCase_ == 1)) {
          loadBalanceResponseType_ = io.grpc.lb.v1.InitialLoadBalanceResponse.getDefaultInstance();
        }
        initialResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.lb.v1.InitialLoadBalanceResponse, io.grpc.lb.v1.InitialLoadBalanceResponse.Builder, io.grpc.lb.v1.InitialLoadBalanceResponseOrBuilder>(
                (io.grpc.lb.v1.InitialLoadBalanceResponse) loadBalanceResponseType_,
                getParentForChildren(),
                isClean());
        loadBalanceResponseType_ = null;
      }
      loadBalanceResponseTypeCase_ = 1;
      onChanged();;
      return initialResponseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.ServerList, io.grpc.lb.v1.ServerList.Builder, io.grpc.lb.v1.ServerListOrBuilder> serverListBuilder_;
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public boolean hasServerList() {
      return loadBalanceResponseTypeCase_ == 2;
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public io.grpc.lb.v1.ServerList getServerList() {
      if (serverListBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 2) {
          return (io.grpc.lb.v1.ServerList) loadBalanceResponseType_;
        }
        return io.grpc.lb.v1.ServerList.getDefaultInstance();
      } else {
        if (loadBalanceResponseTypeCase_ == 2) {
          return serverListBuilder_.getMessage();
        }
        return io.grpc.lb.v1.ServerList.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public Builder setServerList(io.grpc.lb.v1.ServerList value) {
      if (serverListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loadBalanceResponseType_ = value;
        onChanged();
      } else {
        serverListBuilder_.setMessage(value);
      }
      loadBalanceResponseTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public Builder setServerList(
        io.grpc.lb.v1.ServerList.Builder builderForValue) {
      if (serverListBuilder_ == null) {
        loadBalanceResponseType_ = builderForValue.build();
        onChanged();
      } else {
        serverListBuilder_.setMessage(builderForValue.build());
      }
      loadBalanceResponseTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public Builder mergeServerList(io.grpc.lb.v1.ServerList value) {
      if (serverListBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 2 &&
            loadBalanceResponseType_ != io.grpc.lb.v1.ServerList.getDefaultInstance()) {
          loadBalanceResponseType_ = io.grpc.lb.v1.ServerList.newBuilder((io.grpc.lb.v1.ServerList) loadBalanceResponseType_)
              .mergeFrom(value).buildPartial();
        } else {
          loadBalanceResponseType_ = value;
        }
        onChanged();
      } else {
        if (loadBalanceResponseTypeCase_ == 2) {
          serverListBuilder_.mergeFrom(value);
        }
        serverListBuilder_.setMessage(value);
      }
      loadBalanceResponseTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public Builder clearServerList() {
      if (serverListBuilder_ == null) {
        if (loadBalanceResponseTypeCase_ == 2) {
          loadBalanceResponseTypeCase_ = 0;
          loadBalanceResponseType_ = null;
          onChanged();
        }
      } else {
        if (loadBalanceResponseTypeCase_ == 2) {
          loadBalanceResponseTypeCase_ = 0;
          loadBalanceResponseType_ = null;
        }
        serverListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public io.grpc.lb.v1.ServerList.Builder getServerListBuilder() {
      return getServerListFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    public io.grpc.lb.v1.ServerListOrBuilder getServerListOrBuilder() {
      if ((loadBalanceResponseTypeCase_ == 2) && (serverListBuilder_ != null)) {
        return serverListBuilder_.getMessageOrBuilder();
      } else {
        if (loadBalanceResponseTypeCase_ == 2) {
          return (io.grpc.lb.v1.ServerList) loadBalanceResponseType_;
        }
        return io.grpc.lb.v1.ServerList.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Contains the list of servers selected by the load balancer. The client
     * should send requests to these servers in the specified order.
     * </pre>
     *
     * <code>.grpc.lb.v1.ServerList server_list = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.ServerList, io.grpc.lb.v1.ServerList.Builder, io.grpc.lb.v1.ServerListOrBuilder> 
        getServerListFieldBuilder() {
      if (serverListBuilder_ == null) {
        if (!(loadBalanceResponseTypeCase_ == 2)) {
          loadBalanceResponseType_ = io.grpc.lb.v1.ServerList.getDefaultInstance();
        }
        serverListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.lb.v1.ServerList, io.grpc.lb.v1.ServerList.Builder, io.grpc.lb.v1.ServerListOrBuilder>(
                (io.grpc.lb.v1.ServerList) loadBalanceResponseType_,
                getParentForChildren(),
                isClean());
        loadBalanceResponseType_ = null;
      }
      loadBalanceResponseTypeCase_ = 2;
      onChanged();;
      return serverListBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.lb.v1.LoadBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.lb.v1.LoadBalanceResponse)
  private static final io.grpc.lb.v1.LoadBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.lb.v1.LoadBalanceResponse();
  }

  public static io.grpc.lb.v1.LoadBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<LoadBalanceResponse>() {
    @java.lang.Override
    public LoadBalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoadBalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoadBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadBalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.lb.v1.LoadBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

