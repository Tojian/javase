/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package java.lang;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-09 19:31
 **/
public class Object {

    public static void main(String[] args) {
        ClassLoader loader = Object.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }

    public String toString(){
        return "123";
    }
}
