package com.jinshen.www.testcode01;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("myThread : " + i);
        }
    }
}
