package chapter21.ex03;

import chapter21.ex01.LiftOff;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class Main {

    public static void main(String[] args) {
//        LiftOff lf = new LiftOff(20);
//        lf.run();

        for (int i = 1; i < 4; i++) {
            Thread t = new Thread(new MyThead(i, 5));
            t.start();
        }
    }
}
