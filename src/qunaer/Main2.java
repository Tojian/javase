package qunaer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月31日下午5:17:21
 * @ClassName Main2.java
 * @description
 * 给定一个数字，获取大于此数字的下一个数字X， 要求 X 为对称数字

								
输入
随机输入的自然数n
样例输入
451
3840
3363
999
输出
对于每个测试实例，要求输出大于n的下一个对称数字
样例输出
454
3883
3443
1001
 */
public class Main2 {

   public static int numberDuichen(int n){
	   int k=n+1;
	   while(!isDuichen(k)){
	   
		   k++;
		   
	   }
	   return k;
   }
   
   public static boolean isDuichen(int n){
	   int y,i=0;
	   List<Integer> list=new ArrayList<>();
	  
	   while(n>0){
	    list.add(n%10);
	    n=n/10;
	   }
	   int left=0;
	   int right=list.size()-1;
	   while(left<right){
		   if(list.get(left)==list.get(right)){
			   left++;
			   right--;
		   }else{
			   return false;
		   }
	   }
	   return true;
	  
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(numberDuichen(sc.nextInt()));
			}
	}
}
