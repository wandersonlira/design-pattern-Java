package edu.gof.abstractFactory.option_1.concreteProducts.luxurious;

import edu.gof.abstractFactory.option_1.abstractProducts.CarProduct;

public class CarLuxury extends CarProduct {

    @Override
    public String assembleCar() {
        return "Luxury car assembled!";
    }
}
