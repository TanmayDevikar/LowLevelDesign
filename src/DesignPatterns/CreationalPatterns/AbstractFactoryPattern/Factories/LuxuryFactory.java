package DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.BMW;
import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Vehicles.Vehicle;

public class LuxuryFactory implements VehicleFactories {

    @Override
    public Vehicle getVehicle(String vehicleType) {

        switch (vehicleType) {

            case "BMW":
                return new BMW();

            default:
                return null;
        }
    }
}
