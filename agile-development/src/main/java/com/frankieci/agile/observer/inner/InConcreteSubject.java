package com.frankieci.agile.observer.inner;

import java.util.Observable;

public class InConcreteSubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();
        this.notifyObservers(state);
    }
}
