package com.frankieci.agile.memento;

/**
 * 源发器类
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    //进行备忘操作，返回备忘录对象
    public Memento createMemento() {
        return new Memento(this);
    }

    //进行数据恢复，恢复到备忘录之前的状态
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
