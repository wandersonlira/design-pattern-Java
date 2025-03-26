package edu.design.abstractFactory.fabricas;

import edu.design.abstractFactory.bebida.Bebida;
import edu.design.abstractFactory.bebida.MilkShake;
import edu.design.abstractFactory.comida.Comida;
import edu.design.abstractFactory.comida.Hamburguer;

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
