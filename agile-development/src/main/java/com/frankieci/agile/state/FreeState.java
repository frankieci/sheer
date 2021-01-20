package com.frankieci.agile.state;

public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("Free");
    }
}
