package sorts;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月31日下午3:18:08
 * @ClassName Binary_search.java
 * @description 二分查找
 */
public class Binary_search {

	public int binary_search(int a[],int len,int number){
		int low=0;
		int high=len-1;
		while(low<=high){
			int middle=(high+low)/2;
			if(a[middle]==number)
				return middle;
			else if(a[middle]>number)
				high=middle-1;
		else
			low=middle+1;
			}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    
	}
}
