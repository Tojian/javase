/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.generic;

/**
 * @description:
 * @author: taojian
 * @create: 2018-05-22 15:52
 **/
public class Simple<T> {

    public void get(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Simple<Integer> simple = new Simple<>();
        simple.get(1);
    }
}
