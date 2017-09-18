package tecent;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年4月2日下午9:39:13
 * @ClassName Test.java
 * @description 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
 * 输出需要删除的字符个数。
 */
public class Test {

	public static void solve(char[]a){
		
		int left=0;
		int right=a.length-1;
		while(left<right){
			if(a[left]==a[right]){
				left++;
				right--;
			}else{
				
			}
		}
	}
	public static boolean isHuiwen(char []a){
		int left=0;
		int right=a.length-1;
		while(left<right){
			if(a[left]==a[right]){
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
		String str=sc.nextLine();
		char[]a=str.toCharArray();
		System.out.println(isHuiwen(a));
	}
}
