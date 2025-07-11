package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy obj;

    public Vehicle(DriveStrategy obj) {
        this.obj = obj;
    }

    public void drive() {
        obj.drive();
    }
}
