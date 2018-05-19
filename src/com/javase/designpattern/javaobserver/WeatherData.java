package com.javase.designpattern.javaobserver;


import java.util.Observable;

public class WeatherData extends Observable{


	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		
	}

	public float getTemperature() {
	return temperature;
}


public float getHumidity() {
	return humidity;
}


public float getPressure() {
	return pressure;
}


	//��������վ�õ����µĹ۲�ֵ��ʱ������֪ͨ�۲���
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
  
	
	//��������������Թ����
	public void setMessurements(float temperature ,float humidity,float pressure){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		measurementsChanged();
	}
}
