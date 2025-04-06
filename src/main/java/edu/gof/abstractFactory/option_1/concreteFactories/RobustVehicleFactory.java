package edu.gof.abstractFactory.option_1.concreteFactories;

import edu.gof.abstractFactory.option_1.abstractFactories.VehicleFactory;
import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;
import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;
import edu.gof.abstractFactory.option_1.concreteProducts.robust.CarRobust;
import edu.gof.abstractFactory.option_1.concreteProducts.robust.MotorcycleRobust;

public class RobustVehicleFactory implements VehicleFactory {
    @Override
    public CarProduct createCar() {
        return new CarRobust();
    }

    @Override
    public MotorcycleProduct createMotorcycle() {
        return new MotorcycleRobust();
    }
}
