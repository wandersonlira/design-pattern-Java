package edu.gof.abstractFactory.option_1.abstractFactories;

import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;
import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;
import edu.gof.abstractFactory.option_1.concreteFactories.EconomicVehicleFactory;
import edu.gof.abstractFactory.option_1.concreteFactories.LuxuryVehicleFactory;
import edu.gof.abstractFactory.option_1.concreteFactories.RobustVehicleFactory;

public interface VehicleFactory {

    CarProduct createCar();
    MotorcycleProduct createMotorcycle();


    public static VehicleFactory manufacturesVehicles(String type) {
        return switch (type) {
            case "economic" -> new EconomicVehicleFactory();
            case "luxury" -> new LuxuryVehicleFactory();
            case "robust" -> new RobustVehicleFactory();
            default -> throw new IllegalArgumentException("Error: type not found!");
        };
    }
}
