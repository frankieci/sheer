package com.frankieci.agile.command.inner;

import com.frankieci.agile.command.Command;

public class Client {
    public static void main(String[] args) {
        Command concreteCommand = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(concreteCommand);
        try {
            invoker.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
