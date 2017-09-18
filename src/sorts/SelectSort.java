package sorts;
/**
 * 
 * @author taojian
 * @time  2017年4月3日下午4:06:58
 * @ClassName SelectSort.java
 * @description 选择排序
 */
public class SelectSort {
	public static void main(String[] args) {
		int []a={1,5,3,2,4,5,34,13};
		selectSort(a);
		    for(int i=0;i<a.length;i++){
		    	System.out.println(a[i]);
		    }
	}
	public static void selectSort(int []a){
	int i;
	int j;
	int k;
	int temp;
	for(i=1;i<=a.length;++i){
		
		k=i;
		for(j=i+1;j<=a.length;++j){
			if(a[k]>a[j]){
				k=j;
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
	}
	}
}
