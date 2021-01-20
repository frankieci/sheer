package com.frankieci.headfirst.decorator;

public class Mocha extends CondimentDecorator {

  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public int getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    return 20 + beverage.cost();
  }
}
