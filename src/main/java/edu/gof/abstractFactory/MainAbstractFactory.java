package edu.gof.abstractFactory;

import edu.gof.abstractFactory.option_2.fabricas.DeliveryFactory;
import edu.gof.abstractFactory.option_2.fabricas.HambugueriaFactory;
import edu.gof.abstractFactory.option_2.fabricas.PizzariaFactory;

import java.util.Objects;

public class MainAbstractFactory {

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
