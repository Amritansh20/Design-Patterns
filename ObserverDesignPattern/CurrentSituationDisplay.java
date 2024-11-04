package ObserverDesignPattern;

public class CurrentSituationDisplay implements Observer{
    private float temperature;

    @Override
    public void update(float temperature) {
       this.temperature =temperature;
       display();
    }

    public void display(){
        System.out.println("Current Situation Display is: "+ temperature +" degree celcius");
    }
    
}
