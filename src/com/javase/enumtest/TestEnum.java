/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.enumtest;

/**
 * @description: 测试枚举
 * @author: taojian
 * @create: 2018-05-19 19:07
 **/
public class TestEnum {

    public static void main(String[] args) {
        Test test = Test.HELLO;
        System.out.println(test);
        for (Test test1 : Test.values()){
            System.out.println(  test1 + ", ordinal" + test1.ordinal());
        }
    }
}
