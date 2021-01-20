package com.frankieci.agile.command.inner;

import com.frankieci.agile.command.Command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() throws Exception {
        receiver.act();
    }
}
