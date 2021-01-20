package com.frankieci.agile.memento;

/**
 * 备忘录类
 */
public class Memento {

    private String state;

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
