package chapter21.ex05;

/**
 * Created by wangwenchao02 on 2017/7/6.
 */
public class InnerThread {
    private Inner inner;

    public InnerThread(String name) {
        this.inner = new Inner(name);
    }

    private class Inner extends Thread {
        public Inner(String name) {
            super(name);

        }

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "Inner{}";
        }
    }
}
