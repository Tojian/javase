package offer;
/**
 * 
 * @author taojian
 * @time  2017年3月24日下午2:47:32
 * @ClassName Test01.java
 * @description 在一个二维素组中，每一行按照从左到右递增的顺序排列，每一列都按照从上到下递增的顺序排序，请
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Test01 {
	//这个是正常的思路，但是这样的时间复杂度是O(n*n)
	static boolean isExitNormal(int [][]a,int n,int rows,int columns){
		boolean found=false;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(a[i][j]==n){
					found=true;	
					break;
					}
					
				
			}
		}
		return found;
	}
	
/**
 * @author taojian
 * @time 2017年3月24日下午3:19:48
 * @methodname Test01.java
 * @descripe 时间复杂度O(n)
 */
	static boolean isExit(int [][]a,int n,int rows ,int columns){
		boolean found=false;
		if(rows>0&&columns>0){
			int row=0;
			int colum=columns-1;
			while(row<rows&&colum>=0){
				if(a[row][colum]==n){
					found=true;
					break;
				}else if(a[row][colum]>n)
					--colum;
				else 
					++row;
			}
			
		}
		return found;
	}
	public static void main(String[] args) {
		
		int [][]a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(isExitNormal(a,7,4,4));
		System.out.println(isExit(a,7,4,4));
		
	}
}
