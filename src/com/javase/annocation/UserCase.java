/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.annocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserCase {


    public String description() default "no description";
}
