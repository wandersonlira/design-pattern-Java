package edu.design;

import edu.design.factoryMethod.ComumLabirintoJogo;
import edu.design.factoryMethod.LabirintoJogo;
import edu.design.factoryMethod.MagicoLabirintoJogo;

public class Main {
    public static void main(String[] args) {

//      Instanciando usando padrão Factry Method
        LabirintoJogo salaComum = new ComumLabirintoJogo();
        LabirintoJogo salaMagica = new MagicoLabirintoJogo();
    }
}