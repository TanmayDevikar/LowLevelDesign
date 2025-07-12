package DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public interface VehicleFactories {

    Vehicle getVehicle(String vehicleType);
}
