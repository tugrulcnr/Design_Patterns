public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

   

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    } 
    
    @Override
    public void display() {
        System.out.println("Current Conditions - Temp: " + temperature + "°, Humidity: " + humidity);

    }
    
}
