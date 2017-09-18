package xuexi;

import java.util.Scanner;

public class Test {
	
	    public static int[] countBits(int num) {
	    	int []array=new int[num+1];
	    	  int j=0;
	    	  //任何数都有0,0的二进制1含0
	      array[0]=0;
	    	for(int i=1;i<=num;i++){
	    		j=i&(i-1);
	    		array[i]=array[j]+1;
	    	}
	    	return array;
	    }
	    //判断一个数有几个1，反复和比他小1的数进行与比较
	    
	    public static int numberHaveOne(int n){
	    	int count=0;
	    	
	    	while(n!=0){
	    		count++;
	    		n=(n-1)&n;
	    	}
	    	return count;
	    }
	    
	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int num=sc.nextInt();
			int []array=countBits(num);
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
		}
	}

