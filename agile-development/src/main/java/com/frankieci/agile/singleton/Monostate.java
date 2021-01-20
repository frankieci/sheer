package com.frankieci.agile.singleton;

public class Monostate {

    private static int x = 0;

    public Monostate() {
    }

    public int getX() {
        return x;
    }

    public static void setX(int x) {
        Monostate.x = x;
    }
}
