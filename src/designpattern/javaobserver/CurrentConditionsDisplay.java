package designpattern.javaobserver;


import java.util.Observable;
import java.util.Observer;



public class CurrentConditionsDisplay implements Observer ,DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	

	
	public CurrentConditionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable=observable;
		observable.addObserver((Observer) this);
		
	}
	@Override
	public void update(Observable obs, Object obj) {
		// TODO Auto-generated method stub
    if(obs instanceof WeatherData){
    
    	WeatherData weatherData=(WeatherData) obs;
    	this.temperature=weatherData.getTemperature();
    	this.humidity=weatherData.getHumidity();
    	display();
       
    
    }
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions :"+temperature +"F degree and "+humidity+"% humidity");
	}

}
