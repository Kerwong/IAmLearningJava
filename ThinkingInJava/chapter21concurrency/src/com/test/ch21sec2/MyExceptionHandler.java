package com.test.ch21sec2;

public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Catch Exception, from " + t.getName());
        System.out.println("Exception content is " + e.getMessage());
    }
}
