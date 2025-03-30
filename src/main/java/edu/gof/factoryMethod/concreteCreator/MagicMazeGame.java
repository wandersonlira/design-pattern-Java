package edu.gof.factoryMethod.concreteCreator;

import edu.gof.factoryMethod.concreteProduct.MagicRoom;
import edu.gof.factoryMethod.creator.MazeGame;
import edu.gof.factoryMethod.product.Room;

public class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
