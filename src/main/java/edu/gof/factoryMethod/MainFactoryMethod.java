package edu.gof.factoryMethod;

import edu.gof.factoryMethod.concreteCreator.MagicMazeGame;
import edu.gof.factoryMethod.concreteCreator.OrdinaryMazeGame;
import edu.gof.factoryMethod.creator.MazeGame;

public class MainFactoryMethod {

    public static void main(String[] args) {

        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicMazeGame = new MagicMazeGame();

        magicMazeGame.connectRooms();
    }
}