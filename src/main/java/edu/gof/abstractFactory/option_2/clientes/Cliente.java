package edu.gof.abstractFactory.option_2.clientes;

import edu.gof.abstractFactory.option_2.bebida.Bebida;
import edu.gof.abstractFactory.option_2.comida.Comida;
import edu.gof.abstractFactory.option_2.fabricas.DeliveryFactory;

public class Cliente {

    private final DeliveryFactory factory;

    public Cliente(DeliveryFactory factory) {
        this.factory = factory;
    }

    public void criaPedido(String ingrediente) {
        Comida comida = factory.criarComida();
        Bebida bebida = factory.criarBebida();

        comida.removerIngrediente(ingrediente);
        bebida.escolherSemAcucar();
    }
}
