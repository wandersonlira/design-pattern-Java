package edu.gof.builderPattern.option_1.director;

import edu.gof.builderPattern.option_1.builder.IPizzaBuilder;
import edu.gof.builderPattern.option_1.product.Pizza;

public class PizzaDirector {

    private final IPizzaBuilder builder;

    public PizzaDirector(IPizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza construirPizzaEspecial() {
        builder.massa("Fina");
        builder.cobertura("Queijo, presunto e cogumelos alucinógenos.");
        builder.tamanho("Médio");
        return builder.build();
    }
}
