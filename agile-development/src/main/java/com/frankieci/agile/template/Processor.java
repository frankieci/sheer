package com.frankieci.agile.template;

public interface Processor {

    default void process() {
        take();
        transact();
        evaluate();
    }

    static void take() {
        System.out.println("take");
    }

    static void evaluate() {
        System.out.println("evaluate");
    }

    void transact();
}
