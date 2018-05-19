package com.javase.designpattern.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	public  void performQuack() {
	 	// TODO Auto-generated method stub
         quackBehavior.quack();
	}
	public void swim() {
		// TODO Auto-generated method stub
        System.out.println("All ducks float");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
