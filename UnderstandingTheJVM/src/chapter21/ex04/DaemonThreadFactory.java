package chapter21.ex04;

import java.util.concurrent.ThreadFactory;

/**
 * Created by wangwenchao02 on 2017/7/5.
 */
public class DaemonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
