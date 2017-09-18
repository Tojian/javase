package xuexi;

import java.util.Scanner;
/**
 * 
 * @author taojian
 * @time  2017年4月20日上午9:10:23
 * @ClassName Main.java
 * @description 给你这一串有规律的数字串1 12 123 1234 12345 123456 1234567 
 * 12345678   123456789   12345678910    1234567891011    12345678910……，
 *      求出第n个数是多少(从左到右看)，例如第2个是1，第三个是2，第八个是2；（其中1 <=n <= 2^32 -1 )
 */
public class Main {

     

 //求数 n 的位数

 public static int getNumberBit(int n)
 {
  int numberBit = 0;
  while(n != 0)
  {
   n = n/10;
   numberBit++;
  }
  return numberBit;
 }     

  public static int getNum(int i) 

  {     
   int number; 
   int j = 1, basenumber, sum = 1;
   while(i >= sum)
   {
    i -= sum; 
    j++;   
    basenumber = getNumberBit(j); 
    sum += basenumber;     }

  if( i == 0)
   {
    number = (j -1) % 10;
    return number;
   }   sum = 1; 
   basenumber = 1;  
   while( i >= basenumber)  
   {    
	   i= i- basenumber;
      sum++;
      basenumber = getNumberBit(sum); 

   }


   if( i == 0)
   {
    number = (sum -1) % 10;
    return number;
   }       

   j = getNumberBit(sum) - i;

   while( j> 0)   {

    sum /= 10;
     j--;
   }
  number = sum % 10;
  return number;

 }

 

  public  static void main(String[] args)

  {

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println( getNum(i) );

  
  }

 

}

 
