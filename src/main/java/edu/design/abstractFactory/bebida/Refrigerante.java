package edu.design.abstractFactory.bebida;

public class Refrigerante implements Bebida{

    @Override
    public void escolherSemAcucar() {
        System.out.println("Refrigerante escolhido!");
    }
}
