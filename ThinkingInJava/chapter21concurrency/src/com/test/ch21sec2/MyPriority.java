package com.test.ch21sec2;

public class MyPriority implements Runnable {
    private final int priority;
    private final int id;

    private volatile double d;
    private int countDown = 5;

    public MyPriority(int priority, int id) {
        this.priority = priority;
        this.id = id;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        Thread.currentThread().setDaemon(true);
        while (true) {
            for (int i = 0; i < 100000000; i++) {
                d += (Math.PI + Math.E) / i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }

            System.out.printf("#id: %d, priority: %d\n", id, priority);

            if (--countDown == 0)
                return;
        }
    }
}
