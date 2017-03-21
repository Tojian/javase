package subject01;
/**
 * 
 * @author taojian
 * @time  2017年3月19日下午4:11:22
 * @ClassName NumberComplementTest.java
 * @description 求补码
 */
public class NumberComplementTest {

	
	   public int findComplement(int num) {
		   int i = 0;
	        int j = 0;
	        
	        while (i < num)
	        {
	            i += Math.pow(2, j);
	            j++;
	        }
	        
	        return i - num;
	    
	    }
	   public static void main(String[] args) {
		   NumberComplementTest num=new NumberComplementTest();
		   System.out.println(num.findComplement(4));
	}
	   
}
