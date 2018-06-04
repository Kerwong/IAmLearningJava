package com.test.ch21sec2;

public class MyExceptionThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Start");
        throw new RuntimeException("Haha, You cannot catch me");
    }
}
