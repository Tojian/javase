package com.javase.designpattern.strategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
	   
       System.out.println("I am flying");		
	}
}
