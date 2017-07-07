package chapter21.ex06;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class MyLock {

    private int cur = 0;
    private ReentrantLock lock = new ReentrantLock();
    public int next() {
        lock.tryLock();

        try {
            cur++;
            Thread.yield();
            cur++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return cur;
        } finally {
            lock.unlock();
        }
    }
}
