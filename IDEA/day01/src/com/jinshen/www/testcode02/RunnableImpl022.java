package com.jinshen.www.testcode02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl022 implements  Runnable {
    private  int tickers = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            try {
                Thread.sleep(100);
                if (tickers > 0) {
                    System.out.println(Thread.currentThread().getName() + " 在买第 " + tickers + " 张票 ");
                    tickers--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                l.unlock();
            }

        }

    }
}
