package offer;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年4月3日下午4:38:34
 * @ClassName FibonacciTest.java
 * @description fibonacci数列
 */
public class FibonacciTest {

	public static long fibonaccisolve(int n){
		
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		return fibonaccisolve(n-1)+fibonaccisolve(n-2);
	}
	
	
public static long fibonacci(int n){
		
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		long fibNMinusOne=1;
		long fibNMinusTwo=0;
		long fibN=0;
		for(int i=2;i<=n;i++){
			fibN=fibNMinusOne+fibNMinusTwo;
			fibNMinusTwo=fibNMinusOne;
			fibNMinusOne=fibN;
		}
		return fibN;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(fibonaccisolve(sc.nextInt()));
		System.out.println(fibonacci(sc.nextInt()));
	}
}
