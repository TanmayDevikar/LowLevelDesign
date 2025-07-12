package DesignPatterns.CreationalPatterns.FactoryPattern.Shape;

public class Triangle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("I am a Triangle Object");
    }
}
