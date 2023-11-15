package com.crosbic.kursach.controller;

import com.crosbic.kursach.model.*;
import com.crosbic.kursach.view.*;


public class TaxiParkController {
  private final TaxiParkModel model;
  private final TaxiView view;

  public TaxiParkController(TaxiParkModel model, TaxiView view) {
    this.model = model;
    this.view = view;
  }

  public void addTaxiToPark(Taxi taxi) {
    model.addTaxi(taxi);
    updateView();
  }

  public void removeTaxiFromPark(Taxi taxi) {
    model.removeTaxi(taxi);
    updateView();
  }

  public void updateView() {
    view.updateView(model.getTaxis());
  }
}
