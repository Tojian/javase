/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.math;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random rand=new Random();
		int []data=new int[7];
		int foot=0;
		while(foot<7){
			int t=rand.nextInt(37);
			if(!isRepeat(data,t)){
			    data[foot++]=t;
				}
			
		}
		for(int x=0;x<data.length;x++)
			System.out.println(data[x]+"" );
	}
	
	public static boolean isRepeat(int temp[],int num){
		if(num==0)
			return true;
		
		for(int x=0;x<temp.length;x++){
			if(temp[x]==num){
				return true;
			}
		}
		return false;
	}
}
