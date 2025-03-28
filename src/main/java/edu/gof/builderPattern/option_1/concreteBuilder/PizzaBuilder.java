package edu.gof.builderPattern.option_1.concreteBuilder;

import edu.gof.builderPattern.option_1.builder.IPizzaBuilder;
import edu.gof.builderPattern.option_1.product.Pizza;

public class PizzaBuilder implements IPizzaBuilder {
    private String massa;
    private String cobertura;
    private String tamanho;



    @Override
    public IPizzaBuilder massa(String massa) {
        this.massa = massa;
        return this;
    }

    @Override
    public IPizzaBuilder cobertura(String cobertura) {
        this.cobertura = cobertura;
        return this;
    }

    @Override
    public IPizzaBuilder tamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(massa, cobertura, tamanho);
    }
}
