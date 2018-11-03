/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.jvm;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-04 23:33
 **/
public class ClassLoaderTree {

    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}
