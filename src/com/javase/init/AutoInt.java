/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.init;

/**
 * @description: 对运算符号的测试
 * @author: taojian
 * @create: 2018-05-19 18:05
 **/
public class AutoInt {

    public static void main(String[] args) {
        int  i = 0;
// 先获值，再进行运算
        System.out.println(i++);
        i = 0;
        // 反之
        System.out.println(++i);
    }
}
