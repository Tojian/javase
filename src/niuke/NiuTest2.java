package niuke;

import java.util.Scanner;

/**
 * 
 * @author taojian
 * @time  2017年3月7日下午7:20:36
 * @ClassName NiuTest.java
 * @description  如果一个数字能表示p^q,并且p是一个素数，q为大于1的真整数，就可以称这个数叫做超级素数幂。现在给出一正整数n，如果
 * n是一个超级素数幂需要找到对应的p，q
 * 
 */
public class NiuTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int sum=0;
		int j;
		int temp;
		int min;
		int i;
		for(j=1;j<n;j++){
			temp=j;
		for(i=l;i<n;i++)
		{
			sum=sum+temp;
			temp++;
			if(n==sum){
				System.out.println("ok");
			}
		}
		/*min=i;
		if(min>i){
			min=i;
		}*/
		}
		
		
		
	}
	
}