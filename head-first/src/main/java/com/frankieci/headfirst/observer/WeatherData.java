package com.frankieci.headfirst.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

  private float temperature;
  private float humidity;
  private float pressure;

  private ArrayList<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int index = observers.indexOf(observer);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObservers() {
    for (int i = 0, size = observers.size(); i < size; i++) {
      Observer observer = observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
