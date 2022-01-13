package com.example.cardealershipproject.pojo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Sale")
public class Sale {
    @Id
    @Column(name = "invoicenr", nullable = false)
    private Integer invoicenr;

    @OneToOne
    @JoinColumn(name = "customerid")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "vin")
    private Car car;

   // Constructors
    public Sale() {
        this.invoicenr = 0;
        this.customer = new Customer();
        this.car = new Car();
    }
    public Sale(Integer invoicenr, Customer customer, Car car) {
        this.invoicenr = invoicenr;
        this.customer = customer;
        this.car = car;
    }

    // Getters and setters
    public Integer getInvoicenr() { return invoicenr; }
    public void setInvoicenr(Integer invoicenr) { this.invoicenr = invoicenr; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }
}


