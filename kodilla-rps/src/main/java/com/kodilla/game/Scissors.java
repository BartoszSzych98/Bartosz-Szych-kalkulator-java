package com.kodilla.game;

public class Scissors implements Move {
    private static Scissors scissorsInstance = null;

    private Scissors() {
    }

    public static Scissors getInstance() {
        if (scissorsInstance == null) {
            scissorsInstance = new Scissors();
        }
        return scissorsInstance;
    }
}