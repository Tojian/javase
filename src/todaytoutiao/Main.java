package todaytoutiao;



import java.util.Scanner;

public class Main {

	
	public static int[] solve(int []a,int b[],int n,int [][]x,int q){
		int [] m=new int[q];
		
		for(int j=0;j<q;j++){
			int count=0;
			for(int i=0;i<a.length;i++){				
			if(a[i]>=x[j][0]&&b[i]>=x[j][1]){
				count++;
			}
			
			}
			
			m[j]=count;
		    }
		
	
		return m;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		int [][]x=new int[q][2];
	
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
	
	  for(int i=0;i<q;i++){
		  for(int j=0;j<2;j++)
		  x[i][j]=sc.nextInt();
		 
	  }
			
			int []m=solve(a,b,n,x,q);
			for(int i=0;i<m.length;i++){
			System.out.println(m[i]);	
			}
	}
	}
	

