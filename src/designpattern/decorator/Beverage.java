package designpattern.decorator;

/**
 * 
 * @author Administrator
 * Beverage是一个抽象类，有两个方法cost(),这个是一个抽象的方法
 * 必须在子类中实现
 * getDescription()已经在这里实现了
 * 
 */
public abstract class Beverage {

	String description=" Unknown Beverage";
	public String getDescription(){
		
		return description;
	}
	
	public abstract double cost();
}
