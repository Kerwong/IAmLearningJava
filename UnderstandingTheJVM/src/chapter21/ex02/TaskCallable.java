package chapter21.ex02;

import java.util.concurrent.Callable;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class TaskCallable implements Callable<Integer> {
    private int id;

    public TaskCallable() {
    }

    public TaskCallable(int i) {
        this.id = i;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "=====" + id++);
        return id;
    }
}
