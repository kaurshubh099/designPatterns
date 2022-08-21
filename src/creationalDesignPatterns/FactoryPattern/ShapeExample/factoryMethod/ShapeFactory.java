package creationalDesignPatterns.FactoryPattern.ShapeExample.factoryMethod;

import creationalDesignPatterns.FactoryPattern.ShapeExample.shape.Circle;
import creationalDesignPatterns.FactoryPattern.ShapeExample.shape.Rectangle;
import creationalDesignPatterns.FactoryPattern.ShapeExample.shape.Shape;
import creationalDesignPatterns.FactoryPattern.ShapeExample.shape.Sqaure;

public class ShapeFactory {
    public static Shape getShape(String shape){
        if(shape.equalsIgnoreCase("Square")){
            return new Sqaure();
        } else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}
