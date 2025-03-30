package edu.gof.factoryMethod.concreteProduct;

import edu.gof.factoryMethod.product.Room;

public class OrdinaryRoom implements Room {

    @Override
    public void connect(Room room) {
        System.out.println("Connect ordinary room!");
    }
}
