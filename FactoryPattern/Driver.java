package FactoryPattern;

public class Driver {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape object = factory.getShape("CIRCLE");
        object.draw();

        Shape obj = factory.getShape("SQUARE");
        obj.draw();
    }
    
}
