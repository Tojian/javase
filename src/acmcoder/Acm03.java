package acmcoder;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月28日下午3:48:03
 * @ClassName Acm03.java
 * @description 数学中有很多奇特的现象，
 * 孪生质数就是一种(孪生素数就是指相差2的质数对，例如3和5，5和7，11和13…)，
 * 现在要求输出所有在m和n范围内的孪生质数。
 */
public class Acm03 {
	
	private static void solve(int n,int m){
		
		int []a=new int[m-n];
		int []b=new int[m-n];
		int k=0;
		int h=0;
		for(int i=n;i<=m;i++){
			for(int j=2;j<i;j++){
			if(i%j==0){
				break;
			}else if(j == i-1){		
				a[k]=i;
		     	k++;
			}		
			}			
		}
		for(int j=0;j<k;j++){
		if(a[j+1]-a[j]==2){
			b[h]=a[j];
			System.out.print(b[h]+" ");
			h++;
			b[h]=a[j+1];
			System.out.print(b[h]+" ");
			h++;
			
		}
		}

			 if(h==0){
				System.out.println("no");
			}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		solve(n,m);
	}
}
