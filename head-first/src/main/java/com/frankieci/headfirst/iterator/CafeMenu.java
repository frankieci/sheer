package com.frankieci.headfirst.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

  private Hashtable menuItems = new Hashtable();

  public CafeMenu() {
    addItem("Veggie burger and Air Fries",
        "Veggie burger on a whole whteat bun, lettuce, tomato, and fries",
        true, 3.99);
    addItem("Soup of the day","A cup of the soup of the day , with a side salad",
        false, 3.69);
    addItem("Burrito", "A large gurrito, with whole pinto beans, salsa,guacamole",
        true, 4.29);
  }

  @SuppressWarnings("unchecked")
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(menuItem.getName(), menuItem);
  }

  @Override
  public Iterator createIterator() {
    return menuItems.values().iterator();
  }
}
