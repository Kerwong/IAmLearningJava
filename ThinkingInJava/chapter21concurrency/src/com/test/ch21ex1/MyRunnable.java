package com.test.ch21ex1;

/**
 * MyRunnable
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class MyRunnable implements Runnable {

    private final int count = 3;
    private final int id;

    public MyRunnable(int id) {
        this.id = id;
        System.out.println("New " + id);
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.printf("#id: %d, %s\n", id, Thread.currentThread());
            Thread.yield();
        }

        System.out.println("#id: " + id +" End");
    }
}
