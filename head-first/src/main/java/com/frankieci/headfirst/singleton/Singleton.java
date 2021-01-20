package com.frankieci.headfirst.singleton;

public class Singleton {

  private Singleton() {
  }

  private static class UniqueInstance {
    private static final Singleton INSTANCE = new Singleton();
  }

  //饿汉式
  public static Singleton getInstance() {
    return UniqueInstance.INSTANCE;
  }
}
