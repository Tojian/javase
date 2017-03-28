package niuke;

import java.util.Scanner;

public class NiuTest11 {
	public static void main(String[] args) {  
	       Scanner scan = new Scanner(System.in);  
	      
	        String n = scan.nextLine();  
	                  
	        char []arr=n.toCharArray();
	        System.out.println(solve(arr,arr.length));
	       
	    }  
	     private static int solve(char[] arr, int n) {  
	         //定义两个指针，一个指针指向头位置，一个指针指向尾位置
	    	 int left=0;
	    	 char temp;
	    	 int right=n-1;
	    	 int count=0;
	    	 while(left<=right){
	    		
	    		 if(arr[left]==arr[right]){
	    			 right--;
	    		 }else{
	    			 temp=arr[right];
	    			 arr[right]=arr[right-1];
	    			 arr[right-1]=temp;
	    			 left++;
	    			 count++;
	  	    		 }
	    		 
	    	 }
	    	 
	    	 return count;
      }
}
