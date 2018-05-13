package com.test.ch21sec2;

import java.util.concurrent.TimeUnit;

public class Daemons {

    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();

        d.join();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ". ");
        TimeUnit.SECONDS.sleep(1);
    }
}
