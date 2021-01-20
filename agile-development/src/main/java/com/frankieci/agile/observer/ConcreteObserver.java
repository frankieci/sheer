package com.frankieci.agile.observer;

public class ConcreteObserver implements Observer {

    private int observerValue;

    @Override
    public void update(Subject subject) {
        this.observerValue = ((ConcreteSubject) subject).getState();
    }

    public int getObserverValue() {
        return this.observerValue;
    }
}
