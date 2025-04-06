package edu.gof.abstractFactory.option_1.concreteProducts.robust;

import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;

public class CarRobust extends CarProduct {

    @Override
    public String assembleCar() {
        return "Robust car assembled!";
    }
}
