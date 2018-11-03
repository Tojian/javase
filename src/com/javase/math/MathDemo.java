/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.math;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		
		/*System.out.println(Math.round(15.5));
		System.out.println(Math.round(-15.5));
		System.out.println(Math.round(-15.51));*/
		 //nextInt() 
		// Returns the next pseudorandom, 
		 //uniformly distributed int value from this random number generator's sequence. 
		Random rand=new Random();
		for(int i=0;i<100;i++){
			System.out.println(rand.nextInt(100));
		}
	}
}
