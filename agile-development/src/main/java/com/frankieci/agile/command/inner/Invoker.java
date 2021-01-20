package com.frankieci.agile.command.inner;

import com.frankieci.agile.command.Command;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() throws Exception {
        command.execute();
    }
}
