package com.frankieci.agile.mediator;

public class ProductDepartment implements Department {

    private Mediator mediator;

    public ProductDepartment(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("productDepartment", this);
    }

    @Override
    public void act() {
        System.out.println("ProductDepartment report.");
    }

    @Override
    public void transmit() {
        System.out.println("ProductDepartment transmit.");
        mediator.command("market");
    }
}
