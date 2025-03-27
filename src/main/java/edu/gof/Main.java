package edu.gof;

import edu.gof.factoryMethod.ComumLabirintoJogo;
import edu.gof.factoryMethod.LabirintoJogo;
import edu.gof.factoryMethod.MagicoLabirintoJogo;

public class Main {
    public static void main(String[] args) {

//      Instanciando usando padrão Factry Method
        LabirintoJogo salaComum = new ComumLabirintoJogo();
        LabirintoJogo salaMagica = new MagicoLabirintoJogo();
    }
}