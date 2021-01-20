package com.frankieci.agile.mediator;

public class Market implements Department {

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void act() {
        System.out.println("Market report.");
    }

    @Override
    public void transmit() {
        System.out.println("Market transmit");
    }
}
