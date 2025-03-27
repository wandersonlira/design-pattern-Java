package edu.gof.abstractFactory.clientes;

import edu.gof.abstractFactory.bebida.Bebida;
import edu.gof.abstractFactory.comida.Comida;
import edu.gof.abstractFactory.fabricas.DeliveryFactory;

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
