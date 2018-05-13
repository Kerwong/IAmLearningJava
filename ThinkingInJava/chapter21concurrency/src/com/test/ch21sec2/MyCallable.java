package com.test.ch21sec2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    private final int id;

    public MyCallable(int id) {
        this.id = id;
    }

    @Override
    public Integer call() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("#id: %d, thread: %s, count: %s\n", id, Thread.currentThread(), i);
            Thread.yield();
        }
        return id;
    }
}
