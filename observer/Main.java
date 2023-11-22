public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        // Simulate weather changes
        weatherData.setMeasurements(75, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


    }
    
}
