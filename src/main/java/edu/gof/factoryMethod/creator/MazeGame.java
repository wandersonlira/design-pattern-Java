package edu.gof.factoryMethod.creator;

import edu.gof.factoryMethod.product.Room;

public abstract class MazeGame {

    abstract protected Room makeRoom();

    public void connectRooms() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();
        room1.connect(room2);
    }
}
