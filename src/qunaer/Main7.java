package qunaer;

import java.util.Scanner;

public class Main7 {

	//判断一个数是否为2的次方，不能使用任何类库以及内置函数
	public static boolean solve(int a){
		while(a!=0){
			a=a/2;
		}
		if(a==0){
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solve(n));
	}
}
