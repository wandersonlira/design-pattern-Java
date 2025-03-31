package edu.gof.abstractFactory.option_2.comida;

public class Hamburguer implements Comida {

    @Override
    public void removerIngrediente(String nome) {
        System.out.println("Removido o ingrediente " + nome + " do hamburguer!");
    }
}
