package sorts;
/**
 * 
 * @author taojian
 * @time  2017年4月3日下午3:38:55
 * @ClassName BubbleSort.java
 * @description 排序
 */
public class BubbleSort {

	public static void BubbleSort(int a[]){
		
		int i,j,flag;
		int temp;
		
		for(i=a.length-1;i>=2;--i){
			flag=0;
			for(j=2;j<=i;++j){
				if(a[j-1]>a[j]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				flag=1;
			}
			if(flag==0)
				return ;
		}
	}
	public static void main(String[] args) {
		 int []a={1,5,3,2,4,5,34,13};
		 BubbleSort(a);
		    for(int i=0;i<a.length;i++){
		    	System.out.println(a[i]);
		    }
		  
	}
}
