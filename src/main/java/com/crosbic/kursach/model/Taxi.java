package com.crosbic.kursach.model;

public record Taxi(String brand, String model, String licensePlate) {

  @Override
  public String toString() {
    return "Марка: " + brand + " | Модель: " + model + " | Номерной знак: " + licensePlate;
  }
}
