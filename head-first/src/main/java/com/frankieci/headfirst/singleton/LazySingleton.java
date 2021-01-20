package com.frankieci.headfirst.singleton;

public class LazySingleton {

  private volatile static LazySingleton instance = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (null == instance) {
      synchronized (LazySingleton.class) {
        if (null == instance) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }
}
