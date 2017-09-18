package tree;
/**
 * 
 * @author taojian
 * @time  2017年4月23日下午7:43:44
 * @ClassName PrintMatrixClockwisely.java
 * @description 从外到里打印矩阵
  */
public class PrintMatrixClockwisely {

	
	//先打印
	
	public void printMatrixClock(int [][]numbers,int columns,int rows){
		if(numbers==null || columns<=0||rows<=0)
			return ;
		int start=0;
		
		while(columns>start*2&&rows>start*2){
			printMatrixInCircle(numbers,columns,rows,start);
			start++;
		}
	}
	public  void printMatrixInCircle(int[][] numbers, int columns, int rows, int start) {
         //列
		int endx=columns-1-start;
		//行
		int endy=rows-1-start;
		//第一行肯定会打印的
		
		for(int i=start;i<=endx;i++){
			int number =numbers[start][i];
			System.out.println(number);
		}
		//从上到下打印
		if(start<endy){
		
			for(int i=start+1;i<=endy;i++){
				int number =numbers[i][endx];
				System.out.println(number);
			}
			
		}
		//从右到左打印
		if(start<endx&&start<endy){
			for(int i=endx-1;i>=start;i--){
				int number =numbers[endy][i];
				System.out.println(number);
			}
		}
		//从下到上打印
		
		if(start<endx&&start<endy-1){
			for(int i=endy-1;i>start+1;--i){
				int number =numbers[i][start];
				System.out.println(number);
			}
			
			
		}
	}
	public static void main(String[] args) {
		int[][] array={ 
			    {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		PrintMatrixClockwisely testCircle=new PrintMatrixClockwisely(); 
			testCircle.printMatrixClock(array, 4, 4); 
	}
}
