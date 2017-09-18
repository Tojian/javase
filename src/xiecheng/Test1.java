package xiecheng;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sovle(n);
	}

	public static void sovle(int n){
		int a[] = new int[n];
		int count = 1;
		int sum = 0;
		int l = 0;
		int left = 0;
		for (int i = 2; i <= n; i++) {
			a[l++] = i;
			sum += i;
			if (sum > n) {
				sum -= i;
				l--;
				left = n - sum;
				break;
			}
		}
		for (int i = l - 1; left == 1; left--) {
			a[i]++;
			i--;
			if (i < 0)
				i = l - 1;
		}

		for (int i = 0; i < l - 1; i++) {
			count = count * a[i];
		}
		System.out.println(count * a[l - 1]);

	}

	}




