package DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles;

public class BMW implements LuxuryVehicles{

    @Override
    public void average() {
        System.out.println("Average of BMW is 50mph");
    }
}
