package Observer_Pattern_2;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 70, 60);

	}
}
