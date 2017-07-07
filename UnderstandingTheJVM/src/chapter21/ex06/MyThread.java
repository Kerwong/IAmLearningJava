package chapter21.ex06;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class MyThread implements Runnable {
    private MySync mySync;

    public MyThread(MySync mySync) {
        this.mySync = mySync;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread() + " " + mySync.next());
        }
    }
}
