package com.jinshen.www.testcode02;

public class Demo001Ticket {
    public static void main(String[] args) {
        RunnableImpl0012 run = new RunnableImpl0012();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
