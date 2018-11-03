/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.string;

/**
 * @description: 字符串的操作
 * @author: taojian
 * @create: 2018-05-20 10:18
 **/
public class StringDemo {
    /**
     * 字符串String是不可变的，每一个看起来会修改String的类型的，实际上是创建了一个新的String对象
     *
     * @param args
     */
    public static void main(String[] args) {
        String a = "aaaaa";
        System.out.println(a);
        String b = StringDemo.upCase(a);
        System.out.println(b);
    }

    public static String upCase(String s) {
        return s.toUpperCase();

    }
}
