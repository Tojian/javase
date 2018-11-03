/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.productandconsumer;

public class TestMain {
    public static void main(String[] args) throws Exception{  
        TestQueue tq=new TestQueue();
        TestProduct tp=new TestProduct(tq);
        TestConsumer tc=new TestConsumer(tq);
        Thread t1=new Thread(tp);  
        Thread t2=new Thread(tc);  
        t1.start();  
        t2.start();  
    }  
}  