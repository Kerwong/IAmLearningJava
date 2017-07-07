package chapter21.ex04;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class MyDaemonThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            new Thread(new MyDaemonSpawnThread()).start();
            System.out.println("daemon " + i + " start");
        }

        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread().getName() + "\t" + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
