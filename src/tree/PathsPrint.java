package tree;
/**
 * 
 * @author taojian
 * @time  2017年4月24日下午7:20:36
 * @ClassName PathsPrint.java
 * @description M*N矩阵,从左上角走到右下角,每次一步,只能向右或向下,打印出所有可行的路径完成,
 */
public class PathsPrint {	
	    public static void lujing(int m,int n,int[] result){
	        if(m==0&&n==0){
	            Print(result);
	            return;}
	        if(m>0){
	            result[m+n-1] = 0;
	            lujing(m-1,n,result);
	        }
	        if(n>0) {
	            result[m+n-1] = 1;
	            lujing(m, n - 1, result);
	        }
	    }
	    public static void Print(int[] result){
	        int countx = 0;
	        int county = 0;
	        System.out.println("我是分割线");
	        for (int i = 0; i <result.length ; i++) {
	            if(result[i] == 0){
	                countx++;
	            }else{
	                county++;
	            }
	            System.out.println(countx + " "+county + ";");
	        }
	    }

	    public static void main(String[] args) {
	        int m = 2;
	        int n = 2;
	        int[] result = new int[m+n];
	        lujing(m,n,result);
	    }
	}


