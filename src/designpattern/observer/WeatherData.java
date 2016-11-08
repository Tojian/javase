package designpattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		 observers=new ArrayList();
	}
	
	
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
         int i=observers.indexOf(o);
         if(i>=0){
        	 observers.remove(i);
        	 
         }
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
         for(int i=0;i<observers.size();i++){
        	 Observer observer=(Observer)observers.get(i);
        	 observer.update(temperature, humidity, pressure); 	 
        	 
         }
	}
	//当从气象站得到更新的观测值的时候，我们通知观察者
	public void measurementsChanged(){
		notifyObserver();
	}
  
	
	//用这个方法来测试公告板
	public void setMessurements(float temperature ,float humidity,float pressure){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		measurementsChanged();
	}
}
