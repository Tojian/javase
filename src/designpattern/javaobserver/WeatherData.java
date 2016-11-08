package designpattern.javaobserver;


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


	//当从气象站得到更新的观测值的时候，我们通知观察者
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
  
	
	//用这个方法来测试公告板
	public void setMessurements(float temperature ,float humidity,float pressure){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		measurementsChanged();
	}
}
