package com.example.cardealershipproject.pojo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Dealership")
public class Dealership {
    @Id
    @Column(name = "dealershipid", nullable = false)
    private Integer dealershipid;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    // Constructors
    public Dealership() {
        this.dealershipid = 0;
        this.city = "N/A";
        this.address = "N/A";
    }
    public Dealership(Integer dealershipid, String city, String address) {
        this.dealershipid = dealershipid;
        this.city = city;
        this.address = address;
    }

    // Getters and setters
    public int getDealershipid() { return dealershipid; }
    public void setDealershipid(Integer dealershipid) { this.dealershipid = dealershipid; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
