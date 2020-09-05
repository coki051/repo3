package com.jinshen.www.testcode02;

public class MyThread extends Thread {
    @Override
    public void run() {
//        System.out.println(getName());
        System.out.println(Thread.currentThread().getName());
    }
}
