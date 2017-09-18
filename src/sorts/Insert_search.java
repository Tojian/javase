package sorts;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年4月3日下午3:12:12
 * @ClassName Insert_search.java
 * @description 插入排序
 */
public class Insert_search {

	public static void insertsort(int []a){
		int i;
		int j;
		int temp;
		for(i=2;i<a.length;i++){
			temp=a[i];
			j=i-1;
			while(j>=1&&temp<a[j]){
				a[j+1]=a[j];
				--j;
			}
			a[j+1]=temp;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int []a={1,5,3,2,4,5,34,13};
	    insertsort(a);
	    for(int i=0;i<a.length;i++){
	    	System.out.println(a[i]);
	    }
	}
}
