package jd;

import java.util.Scanner;

public class Test {

   private static String solve(String a,String b){
	   StringBuffer c=new StringBuffer();
	   for(int i=0;i<a.length();i++){
		   if(a.charAt(i)==b.charAt(i)){
			   c.append("0");
		   }else{
			   c.append("1");
		   }
	   }

	   return c.toString();
   }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
        int n=sc.nextInt();
        String a =sc.next();
        String b=sc.next();
        System.out.println(Integer.parseInt(solve(a,b),2));
        
     }
 }
