package chapter21.ex01;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class LiftOff implements Runnable {
    private int cntDown = 10;
    private static int taskCnt = 0;
    private final int id = taskCnt++;

    public LiftOff() {
        System.out.println("#" + id + " Start!");
    }

    public LiftOff(int cntDown) {
        System.out.println("#" + id + " Start!");
        this.cntDown = cntDown;
    }

    @Override
    public void run() {
        while (cntDown-- > 0) {
            System.out.println("#" + id + "(" + (cntDown > 0 ? cntDown : "Liftoff!") + "), ");
            Thread.yield();
        }
    }
}
