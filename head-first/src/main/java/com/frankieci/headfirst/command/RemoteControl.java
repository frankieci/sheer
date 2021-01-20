package com.frankieci.headfirst.command;

public class RemoteControl {

  private final int commandCount = 7;

  Command[] onCommands;
  Command[] offCommands;

  public RemoteControl() {
    onCommands = new Command[commandCount];
    offCommands = new Command[commandCount];
    Command noCommand = new NoCommand();
    for (int i = 0; i < commandCount; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void omButtonWasPushed(int slot) {
    onCommands[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("\n--------Remote Control-----------\n");
    for (int i = 0, size = onCommands.length; i < size; i++) {
      sb.append("[slot" + i + "]" + onCommands[i].getClass().getName()
          + "   " + offCommands[i].getClass().getName() + "\n");
    }
    return sb.toString();
  }
}
