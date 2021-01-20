package com.frankieci.headfirst.template;

public abstract class CaffeineBeverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  protected abstract void brew();

  protected abstract void addCondiments();

  public void pourInCup() {

  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

}
