package com.frankieci.agile.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator president = new President();
        Department market = new Market(president);
        Department developDepartment = new DevelopDepartment(president);
        Department productDepartment = new ProductDepartment(president);

        developDepartment.act();
        developDepartment.transmit();

        productDepartment.act();
        productDepartment.transmit();
    }
}
