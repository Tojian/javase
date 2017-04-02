package offer;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月31日下午4:37:09
 * @ClassName Test09.java
 * @description 二进制中1的个数
 */
public class Test09 {

	   public static int NumberOf1(int n) {  
	        int count = 0;  
	        while(n!= 0){  
	            count++;  
	            n = n & (n - 1);  
	         }  
	        return count;  
	    }  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(NumberOf1(n));
	}
}
