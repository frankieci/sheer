package com.frankieci.agile.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Originator originator = new Originator("High");
        System.out.println("第一次状态：" + originator.getState());
        taker.setMemento(originator.createMemento()); //备忘一次

        originator.setState("lower");
        System.out.println("第二次状态：" + originator.getState());

        originator.setMemento(taker.getMemento()); //恢复到备忘录保持的状态
        System.out.println("第三次状态：" + originator.getState());
    }
}
