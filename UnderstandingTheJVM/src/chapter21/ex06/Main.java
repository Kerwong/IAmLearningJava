package chapter21.ex06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class Main {
    public static void main(String[] args) {
//        MySync mySync = new MySync();
//
//        ExecutorService es = Executors.newCachedThreadPool();
//
//        for (int i = 0; i < 3; i++) {
//            es.execute(new MyThread(mySync));
//        }
//        es.shutdown();

        MyLock myLock = new MyLock();

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            es.execute(new MyLockThread(myLock));
        }
        es.shutdown();
    }
}
