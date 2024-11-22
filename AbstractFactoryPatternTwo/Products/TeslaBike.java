package AbstractFactoryPatternTwo.Products;

import AbstractFactoryPatternTwo.AbstractProduct.Bike;

public class TeslaBike implements Bike {

    @Override
    public void assemble() {
        System.out.println("Assembling Tesla Bike");
    }
    
}
