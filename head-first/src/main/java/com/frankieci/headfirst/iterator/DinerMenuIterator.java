package com.frankieci.headfirst.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

  private int position = 0;
  private int length;

  private MenuItem[] items;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
    computeItemLength();
  }

  private void computeItemLength() {
    length = items.length;
  }

  @Override
  public boolean hasNext() {
    if (position >= length || null == items[position]) {
      return false;
    }
    return true;
  }

  @Override
  public Object next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException("You can't remove an item until you've done at least one next()");
    }

    if (null != items[position - 1]) {
      for (int i = position - 1; i < (length - 1); i++) {
        items[i] = items[i + 1];
      }
      items[length - 1] = null;
    }
  }
}
