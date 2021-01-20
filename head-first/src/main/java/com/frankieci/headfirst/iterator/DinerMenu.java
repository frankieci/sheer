package com.frankieci.headfirst.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{

  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;

  private MenuItem[] menuItems;

  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }

  public void setMenuItems(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }
}
