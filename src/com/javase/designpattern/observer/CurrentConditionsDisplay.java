package com.javase.designpattern.observer;

public class CurrentConditionsDisplay implements Observer ,DisplayElement{

	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
		
	}
	@Override
	public void update(float temp, float humidity, float pressue) {
		// TODO Auto-generated method stub
       this.temperature=temp;
       this.humidity=humidity;
       display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions :"+temperature +"F degree and "+humidity+"% humidity");
	}

}
