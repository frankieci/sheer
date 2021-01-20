package com.frankieci.headfirst.decorator;

public class Whip extends CondimentDecorator {

  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", whip";
  }

  @Override
  public int getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    return 30 + beverage.cost();
  }
}
