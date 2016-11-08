package designpattern.observer;
/**
 * 
 * @author tojian
 * 气象监测应用的概况
 * 此系统中的三个部分是气象站，WeatherData对象，布告板
 * 
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherdata =new WeatherData();
		
		CurrentConditionsDisplay currentconditionsdisplay=new CurrentConditionsDisplay(weatherdata);
		weatherdata.setMessurements(80, 65, 30.4f);
		weatherdata.setMessurements(83, 65, 30.4f);
		weatherdata.setMessurements(70, 65, 30.4f);

	
	}
}
