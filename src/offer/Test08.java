package offer;
/**
 * 
 * @author taojian
 * @time  2017年3月31日下午2:58:25
 * @ClassName Test08.java
 * @description
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转，输入一个递增的排序的数组的一个旋转，输出旋转数组的最小元素
 * 
 */
public class Test08 {

	public int minNumberIn(int []array){
		if(array==null||array.length==0)
			return 0;
		int p1=0;
		int p2=array.length+1;
		int min=array[p1];
		int mid=0;
		while(array[p1]>=array[p2]){
			if(p2-p1==1){
				min=array[p2];
				break;
			}
			mid=(p1+p2)/2;
		    //如果中间位置的数既等于p1位置的数又等于P2位置的数  
	           if(array[p1] == array[mid]&&array[p2]==array[mid])  
	           {  
	              min = minInorder(array,p1,p2);  
	           }  
	         if(array[p1] <= array[mid])//若中间位置的数位于数组1，让p1走到mid的位置  
	         {  
	             p1 = mid;  
	         }  
	         else if(array[p2] >= array[mid])//若中间位置的数位于数组2，让p2走到mid的位置  
	         {  
	             p2 = mid;  
	         }  
	       }  
	       return min;  
		}
	
  private int minInorder(int[]array,int p1,int p2)  
  {  
    int min = array[p1];  
    for (int i = p1 + 1; i <= p2; i++)  
  {  
     if(min > array[i])  
     {  
         min = array[i];  
     }  
  }  
    return min;  
}  
}
