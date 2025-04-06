package edu.gof.abstractFactory.option_1.concreteProducts.economic;

import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;

public class CarEconomic extends CarProduct {

    @Override
    public String assembleCar() {
        return "Economical car assembled!";
    }
}
