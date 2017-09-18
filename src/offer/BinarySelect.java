package offer;

/**
 * 
 * @author taojian
 * @time  2017年4月18日下午4:55:53
 * @ClassName BinarySelect.java
 * @description 二分查找
 */
public class BinarySelect {
/**
 * @author taojian
 * @time 2017年4月18日下午4:57:47
 * @methodname binarySelectTest()
 * @descripe int r[],
 *            int left,int right,int k
 */
	public static int binarySelectTest(int r[],int left,int right,int k){
		
		int mid;
		
		while(left<=right){
			mid=(left+right)/2;
			if(k<r[mid]){
				right=mid-1;
			}else if(k>r[mid])
				left=mid+1;
			else
				return mid;
		}
		return 0;
	}
	public static void main(String[] args) {
		int r[]={1,2,3,4,5,6,7,8,9};
		int k=binarySelectTest(r,0,r.length-1,4);
	    System.out.println(k);
	}
}
