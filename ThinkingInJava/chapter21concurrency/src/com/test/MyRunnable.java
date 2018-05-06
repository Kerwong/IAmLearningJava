package com.test;

/**
 * MyRunnable
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class MyRunnable implements Runnable {
    private static int count = 0;
    private final int tNo = count++;
    protected int countDown = 10;

    public MyRunnable(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.printf("#%d, %s (%s)\n", tNo, Thread.currentThread(), countDown > 0 ? countDown : "Liftoff!");
            Thread.yield();
        }
    }
}
