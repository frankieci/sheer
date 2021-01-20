package com.frankieci.agile.strategy;

public interface Application {

    public void init();
    public void idle();
    public void cleanup();
    public boolean done();
}
