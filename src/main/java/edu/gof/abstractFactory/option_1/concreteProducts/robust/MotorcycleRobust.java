package edu.gof.abstractFactory.option_1.concreteProducts.robust;

import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;

public class MotorcycleLuxury extends MotorcycleProduct {
    @Override
    public String assembleMotorcycle() {
        return "Luxury motorcycle assembled!";
    }
}
