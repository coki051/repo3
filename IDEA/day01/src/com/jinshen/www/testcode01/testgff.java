package com.jinshen.www.testcode01;

public class testgff {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("Main :" + i);
        }

    }


}