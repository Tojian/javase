package com.javase.control.demob;

import com.javase.control.demoa.A;

public class B  extends A{//是A不同包的子类

	public void print(){
	System.out.println("A类的info="+super.info);
	}
}
