/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.productandconsumer;

public class TestConsumer implements Runnable {
    
    TestQueue obj;
      
    public TestConsumer(TestQueue tq){
        this.obj=tq;  
    }  
  
    public void run() {               
        try {  
            for(int i=0;i<10;i++){  
                obj.consumer();  
            }             
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  