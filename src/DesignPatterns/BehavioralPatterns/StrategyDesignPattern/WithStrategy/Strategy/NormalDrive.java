package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capacity");
    }
}
