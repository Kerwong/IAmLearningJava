package chapter21.ex03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i < 5; i++) {
            executorService.execute(new MyThead(i, 10));
        }
        executorService.shutdown();
    }
}