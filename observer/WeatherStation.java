import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temperature;

   public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temperature = 25;
    }
     
     @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature);

        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    
}
