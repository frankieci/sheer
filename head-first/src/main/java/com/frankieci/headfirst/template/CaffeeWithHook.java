package com.frankieci.headfirst.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaffeeWithHook extends CaffeineBeverageWithHook {

  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding Suger and Milk");
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = null;
    System.out.println("Would you like milk and sugar with your coffe (y/n). ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = reader.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer.");
    }
    return null == answer ? "no" : answer;
  }
}
