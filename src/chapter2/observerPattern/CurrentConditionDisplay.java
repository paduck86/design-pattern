package chapter2.observerPattern;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	//private Subject weatherData;
	
	public CurrentConditionDisplay(/*Subject weatherData*/ Observable observable) {
		//this.weatherData = weatherData;
		//weatherData.registerObserver(this);
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/*@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}*/
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
