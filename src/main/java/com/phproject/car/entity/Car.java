package com.phproject.car.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Car {
    @Id
    @Column(name = "tb_placa")
    private String placa;
    @Column(name = "tb_model")
    private String model;
    @Column(name = "tb_year")
    private int year;
    @Column(name = "tb_color")
    private String color;

    public Car() {
    }

    public Car(String placa, String model, String color, int year) {
        this.placa = placa;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
