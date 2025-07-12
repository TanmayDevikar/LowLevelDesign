package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories.LuxuryFactory;
import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories.OrdinaryFactory;
import DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Factories.VehicleFactories;

public class Factory {

    public VehicleFactories getVehicleFactory(String factoryType) {

        switch (factoryType) {

            case "LUXURY":
                return new LuxuryFactory();

            case "ORDINARY":
                return new OrdinaryFactory();

            default: return null;
        }
    }
}
