package meitu;

import java.util.Scanner;

public class Test {
	public static int findSingle(int[] array){  
	    int result = 0;  
	    for(int i = 0 ;i<array.length;i++){  
	        result^=array[i];  
	    }  
	    return result;  
	}  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arrayStr=s.split(",");	
		 
		 int[] array = new int[arrayStr.length];
		 for (int i = 0; i <arrayStr.length; i++)
		 {
			 array[i] = Integer.parseInt((arrayStr[i]));
		 }
		System.out.println(findSingle(array));
	}
}
