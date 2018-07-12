/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.thread;

/**
 * @description:
 * @author: taojian
 * @create: 2018-07-12 16:37
 **/
public class InterruptExample {
    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        thread1.start();
        thread1.interrupt();
        System.out.println("Main run");
    }
}
