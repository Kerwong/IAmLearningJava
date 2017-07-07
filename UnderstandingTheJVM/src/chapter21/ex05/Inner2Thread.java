package chapter21.ex05;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class Inner2Thread {
    private Thread inner;

    public Inner2Thread(String name) {
        this.inner = new Thread(name) {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public String toString() {
                return "$classname{}";
            }
        };

        inner.start();
    }
}
