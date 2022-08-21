package creationalDesignPatterns.FactoryPattern.ShapeExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static creationalDesignPatterns.FactoryPattern.ShapeExample.factoryMethod.ShapeFactory.getShape;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the name of shape you want to draw: ");
        var br = new BufferedReader(new InputStreamReader(System.in));

        var shapeType = br.readLine();
        var shape = getShape(shapeType);
        shape.draw();
    }
}
