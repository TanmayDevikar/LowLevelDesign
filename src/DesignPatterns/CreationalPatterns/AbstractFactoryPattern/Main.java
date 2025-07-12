package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories.VehicleFactories;
import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {

        Factory factoryType = new Factory();
        VehicleFactories factory = factoryType.getVehicleFactory("LUXURY");

        Vehicle vehicle = factory.getVehicle("BMW");
        vehicle.average();


    }
}
