package com.crosbic.kursach.view;

import com.crosbic.kursach.model.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.util.List;


public class TaxiView extends VBox {

  private final ListView<Taxi> taxiListView;

  public TaxiView() {
    taxiListView = new ListView<>();
    getChildren().add(taxiListView);
    setSpacing(5);
    setPadding(new Insets(10, 10, 10, 10));
  }

  public void updateView(List<Taxi> taxis) {
    taxiListView.getItems().setAll(taxis);
  }

  public Taxi getSelectedTaxi() {
    return taxiListView.getSelectionModel().getSelectedItem();
  }
}
