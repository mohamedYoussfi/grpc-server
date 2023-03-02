package net.youssfi.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ebank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = net.youssfi.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = net.youssfi.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = net.youssfi.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = net.youssfi.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
          BankServiceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStream",
      requestType = net.youssfi.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = net.youssfi.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod() {
    io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod;
    if ((getGetStreamMethod = BankServiceGrpc.getGetStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamMethod = BankServiceGrpc.getGetStreamMethod) == null) {
          BankServiceGrpc.getGetStreamMethod = getGetStreamMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStream"))
                  .build();
          }
        }
     }
     return getGetStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStream",
      requestType = net.youssfi.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = net.youssfi.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
      net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod() {
    io.grpc.MethodDescriptor<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod;
    if ((getFullStreamMethod = BankServiceGrpc.getFullStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getFullStreamMethod = BankServiceGrpc.getFullStreamMethod) == null) {
          BankServiceGrpc.getFullStreamMethod = getFullStreamMethod = 
              io.grpc.MethodDescriptor.<net.youssfi.stubs.Ebank.ConvertCurrencyRequest, net.youssfi.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "fullStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.youssfi.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("fullStream"))
                  .build();
          }
        }
     }
     return getFullStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(net.youssfi.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     */
    public void getStream(net.youssfi.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
                net.youssfi.stubs.Ebank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
                net.youssfi.stubs.Ebank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getGetStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
                net.youssfi.stubs.Ebank.ConvertCurrencyResponse>(
                  this, METHODID_GET_STREAM)))
          .addMethod(
            getFullStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.youssfi.stubs.Ebank.ConvertCurrencyRequest,
                net.youssfi.stubs.Ebank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(net.youssfi.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getStream(net.youssfi.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.youssfi.stubs.Ebank.ConvertCurrencyResponse convert(net.youssfi.stubs.Ebank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> getStream(
        net.youssfi.stubs.Ebank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.youssfi.stubs.Ebank.ConvertCurrencyResponse> convert(
        net.youssfi.stubs.Ebank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((net.youssfi.stubs.Ebank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM:
          serviceImpl.getStream((net.youssfi.stubs.Ebank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStream(
              (io.grpc.stub.StreamObserver<net.youssfi.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.youssfi.stubs.Ebank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getGetStreamMethod())
              .addMethod(getFullStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
