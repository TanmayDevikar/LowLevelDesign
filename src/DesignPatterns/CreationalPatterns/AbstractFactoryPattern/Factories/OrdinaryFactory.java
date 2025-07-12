package DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.BMW;
import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class OrdinaryFactory implements VehicleFactories {

    @Override
    public Vehicle getVehicle(String vehicleType) {

        switch (vehicleType) {

            case "SWIFT":
                return new BMW();

            default:
                return null;
        }
    }
}
