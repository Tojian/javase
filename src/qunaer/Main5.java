package qunaer;

import java.util.HashSet;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		
		HashSet<Character> set=new HashSet<>();
		HashSet<Character> set1=new HashSet<>();
		
		for(int i=0;i<s1.length();i++)
			set.add(s1.charAt(i));
		for(int i=0;i<s2.length();i++)
			set.add(s2.charAt(i));
		int i=0;
		if(set1.size()!=set.size())
			System.out.println(false);
	}
}
