/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.internalclass;

/**
 * @description: 内部类的实践
 * @author: taojian
 * @create: 2018-05-20 09:33
 **/
public class Percel1 {

    class Contens{

      private int i = 10;

      public int value(){
          return  i;

      }
    }

    class Desitination{
        private String label;

        Desitination(String hello){
            label = hello;
        }

        String readLable(){
            return label;
        }
    }


    public void ship(String dest){
        Contens contens = new Contens();
        Desitination desitination = new Desitination(dest);
        System.out.println(desitination.readLable());
    }
}
