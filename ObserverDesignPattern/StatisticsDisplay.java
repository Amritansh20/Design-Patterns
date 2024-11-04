package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer{

    private List<Float> tempLog = new ArrayList<>();

    @Override
    public void update(float temperature) {
      tempLog.add(temperature);
       display();
    }

    public void display(){
        float sum=0;
        for(float temp : tempLog){
            sum += temp;
        }
        float avg = sum/tempLog.size();
        System.out.println("Current temp avg is "+ avg +" degree celcius");

    }

}