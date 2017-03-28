package niuke;

import java.util.Scanner;
/**
 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 */
public class NiuTest10 {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int y1,y2,y3,y4;
	        float a,b,c;
	        while (in.hasNextInt()) {
	            y1 = in.nextInt();
	            y2 = in.nextInt();
	            y3 = in.nextInt();
	            y4 = in.nextInt();
	            a=(y1+y3)/2;
	            b=(y3-y1)/2;
	            c=(y4-y2)/2;
	            if((a-((y1+y3)/2))!=0){
	                System.out.print("No");
	                return ;
	            }
	            if((b-((y3-y1)/2)!=0)||(b!=((y2+y4)/2))){
	                System.out.print("No");
	                return ;
	            }
	            if((c-((y4-y2)/2))!=0){
	                System.out.print("No");
	            return ;
	            }
	            //满足所有的约束条件，输出解。
	            System.out.print((int)a+" "+(int)b+" "+(int)c);
	            }
	    }
	}
