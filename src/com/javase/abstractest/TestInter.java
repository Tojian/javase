/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.abstractest;

public interface TestInter {

    //default TestInter();

    default int sum(){
        return 0;
    }
}
