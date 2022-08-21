package creationalDesignPatterns.AbstractFactoryPattern.ShapeExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static creationalDesignPatterns.AbstractFactoryPattern.ShapeExample.factoryMethod.FactoryProducer.getFactory;

public class main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the type of shape(normal/rounded): ");
        var shapeType = (new BufferedReader((new InputStreamReader(System.in)))).readLine();

        System.out.print("Enter the name of shape you want to draw: ");
        var shapeName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        var factory = getFactory(shapeType);

        var s = factory.getShape(shapeName);
        s.draw();
    }
}

