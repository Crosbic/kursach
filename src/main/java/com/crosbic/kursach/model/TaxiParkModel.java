package com.crosbic.kursach.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaxiParkModel {
  private final ObservableList<Taxi> taxis;
  private final ObservableList<Order> orders;

  public TaxiParkModel() {
    taxis = FXCollections.observableArrayList();
    orders = FXCollections.observableArrayList();
  }

  public void addTaxi(Taxi taxi) {
    taxis.add(taxi);
  }

  public void removeTaxi(Taxi taxi) {
    taxis.remove(taxi);
  }

  public ObservableList<Taxi> getTaxis() {
    return taxis;
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  public ObservableList<Order> getOrders() {
    return orders;
  }
}
