package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements Subject {

    private List<Observer> observers;
    private float temperature;

    public WheatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
      observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       
        for(Observer obj : observers){
            obj.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObserver();
    }
    
}
