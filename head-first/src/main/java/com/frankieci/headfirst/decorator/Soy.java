package com.frankieci.headfirst.decorator;

public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public int getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    double cost = beverage.cost();
    int size = getSize();
    if (size == TALL) {
      cost += 1.8;
    } else if (size == GRANDE) {
      cost += 1.6;
    } else if (size == VENTI) {
      cost += 1.0;
    }
    return cost;
  }
}
