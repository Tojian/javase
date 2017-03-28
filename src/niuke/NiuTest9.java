package niuke;

import java.util.Scanner;
/**
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 *  可是小易现在只想购买恰好n个苹果，
 *  小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。 
 */
public class NiuTest9 {

	    public static void main(String[] arg) {
	        Scanner scan = new Scanner(System.in);
	        while (scan.hasNext()) {
	            int n = scan.nextInt();
	            System.out.println(solve(n));
	        }
	        scan.close();
	    }


	    private static int solve(int n) {
	        int ans = 0;
	        while (n >= 6) {
	            if (n % 8 == 0) {
	                ans += (n >> 3);
	                n = 0;
	            }else {
	                n -= 6;
	                ++ans;
	            }
	        }
	        return n == 0 ? ans : -1;
	    }

	}
