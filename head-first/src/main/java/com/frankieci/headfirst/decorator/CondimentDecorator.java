package com.frankieci.headfirst.decorator;

public abstract class CondimentDecorator extends Beverage {

  public abstract String getDescription();

  public abstract int getSize();

  @Override
  public double cost() {
    return 0;
  }
}
