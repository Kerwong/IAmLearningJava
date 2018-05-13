package com.test.ch21sec2;

import java.util.concurrent.TimeUnit;

/**
 * MyRunnable
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class MyRunnable implements Runnable {
    protected int countDown;

    public MyRunnable(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.printf("%s (%s)\n", Thread.currentThread(), countDown > 0 ? countDown : "Liftoff!");
            try {
                TimeUnit.MILLISECONDS.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
