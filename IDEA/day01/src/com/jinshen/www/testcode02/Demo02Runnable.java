package com.jinshen.www.testcode02;

public class Demo02Runnable {
    public static void main(String[] args) {
        new Thread(new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() +  "  --> " + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("加油!" + i);
                }
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("你好!");
        }

    }
}
