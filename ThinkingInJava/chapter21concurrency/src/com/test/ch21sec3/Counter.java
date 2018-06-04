package com.test.ch21sec3;

public class Counter {

    private Integer lock = 0;
    private Integer unlocked = 0;
    private Integer num;

    public void add() {
        synchronized (lock) {
            lock++;
            unlocked++;
            print();
        }
    }

    public void mul() {
        unlocked = unlocked * 2;
        print();
    }

    public void min() {
        synchronized (num) {
            num--;
            print();
        }
    }

    private void print() {
        System.out.println("ThreadName: " + Thread.currentThread().getName() + " counter: " + num);
    }
}