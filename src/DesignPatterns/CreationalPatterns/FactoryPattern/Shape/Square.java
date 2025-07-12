package DesignPatterns.CreationalPatterns.FactoryPattern.Shape;

import java.awt.*;

public class Square implements ShapeInterface {

    @Override
    public void draw() {
        System.out.println("I am a Square Object");
    }
}
