package edu.design.abstractFactory.fabricas;

import edu.design.abstractFactory.bebida.Bebida;
import edu.design.abstractFactory.bebida.Refrigerante;
import edu.design.abstractFactory.comida.Comida;
import edu.design.abstractFactory.comida.Pizza;

public class PizzariaFactory implements DeliveryFactory {

    @Override
    public Comida criarComida() {
        return new Pizza();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }
}
