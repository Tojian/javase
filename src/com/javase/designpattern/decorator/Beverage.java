package com.javase.designpattern.decorator;

/**
 * 
 * @author Administrator
 * Beverage��һ�������࣬����������cost(),�����һ������ķ���
 * ������������ʵ��
 * getDescription()�Ѿ�������ʵ����
 * 
 */
public abstract class Beverage {

	String description=" Unknown Beverage";
	public String getDescription(){
		
		return description;
	}
	
	public abstract double cost();
}
