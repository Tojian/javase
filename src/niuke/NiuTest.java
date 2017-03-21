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
public class NiuTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q,p;
		int sum=1;
		for(p=1;p<=n;p=p+2){
			for(int i=2;i<p;i++){
			if(p%i!=0){
			for(q=1;q<n;q++){
				sum=p*sum;
				if(n==sum){
					System.out.println(p+" "+q);
					
				}else{
				//break;}
				
			}			
			}				
		}
		/*	if(n!=sum){
				System.out.println("no");
				}*/
		}
		
		}}}
		
	

