/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.productandconsumer;

public class TestProduct implements Runnable {
    
    TestQueue obj;
      
    public TestProduct(TestQueue tq){
        this.obj=tq;  
    }  
      
    public void run() {  
        for(int i=0;i<10;i++){  
            try {  
                obj.product("test"+i);  
            } catch (Exception e) {               
                e.printStackTrace();  
            }  
        }  
    }  
  
}  
