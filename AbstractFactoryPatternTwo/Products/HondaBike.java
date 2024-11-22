package AbstractFactoryPatternTwo.Products;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;

public class HondaBike implements Bike {

    @Override
    public void assemble() {
        System.out.println("Assembling Honda Bike");
    }
    
}
