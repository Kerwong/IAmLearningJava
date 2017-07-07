package chapter21.ex03;

import java.util.Random;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class MyThead implements Runnable {
    private int id;
    private int cnt;

    public MyThead() {
    }

    public MyThead(int id) {
        this.id = id;
    }

    public MyThead(int id, int cnt) {
        this.id = id;
        this.cnt = cnt;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(id);
        while (cnt-- > 0) {
            try {
                int rm = new Random(System.currentTimeMillis()).nextInt(1000);
                System.out.println("#" + id + " " + rm + "(" + (cnt > 0 ? cnt : "Finished!") + "), ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
