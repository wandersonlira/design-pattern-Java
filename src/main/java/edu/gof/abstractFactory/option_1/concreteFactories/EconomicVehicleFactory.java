package edu.gof.abstractFactory.option_1.concreteFactories;

import edu.gof.abstractFactory.option_1.abstractFactories.VehicleFactory;
import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;
import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;
import edu.gof.abstractFactory.option_1.concreteProducts.economic.CarEconomic;
import edu.gof.abstractFactory.option_1.concreteProducts.economic.MotorcycleEconomic;

public class EconomicVehicleFactory implements VehicleFactory {

    @Override
    public CarProduct createCar() {
        return new CarEconomic();
    }

    @Override
    public MotorcycleProduct createMotorcycle() {
        return new MotorcycleEconomic();
    }
}
