package edu.design.abstractFactory.comida;

public class Pizza implements Comida {

    @Override
    public void removerIngrediente(String nome) {
        System.out.println("Removido o ingrediente " + nome + " da Pizza");
    }
}
