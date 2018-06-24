/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: taojian
 * @create: 2018-06-24 13:51
 **/
public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/taojian");
       // listAllFiles(file);
        copyFile();


    }
    public static void listAllFiles(File dir) {
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    /**
     * 复制
     * @throws IOException
     */
    public static void copyFile() throws IOException {
        FileInputStream in = new FileInputStream("/Users/taojian/Downloads/1.txt");
        FileOutputStream out = new FileOutputStream("/Users/taojian/Downloads/2.txt");
        byte[] buffer = new byte[20 * 1024];
        // read() 最多读取 buffer.length 个字节，返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while (in.read(buffer, 0, buffer.length) != -1) {
            out.write(buffer);
        }
        in.close();
        out.close();
    }
}
