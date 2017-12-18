package com.dragon.cate.service.learn;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture future1 = CompletableFuture.supplyAsync(() -> {
            // do sthing wasting time
            System.out.println("future 1 doing work...");
            String result = "hello";
            return result;
        });


        CompletableFuture future2 = CompletableFuture.supplyAsync(() -> {
            // do sth wasting time
            System.out.println("future 2 doing work...");
            String result = "world";
            return result;
        });

        /*CompletableFuture combineFuture = future1.thenCombine(CompletableFuture.supplyAsync(() -> {
            // do sthing wasting time
            System.out.println("future 1 doing work...");
            String result = "hello";
            return result;
        }), new BiFunction<String, String, String>() {
            @Override
            public String apply(String strA, String strB) {
                return null;
            }
        });*/
        CompletableFuture combineFuture = future1.thenCombine(future2, new BiFunction<String, String, String>() {
            @Override
            public String apply(String strA, String strB) {
                return strA + strB;
            }
        });
        System.out.println("combine future result=" + combineFuture.get());

        CompletableFuture<Object> anyOneResult = CompletableFuture.anyOf(future1, future2);
        System.out.println("第一个完成任务的执行结果:" + anyOneResult.get(10, TimeUnit.MILLISECONDS));
        CompletableFuture<Void> allResults = CompletableFuture.allOf(future1, future2);
        // 等待所有任务执行完成
        allResults.join();
        System.out.println("all task finished, to do next job...");
    }
}
