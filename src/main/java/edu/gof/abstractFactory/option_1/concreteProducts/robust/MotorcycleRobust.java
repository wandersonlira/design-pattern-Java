package edu.gof.abstractFactory.option_1.concreteProducts.robust;

import edu.gof.abstractFactory.option_1.abstractProducts.MotorcycleProduct;

public class MotorcycleRobust extends MotorcycleProduct {
    @Override
    public String assembleMotorcycle() {
        return "Robust motorcycle assembled!";
    }
}
