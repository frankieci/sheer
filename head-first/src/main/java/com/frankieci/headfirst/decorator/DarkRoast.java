package com.frankieci.headfirst.decorator;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark Roast";
    size = 16;
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
