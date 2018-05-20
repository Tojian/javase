/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.init;

/**
 * @description: 构造器的测试
 * @author: taojian
 * @create: 2018-05-19 18:34
 **/
public class ConstuctorTest {

    public  ConstuctorTest(int i){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
      //  ConstuctorTest constuctorTest = new ConstuctorTest();
        ConstuctorTest constuctorTest1 = new ConstuctorTest(1);

    }
}
