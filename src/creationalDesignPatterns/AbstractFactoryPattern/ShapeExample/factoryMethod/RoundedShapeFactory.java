package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.RoundedCircle;
import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.RoundedRectangle;
import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.Shape;

public class RoundedShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new RoundedCircle();
        }
        return null;
    }
}
