package subject01;

/**
 * 
 * @author taojian
 * @time  2017年3月19日下午3:02:22
 * @ClassName HammingDistanceTest.java
 * @description
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
       二进制不同的位数
 */
public class HammingDistanceTest {
	

	 public static int  hammingDistance(int x, int y) {
		
		  int xor = x ^ y, count = 0;
		  System.out.println(xor);
		    for (int i=0;i<32;i++) count += (xor >> i) & 1;
		    return count;
	    }
	 public static void main(String[] args) {
		System.out.println( hammingDistance(45, 33));
	}
}
