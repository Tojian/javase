package jd;

import java.util.Scanner;

public class Test1 {

	
	private static String sovle(double a[],int n){
		
		double temp=0.6*n;
		int tempre=(int) temp;
		if(temp-tempre>0){
			tempre=tempre+1;
		}
		long sum=0;
		double count=1;
		for(int i=tempre;i<=n;i++){
			sum=sum+C(n,i);
		}
		
		for(int i=0;i<a.length;i++){
			count=count*(a[i]/100.0);
		}
	
		String result = String.format("%.5f", sum*count);
		return result;
	}
	
	static long C(int m,int n){
		n=n<m-n?n:m-n;
		long a=1;
		for(int i=1;i<=n;i++)
		a=a*m--/i; 
		return  a;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    int n=sc.nextInt();
	    
	    double a[]=new double[n];
	    
	    for(int i=0;i<n;i++){
	    	a[i]=sc.nextDouble();
	    }
	    System.out.println(sovle(a,n));
	}
}
