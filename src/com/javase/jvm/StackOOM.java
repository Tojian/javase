/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.jvm;

/**
 * @description: 栈内粗溢出
 * @author: taojian
 * @create: 2018-07-06 10:48
 **/
public class StackOOM {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();

    }

    public static void main(String[] args) {
        StackOOM stackOOM = new StackOOM();

        try {
            stackOOM.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length : "+ stackOOM.stackLength);
           throw  e;
        }

    }
}
