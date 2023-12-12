package com.crosbic.kursach.controller;

import com.crosbic.kursach.model.*;
import com.crosbic.kursach.view.*;

  public class TaxiParkController {
    private final TaxiParkModel model;
    private final TaxiView view;

    public TaxiParkController(TaxiParkModel model, TaxiView view) {
      this.model = model;
      this.view = view;
      initializeListeners();
    }

    private void initializeListeners() {
      view.taxiListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        if (newValue != null) {
          updateOrderView();
        }
      });
    }

    public void addTaxiToPark(Taxi taxi) {
      model.addTaxi(taxi);
      updateTaxiView();
    }

    public void removeTaxiFromPark(Taxi taxi) {
      model.removeTaxi(taxi);
      updateTaxiView();
    }

    public void createOrder(String customerName) {
      Taxi selectedTaxi = view.getSelectedTaxi();
      if (selectedTaxi != null) {
        Order order = new Order(customerName, selectedTaxi);
        model.addOrder(order);
        updateOrderView();
      }
    }

    public void updateTaxiView() {
      view.updateTaxiView(model.getTaxis());
    }

    public void updateOrderView() {
      view.updateOrderView(model.getOrders());
    }
  }