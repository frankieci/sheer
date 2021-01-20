package com.frankieci.headfirst.factory;

public class SimplePizzaFactory extends PizzaStore {

  public Pizza createPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "cheese":
        pizza = new CheesePizza();
        break;
      case "pepperoni":
        pizza = new PepperoniPizza();
        break;
      case "clam":
        pizza = new ClamPizza();
        break;
      case "veggie":
        pizza = new VeggiePizza();
        break;
      default:
        throw new IllegalArgumentException("Don't find that what you want support");
    }
    return pizza;
  }
}
