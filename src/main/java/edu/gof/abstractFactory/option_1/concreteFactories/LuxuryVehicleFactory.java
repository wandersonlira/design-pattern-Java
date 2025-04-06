package edu.gof.abstractFactory.option_1.concreteFactories;

import edu.gof.abstractFactory.option_1.abstractFactories.VehicleFactory;
import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;
import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;
import edu.gof.abstractFactory.option_1.concreteProducts.luxurious.CarLuxury;
import edu.gof.abstractFactory.option_1.concreteProducts.luxurious.MotorcycleLuxury;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public CarProduct createCar() {
        return new CarLuxury();
    }

    @Override
    public MotorcycleProduct createMotorcycle() {
        return new MotorcycleLuxury();
    }
}
