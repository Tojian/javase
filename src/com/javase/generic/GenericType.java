/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.generic;

import java.util.ArrayList;

/**
 * @description: 类型参数
 * @author: taojian
 * @create: 2018-05-22 16:29
 **/
public class GenericType {
    /**
     *在这个例子中，我们定义了两个ArrayList数组，不过一个是ArrayList<String>泛型类型，只能存储字符串。一个是ArrayList<Integer
     * >泛型类型，只能存储整型。最后，我们通过arrayString对象和arrayInteger对象的getClass方法获取它们的类信息并比较，发现结果为true。
     *
     * 这是为什么呢，明明我们定义了两种不同的类型？因为，在编译期间，所有的泛型信息都会被擦除，
     * List<Integer>和List<String>类型，在编译后都会变成List类型（原始类型）。Java
     * 中的泛型基本上都是在编译器这个层次来实现的，这也是Java的泛型被称为“伪泛型”的原因
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> arrayString=new ArrayList<String>();
        ArrayList<Integer> arrayInteger=new ArrayList<Integer>();
        System.out.println(arrayString.getClass()==arrayInteger.getClass());
    }
}
