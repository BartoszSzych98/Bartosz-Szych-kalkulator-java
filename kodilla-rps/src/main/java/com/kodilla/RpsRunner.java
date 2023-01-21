package com.kodilla;

public class RpsRunner {
    public static void main(String[] args) {
        boolean nextGame = true;
        while (nextGame) {
            Game game = Game.initializeGame();
            game.displayInstruction();
            nextGame = game.playGame();
        }
    }
}

