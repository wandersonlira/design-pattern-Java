package edu.design.factoryMethod;

public class ComumLabirintoJogo extends LabirintoJogo{
    @Override
    protected Sala labirintoSala() {
        return new SalaComum();
    }
}
