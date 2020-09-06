package com.jinshen.www.testcode02;

public class RunnableImpl02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("你好呀!" + i);
        }
    }
}
