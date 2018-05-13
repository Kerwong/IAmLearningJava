package com.test.ch21sec2;

/**
 * TestMyRunnable
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class TestMyRunnable {

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable(3);
        runnable.run();
        MyRunnable runnable1 = new MyRunnable(5);
        runnable1.run();

        Thread thread = new Thread(new MyRunnable(3));
        thread.start();
        Thread thread2 = new Thread(new MyRunnable(5));
        thread2.start();
    }
}
