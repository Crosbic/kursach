package com.crosbic.kursach.view;

import com.crosbic.kursach.model.*;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.util.List;


public class TaxiView extends VBox {
  public final ListView<Taxi> taxiListView;
  private final ListView<Order> orderListView;

  public TaxiView() {
    taxiListView = new ListView<>();
    orderListView = new ListView<>();

    getChildren().addAll(new Label("Автомобили"), taxiListView, new Label("Заказы"), orderListView);
    setSpacing(5);
    setPadding(new Insets(10, 10, 10, 10));
  }

  public void updateTaxiView(List<Taxi> taxis) {
    taxiListView.setItems(FXCollections.observableArrayList(taxis));
  }

  public void updateOrderView(List<Order> orders) {
    orderListView.setItems(FXCollections.observableArrayList(orders));
  }

  public Taxi getSelectedTaxi() {
    return taxiListView.getSelectionModel().getSelectedItem();
  }
}
