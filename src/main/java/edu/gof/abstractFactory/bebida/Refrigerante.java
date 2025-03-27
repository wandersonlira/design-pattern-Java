package edu.gof.abstractFactory.bebida;

public class Refrigerante implements Bebida{

    @Override
    public void escolherSemAcucar() {
        System.out.println("Refrigerante escolhido!");
    }
}
