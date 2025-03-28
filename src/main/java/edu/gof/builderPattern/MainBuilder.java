package edu.gof.builderPattern;

import edu.gof.builderPattern.option_1.concreteBuilder.PizzaBuilder;
import edu.gof.builderPattern.option_1.director.PizzaDirector;
import edu.gof.builderPattern.option_2.Pessoa;
import edu.gof.builderPattern.option_1.product.Pizza;

public class MainBuilder {
    public static void main(String[] args) {

//  --------------------------------- OPTION 1 -----------------------------

// ------------- Padrão Builder sem ação do Director tornando a construção evidente. ------------------

//        Pizza pizza = new PizzaBuilder()
//                .massa("Fina")
//                .cobertura("Queijo, presunto e cogumelos")
//                .tamanho("Médio")
//                .build();

// -------------- Padrão Builder com ação do Director. ----------------------

        PizzaBuilder builder = new PizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);
        Pizza pizza = director.construirPizzaEspecial();
//
        System.out.println("Criado: " + pizza);

//  -------------------------- OPTION 2 -----------------------------

//  Padrão Builder realizado na própria classe Product (Pessoa). A ideia é forçar a construção do builder
//  pela classe concreta (PessoaBuilder) que está "static".

//        Pessoa pessoa = new Pessoa.PessoaBuilder()
//                .nome("Wanderson")
//                .sobrenome("Lira")
//                .usuario("wandersonlira")
//                .email("wandersonlira.dev1@gmail.com")
//                .build();
//        System.out.println(pessoa.toString());

    }
}
