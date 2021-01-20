package com.frankieci.headfirst.command.demo;

import com.frankieci.headfirst.command.Command;

public class CeilingFanHighCommand implements Command {

  private CeilingFan ceilingFan;
  private int previousSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    previousSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }

  @Override
  public void undo() {
    if (previousSpeed == CeilingFan.HIGH) {
      ceilingFan.high();
    } else if (previousSpeed == CeilingFan.MEDIUM) {
      ceilingFan.medium();
    } else if (previousSpeed == CeilingFan.LOW) {
      ceilingFan.low();
    } else if (previousSpeed == CeilingFan.OFF) {
      ceilingFan.off();
    }
  }
}
