/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.annocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

    public enum Color {
        BLUE,
        RED,
        GREEN
    }
    Color fruitColor() default Color.GREEN;
}
