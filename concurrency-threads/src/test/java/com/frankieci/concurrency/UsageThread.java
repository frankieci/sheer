package com.frankieci.concurrency;

import org.junit.Test;

public class UsageThread {

  @Test
  public void shoud_execute_thread_when_anonimity() {
    Thread thread = new Thread() {
      public void run() {
        System.out.println("MyThread running");
      }
    };
    thread.start();
  }

  @Test
  public void shoud_execute_runnable_when_anonimity() {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("MyRunnable running");
      }
    };
    Thread thread = new Thread(runnable);
    thread.start();
  }
}
