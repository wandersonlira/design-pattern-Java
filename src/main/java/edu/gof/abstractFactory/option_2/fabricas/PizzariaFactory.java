package edu.gof.abstractFactory.option_2.fabricas;

import edu.gof.abstractFactory.option_2.bebida.Bebida;
import edu.gof.abstractFactory.option_2.bebida.Refrigerante;
import edu.gof.abstractFactory.option_2.comida.Comida;
import edu.gof.abstractFactory.option_2.comida.Pizza;

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
