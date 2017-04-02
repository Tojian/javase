package wanmei;

import java.util.Scanner;

public class WanmeiTest {

	public static void sort(int[] arr) {
		int k = 0;
		int tmp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			k = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[k]) {
					k = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
	}
	private static void solve(int []a,int num){
		sort(a);
		int temp;
		int count=0;
		if(a[0]>num){
			System.out.println("-1");
		}
		for(int i=a.length-1;i>0;i--){
			if(num%a[i]==0){
				count=count+num/a[i];
				System.out.println(count);
				break;
			}
			
			else {
				num=num-(a[i])*(num/a[i]);				
			}	}	
		
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String []str=sc.nextLine().split(",");
		int a[]=new int[str.length];
          for(int i=0;i<a.length;i++){
        	a[i]=Integer.parseInt(str[i]);
          }
        int num = sc.nextInt();  
        solve(a,num);
	}
}
