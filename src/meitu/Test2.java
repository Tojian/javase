package meitu;

import java.util.Scanner;

public class Test2 {
	public static boolean findNimNumber(int n){
	 return (n%4>0);  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findNimNumber(n));
	}
}
