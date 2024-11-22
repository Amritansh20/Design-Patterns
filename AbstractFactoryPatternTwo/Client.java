package AbstractFactoryPatternTwo;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;
import AbstractFactoryPatternTwo.Factories.AbstractFactory;
import AbstractFactoryPatternTwo.Factories.HondaFactory;
import AbstractFactoryPatternTwo.Factories.TeslaFactory;


public class Client {
    public static void main(String[] args) {
        AbstractFactory teslaFactory = new TeslaFactory();
        Bike teslaBike = teslaFactory.createBike();
        teslaBike.assemble();

        AbstractFactory hondaFactory = new HondaFactory();
        Bike hondaBike = hondaFactory.createBike();
        hondaBike.assemble();
    }
}
