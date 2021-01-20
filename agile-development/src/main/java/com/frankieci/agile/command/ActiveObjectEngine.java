package com.frankieci.agile.command;

import com.google.common.collect.Lists;

import java.util.LinkedList;

public class ActiveObjectEngine {

    private LinkedList<Command> commands = Lists.newLinkedList();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void run() throws Exception {
        while (!commands.isEmpty()) {
            Command command = commands.pollFirst();
            command.execute();
        }
    }
}
