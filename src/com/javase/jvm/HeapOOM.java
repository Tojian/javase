/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 堆内存溢出
 * @author: taojian
 * @create: 2018-07-06 10:15
 *
 * 方式：Java堆用于存储对象实例，只要不断的创建对象，并且保证GC roots到对象之间有可达路径来避免垃圾回收机制清除这些对象
 * 那么这个在对象数量达到最大堆的容量限制后就会产生内存溢出异常。
 **/
public class HeapOOM {

    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
