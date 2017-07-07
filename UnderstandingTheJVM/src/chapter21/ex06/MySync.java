package chapter21.ex06;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class MySync {

    private int cur = 0;

    public synchronized int next() {
        try {
            cur++;
            Thread.yield();
            cur++;
            cur++;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cur;
    }
}
