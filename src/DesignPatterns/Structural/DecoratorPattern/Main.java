package DesignPatterns.Structural.DecoratorPattern;

import DesignPatterns.Structural.DecoratorPattern.Base.BasePizza;
import DesignPatterns.Structural.DecoratorPattern.Base.VeggieDelight;
import DesignPatterns.Structural.DecoratorPattern.Decorators.ExtraCheese;
import DesignPatterns.Structural.DecoratorPattern.Decorators.Mushrooms;

public class Main {

    //A Pizza shop where we can add whatever toppings we want on a base pizza of our choice.

    public static void main(String[] args) {

        BasePizza pizza = new VeggieDelight();
        BasePizza pizzaWithExCheese = new ExtraCheese(pizza);
        BasePizza pizzaWith2ExCheese = new ExtraCheese(pizzaWithExCheese);
        System.out.println(pizzaWith2ExCheese.cost());

        BasePizza pizzaWith2ExCheeseAndMushrooms = new Mushrooms(pizzaWith2ExCheese);
        System.out.println(pizzaWith2ExCheeseAndMushrooms.cost());

    }
}
