package com.frankieci.headfirst.composite;

import java.util.*;

public class CompositeIterator implements Iterator {

  Stack<Object> stack = new Stack<Object>();

  public CompositeIterator(Iterator iterator) {
    stack.push(iterator);
  }

  @Override
  public boolean hasNext() {
    if (stack.empty()) {
      return false;
    }
    Iterator iterator = (Iterator) stack.peek();
    if (!iterator.hasNext()) {
      stack.pop();
      return hasNext();
    }
    return true;
  }

  @Override
  public Object next() {
    if (hasNext()) {
      Iterator iterator = (Iterator) stack.peek();
      MenuComponent component = (MenuComponent) iterator.next();

      if (component instanceof Menu) {
        stack.push(component.createIterator());
      }
      return component;
    } else {
      return null;
    }
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
