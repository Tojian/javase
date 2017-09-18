package xiecheng;

import java.util.Scanner;

public class Test {

	static int m=1;

	public static void sovle(int n){

	int x,y;
	int a[]=new int[n];
	x=n/2;
	y=n-x;	
	if (n>=x*y) {	
		System.out.println(n);
		m*=n;		
		}
	else {
		sovle(x);
		sovle(y);
		}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		sovle(n);
		System.out.println(m);
	}
	/*main(){
	int n;
	m=1;
	scanf("%d",&n);
	f1(n);
	printf("\n%d",m);
	}*/
}
