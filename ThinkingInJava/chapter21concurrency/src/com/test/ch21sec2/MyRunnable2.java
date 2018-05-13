package com.test.ch21sec2;

/**
 * MyRunnable
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class MyRunnable2 implements Runnable {
    protected int countDown;

    public MyRunnable2(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        Thread t = new Thread(new MyRunnable(5));
        t.start();

        while (countDown-- > 0) {
            System.out.printf("%s (%s)\n", Thread.currentThread(), countDown > 0 ? countDown : "Liftoff!");

            if (countDown == 3) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
