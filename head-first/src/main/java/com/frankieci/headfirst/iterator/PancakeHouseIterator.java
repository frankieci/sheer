package com.frankieci.headfirst.iterator;


import org.apache.commons.collections.CollectionUtils;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator {

  private int itemIndex = 0;
  private int size;

  private List<MenuItem> menuItems;

  public PancakeHouseIterator(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
    computeItemSize();
  }

  private void computeItemSize() {
    size = menuItems.size();
  }

  @Override
  public boolean hasNext() {
    if (itemIndex >= size || CollectionUtils.isEmpty(menuItems)) {
      return false;
    }
    return true;
  }

  @Override
  public Object next() {
    MenuItem menuItem = menuItems.get(itemIndex);
    itemIndex = itemIndex + 1;
    return menuItem;
  }
}
