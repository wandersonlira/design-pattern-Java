package edu.gof.abstractFactory.fabricas;

import edu.gof.abstractFactory.bebida.Bebida;
import edu.gof.abstractFactory.comida.Comida;

public interface DeliveryFactory {

    Comida criarComida();
    Bebida criarBebida();
}
