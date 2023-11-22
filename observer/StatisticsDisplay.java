public class StatisticsDisplay implements Observer, DisplayElement {
    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;

    @Override
    public void update(float temp, float humidity, float pressure) {
        // Update statistics (average, min, max)
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics - Avg: " + averageTemperature + ", Min: " + minTemperature + ", Max: " + maxTemperature);
    }
}