package creationalDesignPatterns.FactoryPattern.ShapeExample.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
