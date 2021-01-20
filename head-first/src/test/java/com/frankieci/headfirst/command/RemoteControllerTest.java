package com.frankieci.headfirst.command;

import org.junit.Test;

public class RemoteControllerTest {

  @Test
  public void commandPatternTest() {
    RemoteController controller = new RemoteController();
    controller.executeClient();
  }
}