package offer;

import java.util.Scanner;

//用英文字母a-z来分别表示数值0-25, 形成一个26进制的数值表示法。需要你写一个方法，将用a-z表示的26进制数值的字符串，转化为对应的10进制数值。
public class Test10 {

	public static int charLetterSwitchToNum(String str){
		char[] charLetter=str.toCharArray();
		
		int number=0;
		int temp=1;
		int count=1;
		int num=charLetter.length;		
		number=number+charRespresentNum(charLetter[num-1]);
		if(num>=2){
			
			for(int i=num-1;i>0;i--)
			{
				
				temp=1;
				for(int j=0;j<i;j++){
					temp*=26;
				}
				number+=(temp*(charRespresentNum(charLetter[num-i-1]))+count);
				count=0;
			}
			return number-1;
		}

		return number;
	}
	
	private static int charRespresentNum(char ch){
		switch(ch){
		case 'a':
		return 0;
		case 'b':
			return 1;
		case 'c':
			return 2;
		case 'd':
			return 3;			
		case 'e':
			return 4;
		case 'f':
			return 5;
		case 'g':
			return 6;
		case 'h':
			return 7;
		case 'i':
			return 8;
		case 'j':
			return 9;
		case 'k':
			return 10;
		case 'l':
			return 11;
		case 'm':
			return 12;
		case 'n':
			return 13;
		case 'o':
			return 14;
		case 'p':
			return 15;
		case 'q':
			return 16;
		case 'r':
			return 17;
		case 's':
			return 18;
		case 't':
			return 19;
		case 'u':
			return 20;
		case 'v':
			return 21;
		case 'w':
			return 22;
		case 'x':
			return 23;
		case 'y':
			return 24;
		case 'z':
			return 25;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
	    String str=sc.nextLine(); 
	    System.out.println(charLetterSwitchToNum(str));
	    }
	    
	}
}
