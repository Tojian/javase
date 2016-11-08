package designpattern.javaobserver;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherdata =new WeatherData();
		
		CurrentConditionsDisplay currentconditionsdisplay=new CurrentConditionsDisplay(weatherdata);
		weatherdata.setMessurements(80, 65, 30.4f);
		weatherdata.setMessurements(83, 65, 30.4f);
		weatherdata.setMessurements(70, 65, 30.4f);

	
	}
}
