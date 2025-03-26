package edu.design.abstractFactory.clientes;

import edu.design.abstractFactory.bebida.Bebida;
import edu.design.abstractFactory.comida.Comida;
import edu.design.abstractFactory.fabricas.DeliveryFactory;

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
