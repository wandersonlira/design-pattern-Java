package edu.gof.abstractFactory.option_1.customer;

import edu.gof.abstractFactory.option_1.abstractFactories.VehicleFactory;
import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;
import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;

public class Customer {

    public String createCar(String type) {
        VehicleFactory vehicle = VehicleFactory.manufacturesVehicles(type);
        CarProduct car = vehicle.createCar();
        return car.assembleCar();
    }

    public String createMotorcycle(String type) {
        VehicleFactory vehicle = VehicleFactory.manufacturesVehicles(type);
        MotorcycleProduct motorcycle = vehicle.createMotorcycle();
        return motorcycle.assembleMotorcycle();
    }
}
