package DesignPatterns.CreationalPatterns.FactoryPattern.Shape;

public class Circle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("I am a Circle Object");
    }
}
