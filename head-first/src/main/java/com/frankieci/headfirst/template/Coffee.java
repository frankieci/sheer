package com.frankieci.headfirst.template;

public class Coffee extends CaffeineBeverage {

  @Override
  protected void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}
