package com.jinshen.www.testcode02;

public class RunnableImpl0012 implements Runnable {
    private int tickets = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            plaiTickets();
        }
    }

    public synchronized  void plaiTickets() {
        if (tickets > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在买第 " + tickets + " 票 ");
            tickets--;
        }
    }
}
