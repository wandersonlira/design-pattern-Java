package edu.gof.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class LabirintoJogo {
    private final List<Sala> salas = new ArrayList<>();

    public LabirintoJogo() {
        Sala sala1 = labirintoSala();
        Sala sala2 = labirintoSala();

        sala1.connectar(sala2);

        salas.add(sala1);
        salas.add(sala2);
    }

    abstract protected Sala labirintoSala();
}
