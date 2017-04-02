package qunaer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月30日下午3:52:35
 * @ClassName Main.java
 * @description
 * 给定两个均由大写英文字母组成的字符串（A-Z），检查这两个字符串是否仅包含相同的字母
 */
public class Main {

    public static boolean solve(char []a,char[]b){
    	
    	int i=0;
    	int j=0;
    	int count=0;
    	if(a.length>b.length)
    		return false;
       while(i<a.length&&j<b.length){
    	   if(a[i]!=a[j]){
    		   j++;
    		   
    	   }else{
    		   i++;
    		   count++;
    		   j=0;
    	   }
       }
       if(count==i){
    	   return true;
       }else 
    	   return false;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[]a=sc.nextLine().toCharArray();
        char[]b=sc.nextLine().toCharArray();
        System.out.println(solve(b,a));
	
	}
}
