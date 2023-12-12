package com.crosbic.kursach.model;

public class Taxi {
  private final String brand;
  private final String model;
  private final String licensePlate;

  public Taxi(String brand, String model, String licensePlate) {
    this.brand = brand;
    this.model = model;
    this.licensePlate = licensePlate;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  @Override
  public String toString() {
    return "Brand: " + brand + " | Model: " + model + " | License Plate: " + licensePlate;
  }
}
