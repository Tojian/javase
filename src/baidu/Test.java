package baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年4月27日下午7:22:24
 * @ClassName Test.java
 * @description 求第三个最小的数
 * 
 */
public class Test {

	
	public static int sovle(int a[]){
		Arrays.sort(a);
		int i=0;
		int count=0;
		while(i<=a.length-1){
			if(i==a.length-2&&count==0)break;
			if(a[i]==a[i+1]){
				i++;
			}else{
				count++;
				i++;
			
			}
			if(count==2)
				break;
		}
		return a[i];
	}
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	       int n=in.nextInt();
	      int []a=new int[n];
	      for(int i=0;i<a.length;i++){
	    	  a[i]=in.nextInt();
	      }
	      System.out.println(sovle(a));
	    }
	}

