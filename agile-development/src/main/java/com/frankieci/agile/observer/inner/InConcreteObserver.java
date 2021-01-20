package com.frankieci.agile.observer.inner;

import java.util.Observable;
import java.util.Observer;

public class InConcreteObserver implements Observer {

    private int observerValue;

    @Override
    public void update(Observable o, Object arg) {
        this.observerValue = ((InConcreteSubject) o).getState();
    }

    public int getObserverValue() {
        return observerValue;
    }
}
