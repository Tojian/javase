import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   Quick quick=new Quick();
	   int array[]=new int[10];
	   int i;
	  Scanner in =new Scanner(System.in);
	  for(i=0;i<array.length;i++) {
		 array[i]=in.nextInt();
		}
	  for(int element : array )
		System.out.print("\t"+element);
        quick.QuickSort(array, 1, array.length);
        for(int element : array )
    		System.out.print("\t"+element);
		}
	}


