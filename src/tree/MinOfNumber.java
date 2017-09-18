package tree;
/**
 * 
 * @author taojian
 * @time  2017年4月24日下午8:14:42
 * @ClassName MinOfNumber.java
 * @description 7  8 9   3 4 5   8
 */
public class MinOfNumber {
	public static void main(String[] args) { 
		MinOfNumber mon=new MinOfNumber(); 
		  int[] array={7,8,9,10,3,4,5}; 
		  System.out.println(mon.findMinNum(array)); 
		} 
	public Integer findMinNum(int[] array){ 
		  if(array==null){ 
		    return null; 
		  } 
		  int low=0; 
		  int high=array.length-1; 
		    int mid=0; 
		    //第一个数比最后一个数大，直到不比大的时候，跳出循环
		    while(array[low]>=array[high]){ 
		      if(high-low<=1){ 
		        mid=high; 
		        break; 
		      } 
		      mid=(low+high)/2; 
		   //1 1 1 1 0 1 这种情况
		  if(array[low]==array[high]&&array[low]==array[mid]){ 
		        if(array[low+1]!=array[high-1]){
		        	if(array[low+1]<array[high-1])
		        		mid=low+1;
		        	else mid=high-1; 
		          break; 
		        }else{ 
		          low++; 
		          high--; 
		        }}else{ 
		        if(array[mid]>=array[low]) 
		          low=mid; 
		        else { 
		          if(array[mid]<=array[high]) 
		            high=mid;}}} 
		    return array[mid];  
		  }     
		} 

