package qunaer;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			while (true) {
              n++;
				if (isPre(n)) {
					System.out.println(n);
					break;
				}
				
			}
		}
	}

	public static boolean isPre(int n) {
		int res = 0;
		int temp = n;
		while (n != 0) {
			res = res * 10 + n % 10;
			n /= 10;
		}

		return res == temp;

	}
}