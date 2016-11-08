package designpattern.decorator;
/**
 * 
 * @author Administrator
 *HouseBlend也是需要扩展Beverage,就是另一种饮料
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {

		description="House Blend Coffee";
	
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
