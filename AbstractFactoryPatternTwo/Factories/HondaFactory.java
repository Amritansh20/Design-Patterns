package AbstractFactoryPatternTwo.Factories;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;
import AbstractFactoryPatternTwo.AbstractProduct.Car;
import AbstractFactoryPatternTwo.Products.HondaBike;
import AbstractFactoryPatternTwo.Products.HondaCar;

public class HondaFactory implements AbstractFactory {

    @Override
    public Car createCar() {
      return new HondaCar();
    }

    @Override
    public Bike createBike() {
      return new HondaBike();
    }
    
}
