package com.frankieci.agile.mediator;

public interface Mediator {
    void register(String name, Department department);
    void command(String name);
}
