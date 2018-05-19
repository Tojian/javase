/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.math;

public class Test {
public static void main(String[] args) {
	String s1="1";
	String s2="2";
	String s3="1";
	String s4="2";
	System.out.println((s1+s2).hashCode());
	System.out.println((s3+s4).hashCode());
	System.out.println((s1+s2)==(s3+s4));
}
}
