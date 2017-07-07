package chapter21.ex04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool(new DaemonThreadFactory());

        for (int i = 0; i < 10; i++) {
            es.execute(new MyDaemonThread());
        }
        System.out.println("Thread start all");
        TimeUnit.MINUTES.sleep(100);
    }
}
