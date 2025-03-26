package edu.design.abstractFactory;

import edu.design.abstractFactory.fabricas.DeliveryFactory;
import edu.design.abstractFactory.fabricas.HambugueriaFactory;
import edu.design.abstractFactory.fabricas.PizzariaFactory;

import java.util.Objects;

public class Main {

    public static void main(String[] args) throws Exception {
        DeliveryFactory factory;

        if (Objects.equals(args[0], "pizzaria")) {
            factory = new PizzariaFactory();
            factory.criarBebida().escolherSemAcucar();
            factory.criarComida().removerIngrediente("Cebola");

        } else if (Objects.equals(args[0], "hamburgueria")) {
            factory = new HambugueriaFactory();
            factory.criarBebida().escolherSemAcucar();
            factory.criarComida().removerIngrediente("Tomate");
        } else {
            throw new Exception("Tipo do estabelecimento é obrigatório!");
        }

    }
}
