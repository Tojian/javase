package niuke;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月25日上午9:56:38
 * @ClassName NiuTest3.java
 * @description
 * 
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
{1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
现在给出一个数字序列，允许使用一种转换操作：
选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。

输入描述:
输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50)
第二行为序列中的n个整数item[i]  (1 ≤ iteam[i] ≤ 1000)，以空格分隔。


输出描述:
输出一个数，表示最少需要的转换次数

输入例子:
4
1 1 1 3

输出例子:
2
 */

/**
 * 
 * 思路：对于数字序列，分别使用两个索引（头索引head和尾索引tail），从两头向中间靠拢，如果head索引处的值较小，
 * 让head索引处的数值不断地与后面的元素相加，直至大于等于tail索引处的数值，然后将得到的和存放在head索引处，
 *  如果tail索引处的值较小，让tail索引处的数值不断地与前面的元素相加，直至大于等于head索引处的数值，然后将得到的和存放在tail索引处
 * ，在加的过程中，加的次数就是合并的次数，如果两个索引处的数值相等，
 * 两个索引同时向中间移动（++head，--tail）。如果head大于等于tail，则回文序列构造成功。
 */
public class NiuTest3 {
	public static void main(String[] args) {  
	       Scanner scan = new Scanner(System.in);  
	             while (scan.hasNext()) {  
	                 int n = scan.nextInt();  
	                int[] arr = new int[n];  
	                for (int i = 0; i < n; i++) {  
	                    arr[i] = scan.nextInt();  
	                }  
	                System.out.println(solve(arr,n));  
	            }  
	            scan.close();  
	      
	    }  
	     private static int solve(int[] arr, int n) {  
	         //定义两个指针，一个指针指向头位置，一个指针指向尾位置
	    	 int left=0;
	    	 
	    	 int right=n-1;
	    	 int count=0;
	    	 while(left<right){
	    		 if(arr[left]<arr[right]){
	    			 arr[left+1]+=arr[left];
	    			 left++;
	    			 count++;
	    		 }else if(arr[left]>arr[right]){
	    			 arr[right-1]+=arr[right];
	    			 right--;
	    			 count++;
	    		 }else{
	    			 left++;
	    			 right--;
	    			 //count++;
	    		 }
	    		 
	    	 }
	    	 
	    	 return count;
         }
	     }
