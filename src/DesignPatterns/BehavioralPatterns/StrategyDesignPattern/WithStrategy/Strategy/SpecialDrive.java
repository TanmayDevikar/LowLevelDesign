package DesignPatterns.BehavioralPatterns.StrategyDesignPattern.WithStrategy.Strategy;

public class SpecialDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Drive Capacity");
    }
}
