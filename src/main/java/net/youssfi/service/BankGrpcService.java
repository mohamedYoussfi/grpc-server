package net.youssfi.service;

import io.grpc.stub.StreamObserver;
import net.youssfi.stubs.BankServiceGrpc;
import net.youssfi.stubs.Ebank;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void convert(Ebank.ConvertCurrencyRequest request, StreamObserver<Ebank.ConvertCurrencyResponse> responseObserver) {
        String currencyFrom=request.getCurrencyFrom();
        String currencyTo=request.getCurrencyTo();
        double amount=request.getAmount();
        double result=amount*11.4;
        Ebank.ConvertCurrencyResponse response= Ebank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Ebank.ConvertCurrencyRequest> performStream(StreamObserver<Ebank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Ebank.ConvertCurrencyRequest>() {
            double sum=0;
            @Override
            public void onNext(Ebank.ConvertCurrencyRequest convertCurrencyRequest) {
                sum+=convertCurrencyRequest.getAmount();
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
                double result=sum*11.4;
                Ebank.ConvertCurrencyResponse response= Ebank.ConvertCurrencyResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getStream(Ebank.ConvertCurrencyRequest request, StreamObserver<Ebank.ConvertCurrencyResponse> responseObserver) {
        double amount=request.getAmount();
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int counter=0;
            @Override
            public void run() {
                Ebank.ConvertCurrencyResponse response= Ebank.ConvertCurrencyResponse.newBuilder()
                        .setResult(amount*Math.random()*11)
                        .build();
                responseObserver.onNext(response);
                ++counter;
                if(counter==10){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);
    }

    @Override
    public StreamObserver<Ebank.ConvertCurrencyRequest> fullStream(StreamObserver<Ebank.ConvertCurrencyResponse> responseObserver) {
       return new StreamObserver<Ebank.ConvertCurrencyRequest>() {
           @Override
           public void onNext(Ebank.ConvertCurrencyRequest convertCurrencyRequest) {
               Ebank.ConvertCurrencyResponse response= Ebank.ConvertCurrencyResponse.newBuilder()
                       .setResult(convertCurrencyRequest.getAmount()*21)
                       .build();
               responseObserver.onNext(response);
           }

           @Override
           public void onError(Throwable throwable) {

           }

           @Override
           public void onCompleted() {
               responseObserver.onCompleted();
           }
       };
    }
}
