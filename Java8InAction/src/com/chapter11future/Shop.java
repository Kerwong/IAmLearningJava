package com.chapter11future;import java.util.List;import java.util.concurrent.CompletableFuture;import java.util.concurrent.ExecutorService;import java.util.concurrent.Executors;import java.util.concurrent.Future;import java.util.concurrent.TimeUnit;import java.util.stream.Collectors;/** * Created by wangwenchao02 on 2017/8/28. */public class Shop {    private static ExecutorService es = Executors.newCachedThreadPool();    public double getPrice(String product) {        System.out.println("getPrice(): " + product);        return calcPrice();    }    public List<String> findPrices(List<String> shops) {        return shops.parallelStream()                .map(s -> String.format("%s price is %s", s, Math.random()))                .collect(Collectors.toList());    }//    public List<String> findPricesFuture(List<String> shops) {//        List<CompletableFuture<String>> priceFuture = shops.stream()//                .map(s -> CompletableFuture.supplyAsync(() -> getPrice(s), es))//                .map(f -> f.thenApply(Quote::parse))//                .map(f -> f.thenCompose(q -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(q), es)))//                .collect(Collectors.toList());////        return priceFuture.stream().map(CompletableFuture::join).collect(Collectors.toList());//    }    public Future<Double> getPriceAsync(String product) {        System.out.println("getPriceAsync(): " + product);        CompletableFuture<Double> fp = new CompletableFuture<>();        es.execute(new Thread(() -> {            double price = calcPrice();            fp.complete(price);        }));        return fp;    }    public Future<Double> getPriceAsyncFactory(String product) {        System.out.println("getPriceAsyncFactory(): " + product);        return CompletableFuture.supplyAsync(() -> calcPrice());    }    private double calcPrice() {        delay();        return Math.random();    }    public static void delay() {        try {            TimeUnit.SECONDS.sleep(5);        } catch (InterruptedException e) {            e.printStackTrace();        }    }}