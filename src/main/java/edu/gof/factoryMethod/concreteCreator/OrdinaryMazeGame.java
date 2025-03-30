package edu.gof.factoryMethod.concreteCreator;

import edu.gof.factoryMethod.concreteProduct.OrdinaryRoom;
import edu.gof.factoryMethod.creator.MazeGame;
import edu.gof.factoryMethod.product.Room;

public class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}
