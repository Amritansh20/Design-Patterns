package AbstractFactoryPatternTwo.Products;

import AbstractFactoryPatternTwo.AbstractProduct.Car;

public class HondaCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Honda Car");
    }
    
}
