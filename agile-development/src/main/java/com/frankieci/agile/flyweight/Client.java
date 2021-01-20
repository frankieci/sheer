package com.frankieci.agile.flyweight;

public class Client {
    public static void main(String[] args) {
        Flyweight black = FlyweightFactory.getFlyweight("black");
        Flyweight black1 = FlyweightFactory.getFlyweight("black");
        black.display(new UnSharedConcreteFlyweight(10, 10));
        black1.display(new UnSharedConcreteFlyweight(20, 20));
    }
}
