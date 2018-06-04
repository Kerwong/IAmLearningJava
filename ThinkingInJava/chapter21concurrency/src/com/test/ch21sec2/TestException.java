package com.test.ch21sec2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestException {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10, new MyThreadFactory());
        es.execute(new MyExceptionThread());
        es.shutdown();
    }
}
