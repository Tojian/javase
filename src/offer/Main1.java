package offer;

import java.util.Scanner;

public class Main1 {

	public static char[] change(String s){
		char []ss=s.toCharArray();
		for(int i=0;i<ss.length;i++){
			ss[i]-=49;
		}
		return ss;
	}
	
	public static void print(String s){
		int sum=0;
		int count=0;
		char[]ss=change(s);
		for(int i=ss.length-1;i>=0;i--){
			sum+=(ss[i]-48)*(Math.pow(26,count));
			count++;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			print(str);
		}
	}
}
