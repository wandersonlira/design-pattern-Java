package edu.gof.abstractFactory.option_2.bebida;

public class Refrigerante implements Bebida{

    @Override
    public void escolherSemAcucar() {
        System.out.println("Refrigerante escolhido!");
    }
}
