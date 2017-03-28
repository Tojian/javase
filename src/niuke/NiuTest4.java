package niuke;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月25日上午10:23:40
 * @ClassName NiuTest4.java
 * @description
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
例如：半径的平方如果为25
优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。 
输入描述:
输入为一个整数，即为圆半径的平方,范围在32位int范围内。


输出描述:
输出为一个整数，即为优雅的点的个数

输入例子:
25

输出例子:
12
 */
public class NiuTest4 {

  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(solve(sc.nextInt()));
	}
	
	private static int solve(int number){
		int count=0;
		
		for(int i=1;i*i<=number;i++){
			int x=i*i;
			int y=(int)Math.sqrt(number-x);
			if(x+y*y==number){
				count++;
			}
		}
		return 4*count;
	}
}  
