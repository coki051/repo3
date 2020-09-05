package com.jinshen.www.testcode02;

public class Demo01Runnable {
    public static void main(String[] args) {
        RunableImpl r = new RunableImpl();
        Thread thread = new Thread(r);
        thread.start();



        for (int i = 0; i < 20; i++) {
            System.out.println( Thread.currentThread().getName() + " ---> " + i);
        }
        new Thread(new RunnableImpl02()).start();
    }
}
