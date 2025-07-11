package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
