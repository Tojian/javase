package acmcoder;

import java.util.Scanner;

public class Acm02 {

	private static void solve(int []a,int n){
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++){
			count=count+a[i];
		}
		
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		solve(a,n);
	}
}
