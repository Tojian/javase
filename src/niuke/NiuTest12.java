package niuke;

import java.util.Scanner;

public class NiuTest12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	 
               int n = sc.nextInt();  
               int k=sc.nextInt();
              int[] arr = new int[n];  
              for (int i = 0; i < n; i++) {  
                  arr[i] = sc.nextInt();  
              } 
		solve(n,arr,k);
		for(int j=0;j<n;j++){
			if(j!=n-1)
			System.out.print(arr[j]+" ");
			else
				System.out.println(arr[j]);
		}
		}

	public static void solve(int n,int []arr,int k){		
		int temp;
		for(int j=0;j<k;j++){
			temp=arr[0];
		for(int i=0;i<=n-1;i++){
			if(i!=(n-1)){
			arr[i]=arr[i]+arr[i+1];
			}else{
				arr[i]=arr[i]+temp;
			}
		}
		
		for(int i=0;i<n;i++){
			if(arr[i]>100){
				arr[i]=arr[i]%100;
			}
		}
		
		}
		
	}
	
}
		
		

