package acmcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月28日下午2:46:16
 * @ClassName Acm01.java
 * @description 对于一个无序数组，数组中元素为互不相同的整数，请返回其中最小的k个数，顺序与原数组中元素顺序一致。
 */
public class Acm01 {	
	public static int[] findKthNumbers(int[] A, int n, int k) {
	    int[] B = Arrays.copyOf(A,A.length);
	    int[] res = new int[k];
	    int i = 0;
	    int max = quickfind(B,0,B.length-1,k-1);
	    for (int x : A) {
	        if (max >= x) {
	            System.out.print(x+" ");
	            res[i] = x;
	            i++;
	        }
	    }
	    return res;
	}

	public static int quickfind(int[] A,int start,int end,int target){
	    int low = start;
	    int high = end;
	    int key = A[low];
	    while(low<high){
	        while(low<high&&key<=A[high]){
	            high--;
	        }
	        A[low] = A[high];
	        while(low<high&&key>=A[low]){
	            low++;
	        }
	        A[high] = A[low];
	    }
	    A[low] = key;
	    
	    if(low>target){
	        return quickfind(A,start,high-1,target);
	    }
	    if (low<target){
	        return quickfind(A,low+1,end,target);
	    }
	    return A[low];
	}

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		findKthNumbers(a,n,k);
	}
}
