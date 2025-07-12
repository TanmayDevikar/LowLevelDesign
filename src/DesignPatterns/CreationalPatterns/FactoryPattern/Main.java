package DesignPatterns.CreationalPatterns.FactoryPattern;

import DesignPatterns.CreationalPatterns.FactoryPattern.Shape.ShapeInterface;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        ShapeInterface myShape1 = factory.getShape("CIRCLE");
        myShape1.draw();

        ShapeInterface myShape2 = factory.getShape("SQUARE");
        myShape2.draw();

        ShapeInterface myShape3 = factory.getShape("RECTANGLE");
        if(myShape3 != null)
            myShape3.draw();
        else
            System.out.println("No Shape Found");
    }
}
