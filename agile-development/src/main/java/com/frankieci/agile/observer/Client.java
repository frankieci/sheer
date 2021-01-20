package com.frankieci.agile.observer;

import com.frankieci.agile.observer.inner.InConcreteObserver;
import com.frankieci.agile.observer.inner.InConcreteSubject;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);
        subject.setState(1000);
        System.out.println(observer1.getObserverValue());
        System.out.println(observer2.getObserverValue());
        System.out.println(observer3.getObserverValue());

        InConcreteSubject subject2 = new InConcreteSubject();

        InConcreteObserver observer4 = new InConcreteObserver();
        InConcreteObserver observer5 = new InConcreteObserver();
        InConcreteObserver observer6 = new InConcreteObserver();
        subject2.addObserver(observer4);
        subject2.addObserver(observer5);
        subject2.addObserver(observer6);
        subject2.setState(2000);
        System.out.println(observer4.getObserverValue());
        System.out.println(observer5.getObserverValue());
        System.out.println(observer6.getObserverValue());
    }
}
