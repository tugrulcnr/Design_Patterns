public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer observer1 = new WeatherObserver("Gözlemci 1");
        Observer observer2 = new WeatherObserver("Gözlemci 2");

        weatherStation.registerObserver(observer1);        
        weatherStation.registerObserver(observer2);

        weatherStation.setTemperature(30);
        weatherStation.setTemperature(22);

        weatherStation.removeObserver(observer1);

        weatherStation.setTemperature(28);
        


    }
    
}
