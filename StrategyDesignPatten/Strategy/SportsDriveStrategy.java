package StrategyDesignPatten.Strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
       System.out.println("Sports Drive Strategy");
    }
    
}
