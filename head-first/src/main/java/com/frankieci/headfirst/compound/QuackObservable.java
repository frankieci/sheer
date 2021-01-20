package com.frankieci.headfirst.compound;


public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
