package com.kodilla.game;

public class Paper implements Move {
    private static Paper paperInstance = null;

    private Paper() {
    }

    public static Paper getInstance() {
        if (paperInstance == null) {
            paperInstance = new Paper();
        }
        return paperInstance;
    }
}