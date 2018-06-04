package com.test.ch21sec3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSync {

    public static void main(String[] args) {
        Counter counter = new Counter();

        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(() -> counter.add());
        es.execute(() -> counter.add());
        es.execute(() -> counter.mul());
        es.execute(() -> counter.mul());
        es.execute(() -> counter.min());
        es.execute(() -> counter.min());

        es.shutdown();
    }
}
