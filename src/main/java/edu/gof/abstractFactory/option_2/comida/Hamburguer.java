package edu.gof.abstractFactory.comida;

public class Hamburguer implements Comida {

    @Override
    public void removerIngrediente(String nome) {
        System.out.println("Removido o ingrediente " + nome + " do hamburguer!");
    }
}
