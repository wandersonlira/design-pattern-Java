package edu.design.abstractFactory.fabricas;

import edu.design.abstractFactory.bebida.Bebida;
import edu.design.abstractFactory.comida.Comida;

public interface DeliveryFactory {

    Comida criarComida();
    Bebida criarBebida();
}
