package chapter21.ex01;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class Main {

    public static void main(String[] args) {
//        LiftOff lf = new LiftOff(20);
//        lf.run();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff(5));
            t.start();
        }
    }
}
