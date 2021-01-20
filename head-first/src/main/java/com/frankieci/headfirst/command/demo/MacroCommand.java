package com.frankieci.headfirst.command.demo;

import com.frankieci.headfirst.command.Command;

public class MacroCommand implements Command {

  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    for (int i = 0, len = commands.length; i < len; i++) {
      commands[i].execute();
    }
  }

  @Override
  public void undo() {
    for (int i = 0, len = commands.length; i < len; i++) {
      commands[i].undo();
    }
  }
}
