package com.test.ch21sec2;

public class TestJoin {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2(5));
        t.start();
    }
}
