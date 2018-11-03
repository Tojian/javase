/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.math;

import java.math.BigDecimal;

public class Big {

	public static void main(String[] args) {
	/*	//System.out.println(Double.MAX_VALUE*Double.MAX_VALUE);
		BigInteger bigA=new BigInteger("23498343434242");
		BigInteger bigB=new BigInteger("234923238343434242");
		System.out.println(bigA.add(bigB));
		System.out.println(bigA.subtract(bigB));
		System.out.println(bigA.multiply(bigB));
		System.out.println(bigA.divide(bigB));
		//数组里面只有两个元素：第一个元素表示的是商，第二个元素表示的是余数
		BigInteger result[]=bigA.divideAndRemainder(bigB);
		System.out.println("商："+result[0]+", 余数： "+result[1]);*/
		
		System.out.println(MyMath.round(13834.345342313, 2));
		System.out.println(MyMath.round(-15.5, 0));
		System.out.println(MyMath.round(15.5, 0));
		System.out.println(MyMath.round(-15.51, 0));
	}
}

class MyMath{
	public static double round(double num,int i) {
		// TODO Auto-generated method stub
       BigDecimal biga=new BigDecimal(num);
       BigDecimal bigb=new BigDecimal(1);
       return biga.divide(bigb, i, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}