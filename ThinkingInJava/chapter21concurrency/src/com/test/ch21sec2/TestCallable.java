package com.test.ch21sec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

    private final static int COUNT = 20;
    private static List<Future<Object>> futures = new ArrayList<>(COUNT);

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);

        for (int i = 0; i < COUNT; i++) {
            futures.add(i, es.submit(new MyCallable(i)));
        }

        es.shutdown();

        Thread t = new Thread(new ListenFutures());
        t.start();
    }

    private static class ListenFutures implements Runnable {
        private Set<Integer> set = new HashSet<>();

        @Override
        public void run() {
            while (set.size() != COUNT) {
                for (int i = 0; i < COUNT; i++) {
                    if (!set.contains(i) && futures.get(i).isDone()) {
                        try {
                            System.out.printf("end: %d, res: %s\n", System.currentTimeMillis(), futures.get(i).get());
                            set.add(i);
                        } catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
