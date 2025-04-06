package edu.gof.abstractFactory.option_1.concreteProducts.economic;

import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;

public class MotorcycleEconomic extends MotorcycleProduct {

    @Override
    public String assembleMotorcycle() {
        return "Economical motorcycle assembled!";
    }
}
