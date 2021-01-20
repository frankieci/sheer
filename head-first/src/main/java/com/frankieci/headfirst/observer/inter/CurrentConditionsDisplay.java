package com.frankieci.headfirst.observer.inter;

import com.frankieci.headfirst.observer.DisplayElement;
import com.frankieci.headfirst.observer.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;

  private Subject weatherData;
  private Observable observable;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("Current conditions:" + temperature +
        "F degrees and " + humidity + "% humidity");
  }
}
