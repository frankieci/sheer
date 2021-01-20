package com.frankieci.agile.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录
 */
public class CareTaker {

    private Memento memento;

    //管理多个状态的备忘录
    private List<Memento> mementos = new ArrayList<>();

    public CareTaker() {
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
