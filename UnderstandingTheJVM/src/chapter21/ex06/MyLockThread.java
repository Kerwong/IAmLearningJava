package chapter21.ex06;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class MyLockThread implements Runnable {
    private MyLock myLock;

    public MyLockThread(MyLock myLock) {
        this.myLock = myLock;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread() + " " + myLock.next());
        }
    }
}
