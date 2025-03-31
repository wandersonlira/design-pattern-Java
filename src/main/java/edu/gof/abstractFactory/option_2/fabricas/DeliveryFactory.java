package edu.gof.abstractFactory.option_2.fabricas;

import edu.gof.abstractFactory.option_2.bebida.Bebida;
import edu.gof.abstractFactory.option_2.comida.Comida;

public interface DeliveryFactory {

    Comida criarComida();
    Bebida criarBebida();
}
