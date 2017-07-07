package chapter21.ex01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class MyThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff(5));
        }
        executorService.shutdown();
    }
}
