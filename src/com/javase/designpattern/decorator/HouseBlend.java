package com.javase.designpattern.decorator;
/**
 * 
 * @author Administrator
 *HouseBlendҲ����Ҫ��չBeverage,������һ������
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
