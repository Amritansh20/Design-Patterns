package AbstractFactoryPatternTwo.Factories;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;
import AbstractFactoryPatternTwo.AbstractProduct.Car;

public interface AbstractFactory {
    Car createCar();
    Bike createBike();
}
