package todaytoutiao;

import java.util.Scanner;

public class Main2 {

	
	public static void solve(int []a,int n){
		int []b=new int[n];
		int max=b[1]-b[0];
		int num[]=new int[2];
		int k=1;
		int x=0;
		
			for(int i=k;i<a.length-1;i++){
			if((a[i]<a[i+1])&&(a[i]<a[i-1])){
				b[x]=i;
				k=i+1;
		        x++;
	
			}
		}
		
		
		for(int j=1;j<b.length;j++){
			if(b[j]!=0){
				if(b[j]-b[j-1]>max){
					max=b[j]-b[j-1];
					num[0]=b[j-1];
					num[1]=b[j];
					
				}
			}
			
		}
		for(int i=0;i<2;i++){
			System.out.print(num[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		solve(a,n);
	}
}
