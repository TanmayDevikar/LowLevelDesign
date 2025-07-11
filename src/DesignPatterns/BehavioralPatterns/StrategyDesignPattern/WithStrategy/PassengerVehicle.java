package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
