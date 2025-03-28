package edu.gof.builderPattern.option_1.builder;

import edu.gof.builderPattern.option_1.product.Pizza;

public interface IPizzaBuilder {

    IPizzaBuilder massa(String massa);
    IPizzaBuilder cobertura(String cobertura);
    IPizzaBuilder tamanho(String tamanho);
    Pizza build();
}
