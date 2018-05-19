package com.javase.designpattern.strategy;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
       System.out.println("Squack");
	}

}
