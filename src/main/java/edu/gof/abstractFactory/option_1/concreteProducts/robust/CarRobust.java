package edu.gof.abstractFactory.option_1.concreteProducts.robust;

import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;

public class CarLuxury extends CarProduct {

    @Override
    public String assembleCar() {
        return "Luxury car assembled!";
    }
}
