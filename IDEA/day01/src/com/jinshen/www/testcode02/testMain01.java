package com.jinshen.www.testcode02;

public class testMain01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("===========");
    }
}
