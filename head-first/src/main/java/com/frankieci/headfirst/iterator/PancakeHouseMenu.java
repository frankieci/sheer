package com.frankieci.headfirst.iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{

  private List<MenuItem> menuItems;

  @Override
  public Iterator createIterator() {
    return new PancakeHouseIterator(menuItems);
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }
}
