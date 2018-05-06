package com.test.ch21ex1;

/**
 * Test
 *
 * @author wangwenchao02
 * Date: 2018/5/6
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 20; i++) {
            Thread t = new Thread(new MyRunnable(i));
            t.start();
        }
        System.out.println("End");
    }
}
