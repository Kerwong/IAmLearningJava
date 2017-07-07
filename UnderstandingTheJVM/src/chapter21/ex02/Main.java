package chapter21.ex02;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        ArrayList<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(es.submit(new TaskCallable(i)));
        }

        while (true) {
            Future<Integer> fs = list.get(0);
            try {
                if (fs.isDone()) {
                    fs.get();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                es.shutdown();
            }
        }
    }
}
