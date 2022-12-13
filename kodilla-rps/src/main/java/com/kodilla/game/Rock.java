package com.kodilla.game;

public class Rock implements Move {
    private static Rock rockInstance = null;

    private Rock() {
    }

    public static Rock getInstance() {
        if (rockInstance == null) {
            rockInstance = new Rock();
        }
        return rockInstance;
    }
}
