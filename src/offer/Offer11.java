package offer;
/**
 * 
 * @author taojian
 * @time  2017年4月3日下午4:51:02
 * @ClassName Offer11.java
 * @description 数值整数次方
 */
public class Offer11 {
	
	public double powerWithUnsignedExponent(double base,int exponent)
	{
		if(exponent==0)
			return 1;
		if(exponent==1)
			return base;
		double result=powerWithUnsignedExponent(base, exponent>>1);
		result*=result;
		//exponent& 0x1判断奇数或者偶数
		if((exponent& 0x1)==1){
			result*=base;
		}
		return base;
	}	
	public static void main(String[] args) {
		
	}

}
