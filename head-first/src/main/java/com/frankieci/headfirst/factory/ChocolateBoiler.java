package com.frankieci.headfirst.factory;

public class ChocolateBoiler {

  private volatile boolean empty;
  private volatile boolean boiled;

  private static ChocolateBoiler chocolateBoiler;

  private ChocolateBoiler() {

    empty = true;
    boiled = false;
  }

  public static synchronized ChocolateBoiler newInstance() {
    if (null == chocolateBoiler) {
      chocolateBoiler = new ChocolateBoiler();
    }
    return chocolateBoiler;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }

  public void crain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
