package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy.NormalDrive;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDrive());
    }
}
