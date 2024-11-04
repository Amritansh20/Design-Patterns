package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        WheatherStation wheatherStation =new WheatherStation();

        CurrentSituationDisplay currentSituationDisplay = new CurrentSituationDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        wheatherStation.addObserver(statisticsDisplay);
        wheatherStation.addObserver(currentSituationDisplay);
        
        wheatherStation.setTemperature(23.89f);
        wheatherStation.setTemperature(12.98f);
        wheatherStation.setTemperature(34.23f);
        wheatherStation.setTemperature(56.76f);

    }
    
}
