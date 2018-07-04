/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.annocation;

/**
 * @description:
 * @author: taojian
 * @create: 2018-07-03 21:28
 **/
public class Test {

    @UserCase(description="hello")
    static
    String description ;

    public static void main(String[] args) {
        sum();
    }

    public static void sum(){
        System.out.println(description);
    }
}
