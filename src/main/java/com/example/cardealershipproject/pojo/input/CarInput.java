package com.example.cardealershipproject.pojo.input;

public class CarInput {
    private Integer vin, year;
    private String brand, model;

    // Constructors
    public CarInput() { }
    public CarInput(Integer vin, Integer year, String brand, String model) {
        this.vin = vin;
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters
    public Integer getVin() { return vin; }
    public void setVin(Integer vin) { this.vin = vin; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
