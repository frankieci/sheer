package com.frankieci.headfirst.decorator;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    super.description = "House Blend Coffee";
    super.size = 13;
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
