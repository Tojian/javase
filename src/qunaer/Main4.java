package qunaer;

import java.util.*;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> set1 = new HashSet<>();
		for (int i = 0; i < s1.length(); i++)
			set.add(s1.charAt(i));
		for (int i = 0; i < s2.length(); i++)
			set1.add(s2.charAt(i));
		int i = 0;
		System.out.println(set.size()+" "+set1.size());
		if (set1.size() != set.size()) {
			System.out.println(false);
			return;
		}
		for (Character c : set1) {
			i++;

			if (!set.contains(c))
				break;
			else
				set.remove(Character.valueOf(c));

		}
		System.out.println(i == set1.size() && set.isEmpty());
	}
}