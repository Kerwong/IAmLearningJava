package chapter21.ex04;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class MyDaemonSpawnThread implements Runnable {
    @Override
    public void run() {

        while (true) {
            Thread.yield();
        }
    }
}
