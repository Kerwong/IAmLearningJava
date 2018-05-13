package com.test.ch21sec2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPriority {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            es.execute(new MyPriority(10 - i, i));
        }

        es.shutdown();
    }
}
