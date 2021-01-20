package com.frankieci.headfirst.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

  private String name;

  private String description;

  private List<MenuComponent> menuComponents = new ArrayList<>();

  private Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.println("  " + getName());
    System.out.println("," + getDescription());
    System.out.println("   -------------");

    Iterator<MenuComponent> iterator = menuComponents.iterator();
    while (iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      menuComponent.print();
    }
  }

  public Iterator createIterator() {
    return new CompositeIterator(menuComponents.iterator());
  }
}
