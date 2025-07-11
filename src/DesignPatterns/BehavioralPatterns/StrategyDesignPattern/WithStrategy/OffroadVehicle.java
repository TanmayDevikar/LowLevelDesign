package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy.SpecialDrive;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDrive());
    }
}
