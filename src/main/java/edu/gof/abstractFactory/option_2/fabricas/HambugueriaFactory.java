package edu.gof.abstractFactory.option_2.fabricas;

import edu.gof.abstractFactory.option_2.bebida.Bebida;
import edu.gof.abstractFactory.option_2.bebida.MilkShake;
import edu.gof.abstractFactory.option_2.comida.Comida;
import edu.gof.abstractFactory.option_2.comida.Hamburguer;

public class HambugueriaFactory implements DeliveryFactory {

    @Override
    public Comida criarComida() {
        return new Hamburguer();
    }

    @Override
    public Bebida criarBebida() {
        return new MilkShake();
    }
}
