package com.frankieci.headfirst.decorator;

public abstract class Beverage {

  public static final int TALL = 18;
  public static final int GRANDE = 16;
  public static final int VENTI = 10;

  protected String description = "Unknown Beverage";
  protected int size = 12;

  public String getDescription() {
    return description;
  }

  public int getSize() {
    return size;
  }

  public abstract double cost();
}
