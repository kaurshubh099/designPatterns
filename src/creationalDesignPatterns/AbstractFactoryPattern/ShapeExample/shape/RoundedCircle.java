package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.shape;

public class RoundedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Circle");
    }
}
