package com.frankieci.headfirst.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Waitress {

  private Menu pancakeHouseMenu;
  private Menu dinerMenu;
  private Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
    initializeMenuItem();
  }

  private void initializeMenuItem() {
    MenuItem[] items = new MenuItem[]{
        new MenuItem("Vegetarian BLT ",
            "Bacon with lettuce & tomato on whole meat",
            true, 2.99)};
//    dinerMenu.setMenuItems(items);
    List<MenuItem> itemsList = new ArrayList<>();
    itemsList.add(new MenuItem("Regular Pancake Breakfast",
        "Pancakes with fried eggs, sausage",
        false, 3.66));
//    pancakeHouseMenu.setMenuItems(itemsList);
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinnerIterator = dinerMenu.createIterator();
    Iterator cafeIterator = cafeMenu.createIterator();
    System.out.println("MENU------BREAKFAST ");
    printMenu(pancakeIterator);
    System.out.println("MENU------DINNER ");
    printMenu(dinnerIterator);
    System.out.println("\nDINNER");
    printMenu(cafeIterator);
  }
  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName() + ", ");
      System.out.println(menuItem.getPrice() + ", ");
      System.out.println(menuItem.getDescription() + ", ");
    }
  }
}
