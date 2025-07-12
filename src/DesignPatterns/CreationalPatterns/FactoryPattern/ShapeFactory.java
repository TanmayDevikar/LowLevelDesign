package DesignPatterns.CreationalPatterns.FactoryPattern;

import DesignPatterns.CreationalPatterns.FactoryPattern.Shape.Circle;
import DesignPatterns.CreationalPatterns.FactoryPattern.Shape.ShapeInterface;
import DesignPatterns.CreationalPatterns.FactoryPattern.Shape.Square;
import DesignPatterns.CreationalPatterns.FactoryPattern.Shape.Triangle;

public class ShapeFactory {

    public ShapeInterface getShape(String shapeType) {

        switch(shapeType) {

            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "TRIANGLE":
                return new Triangle();

            default: return null;
        }
    }
}
