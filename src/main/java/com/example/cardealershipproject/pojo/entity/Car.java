package com.example.cardealershipproject.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
@Table(name = "Car")
public class Car {
    @Id
    @Column(name = "vin", nullable = false)
    private Integer vin;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "car", cascade = CascadeType.MERGE)
    @JsonBackReference
    private List<Sale> sales;

    // Constructors
    public Car() {
        this.vin = 0;
        this.brand = "N/A";
        this.model = "N/A";
        this.year = 0;
    }
    public Car(int vin, String brand, String model, int year) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public Integer getVin() { return vin; }
    public void setVin(Integer vin) { this.vin = vin; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
}
