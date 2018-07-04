/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.abstractest;

/**
 * @description:
 * @author: taojian
 * @create: 2018-06-26 20:40
 *
 * 总结：
 *  1。抽象类单继承
 *  2。抽象子类继承抽象父类不需要实现父类的抽象方法
 *  3。具体子类继承必须要实现抽象父lei的抽象方法
 *  4。抽象类可以有具体实现的方法
 **/
public class ImpleTest extends AbstractChildTest {

    ImpleTest(){
        System.out.println("ImpleTest===========");
    }
    @Override
    public void hello() {

    }

    @Override
    public void helloworld() {

    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    int add() {
        return 0;
    }

    public static void main(String[] args) {
        ImpleTest impleTest = new ImpleTest();
    }
}
