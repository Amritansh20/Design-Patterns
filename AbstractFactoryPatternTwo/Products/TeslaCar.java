package AbstractFactoryPatternTwo.Products;

import AbstractFactoryPatternTwo.AbstractProduct.Car;

public class TeslaCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Tesla Car");
    }
    
}
