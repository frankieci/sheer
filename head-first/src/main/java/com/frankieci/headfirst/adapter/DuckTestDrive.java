package com.frankieci.headfirst.adapter;

public class DuckTestDrive {

  public static void main(String[] args) {
    Turkey turkey = new WildTurkey();
    System.out.println("The Turkey says ...");
    turkey.gobble();
    turkey.fly();

    Duck duck = new MallardDuck();
    System.out.println("The Duck says ...");
    testDuck(duck);

    Duck adapter = new TurkeyAdapter(turkey);
    System.out.println("The TurkeyDuck says ...");
    testDuck(adapter);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
