package edu.gof.abstractFactory.bebida;

public class MilkShake implements Bebida{

    @Override
    public void escolherSemAcucar() {
        System.out.println("MilkShake escolhido!");
    }
}
