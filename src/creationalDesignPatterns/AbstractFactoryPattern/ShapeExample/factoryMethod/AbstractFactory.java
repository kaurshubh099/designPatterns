package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape.Shape;

public interface AbstractFactory {
    Shape getShape(String shape);
}
