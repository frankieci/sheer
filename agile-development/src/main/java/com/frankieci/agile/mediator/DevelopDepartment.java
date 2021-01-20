package com.frankieci.agile.mediator;

public class DevelopDepartment implements Department {

    private Mediator mediator;

    public DevelopDepartment(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("developDepartment", this);
    }

    @Override
    public void act() {
        System.out.println("DevelopDepartment report.");
    }

    @Override
    public void transmit() {
        System.out.println("DevelopDepartment transmit.");
        mediator.command("market");
    }
}
