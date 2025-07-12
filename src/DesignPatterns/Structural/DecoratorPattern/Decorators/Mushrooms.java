package DesignPatterns.Structural.DecoratorPattern.Decorators;

import DesignPatterns.Structural.DecoratorPattern.Base.BasePizza;

public class Mushrooms extends ToppingDecorator{

    BasePizza basePizza;

    public Mushrooms(BasePizza basePizza) {
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
