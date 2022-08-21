package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.factoryMethod;

public class FactoryProducer {
    public static AbstractFactory getFactory(String shapeType){
        if (shapeType.equalsIgnoreCase("normal")) {
            return new ShapeFactory();
        } else if (shapeType.equalsIgnoreCase("rounded")) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}
