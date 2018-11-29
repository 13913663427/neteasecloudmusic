package com.example.taojun.neteasecloudmusic;

import java.util.Random;

public class A {

    static int ticketNum = 100;

    public static void main(String[] args) {
        Runnable runnable = new Runable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }


    static class Runable implements Runnable {
        @Override
        public void run() {
            while (true) {
                if (ticketNum <= 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口，票卖光了,当前票数：" + ticketNum);
                    break;
                }
                startSale();
            }
        }
    }


    synchronized static void startSale() {
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticketNum--;
        System.out.println(Thread.currentThread().getName() + "窗口，当前票数：" + ticketNum);
    }


}
