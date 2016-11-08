package designpattern.decorator;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //多态
		Beverage beverage=new Espresso();
		//用Mocha类去装饰它
		beverage=new Mocha(beverage);
		beverage=new Mocha(beverage);
		
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		
	}

}
