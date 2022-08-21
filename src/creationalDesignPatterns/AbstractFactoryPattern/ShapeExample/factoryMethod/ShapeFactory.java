package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.Circle;
import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.Rectangle;
import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.Shape;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
