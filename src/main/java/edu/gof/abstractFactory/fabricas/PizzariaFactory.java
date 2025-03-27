package edu.gof.abstractFactory.fabricas;

import edu.gof.abstractFactory.bebida.Bebida;
import edu.gof.abstractFactory.bebida.Refrigerante;
import edu.gof.abstractFactory.comida.Comida;
import edu.gof.abstractFactory.comida.Pizza;

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
