package Observer_Pattern_2;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherdata;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherdata = weatherData;
		this.weatherdata.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("The current weather conditions are"
				+ "Temperature: " + this.temperature + " Pressure: "
				+ this.pressure + " Humidity: " + this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
