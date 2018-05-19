package com.javase.designpattern.strategy;

import java.awt.BufferCapabilities.FlipContents;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
        System.out.println("I am  a real Mallard duck");
	}

}
