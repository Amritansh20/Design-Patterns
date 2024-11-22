package AbstractFactoryPatternTwo.Factories;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;
import AbstractFactoryPatternTwo.AbstractProduct.Car;
import AbstractFactoryPatternTwo.Products.TeslaBike;
import AbstractFactoryPatternTwo.Products.TeslaCar;

public class TeslaFactory implements AbstractFactory {

    @Override
    public Car createCar() {
      return new TeslaCar();
    }

    @Override
    public Bike createBike() {
        return new TeslaBike();
    }
    
}
