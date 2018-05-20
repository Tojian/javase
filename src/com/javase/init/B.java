/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.init;

/**
 * @description: b
 * @author: taojian
 * @create: 2018-05-19 19:22
 **/
public class B extends A {
// 继承无法继承私有的方法
    public static void main(String[] args) {
        B b = new B();
        b.setName("aaaa");
        System.out.println(b.getName());
    }
}
