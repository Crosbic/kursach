package com.crosbic.kursach;

import com.crosbic.kursach.model.*;
import com.crosbic.kursach.view.*;
import com.crosbic.kursach.controller.*;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaxiParkApp extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Taxi Park");

        TaxiParkModel taxiParkModel = new TaxiParkModel();
        TaxiView taxiView = new TaxiView();
        TaxiParkController taxiParkController = new TaxiParkController(taxiParkModel, taxiView);

        TextField brandTextField = new TextField();
        brandTextField.setPromptText("Марка");
        TextField modelTextField = new TextField();
        modelTextField.setPromptText("Модель");
        TextField licensePlateTextField = new TextField();
        licensePlateTextField.setPromptText("Номерной знак");

        Button addButton = new Button("Добавить такси");
        addButton.setOnAction(e -> {
            String brand = brandTextField.getText();
            String model = modelTextField.getText();
            String licensePlate = licensePlateTextField.getText();

            Taxi newTaxi = new Taxi(brand, model, licensePlate);
            taxiParkController.addTaxiToPark(newTaxi);

            brandTextField.clear();
            modelTextField.clear();
            licensePlateTextField.clear();
        });

        Button removeButton = new Button("Удалить такси");
        removeButton.setOnAction(e -> {
            Taxi selectedTaxi = taxiView.getSelectedTaxi();
            if (selectedTaxi != null) {
                taxiParkController.removeTaxiFromPark(selectedTaxi);
            }
        });

        VBox inputLayout = new VBox(10);
        inputLayout.setPadding(new Insets(10, 10, 10, 10));
        inputLayout.getChildren().addAll(brandTextField, modelTextField, licensePlateTextField, addButton, removeButton);

        HBox layout = new HBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(inputLayout, taxiView);

        Scene scene = new Scene(layout, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}