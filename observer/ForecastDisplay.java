public class ForecastDisplay implements Observer, DisplayElement{
    private String forecast;

    @Override
    public void update(float temp, float humidity, float pressure) {
        // Update forecast
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + forecast);
    }
}
