package com.crosbic.kursach.model;

import java.util.ArrayList;
import java.util.List;

public class TaxiParkModel {
  private final List<Taxi> taxis;

  public TaxiParkModel() {
    taxis = new ArrayList<>();
  }

  public void addTaxi(Taxi taxi) {
    taxis.add(taxi);
  }

  public void removeTaxi(Taxi taxi) {
    taxis.remove(taxi);
  }

  public List<Taxi> getTaxis() {
    return taxis;
  }
}
