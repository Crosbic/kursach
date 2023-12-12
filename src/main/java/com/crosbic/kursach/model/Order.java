package com.crosbic.kursach.model;

public record Order(String customerName, Taxi taxi) {

    @Override
    public String toString() {
        return "Имя заказчика: " + customerName + " | Авто: " + taxi.getBrand() + " " + taxi.getModel() + " " + taxi.getLicensePlate();
    }
}
