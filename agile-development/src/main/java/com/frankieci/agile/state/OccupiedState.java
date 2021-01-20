package com.frankieci.agile.state;

public class OccupiedState implements State {

    @Override
    public void handle() {
        System.out.println("Occupied");
    }
}
