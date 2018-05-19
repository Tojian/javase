package com.javase.designpattern.decorator;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��̬
		Beverage beverage=new Espresso();
		//��Mocha��ȥװ����
		beverage=new Mocha(beverage);
		beverage=new Mocha(beverage);
		
		System.out.println(beverage.getDescription()+" $"+beverage.cost());

	}

}
