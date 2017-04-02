package wanmei;

import java.util.Scanner;

public class Mian {

	public static int solve(int n,int[] a,int [] b,int maxnumber){
		
		int c[][]=new int[n+1][maxnumber+1];
		for(int i=0;i<n+1;i++)
			c[i][0]=0;
		for(int j=0;j<maxnumber+1;j++)
			c[0][j]=0;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<maxnumber+1;j++){
				if(b[i-1]<=j){
				if(c[i-1][j]<(c[i-1][j-b[i-1]]+a[i-1]))
					c[i][j]=c[i-1][j-b[i-1]]+a[i-1];
				else c[i][j]=c[i-1][j];
				}
				else c[i][j]=c[i-1][j];
				}
			}
		
       return c[n][maxnumber];}
	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		
		int []a=new int[n];
		int []b=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
			
		}
		int maxnumber=sc.nextInt();
		System.out.println(solve(n,a,b,maxnumber));
	}
}
