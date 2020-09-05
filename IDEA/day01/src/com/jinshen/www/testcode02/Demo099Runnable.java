package com.jinshen.www.testcode02;

public class Demo099Runnable {
    public static void main(String[] args) {
        RunnableImpl022 run = new RunnableImpl022();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
