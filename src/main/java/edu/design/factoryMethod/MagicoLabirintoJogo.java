package edu.design.factoryMethod;

public class MagicoLabirintoJogo extends LabirintoJogo{
    @Override
    protected Sala labirintoSala() {
        return new SalaMagica();
    }
}
