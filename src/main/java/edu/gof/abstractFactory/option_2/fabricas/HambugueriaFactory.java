package edu.gof.abstractFactory.fabricas;

import edu.gof.abstractFactory.bebida.Bebida;
import edu.gof.abstractFactory.bebida.MilkShake;
import edu.gof.abstractFactory.comida.Comida;
import edu.gof.abstractFactory.comida.Hamburguer;

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
