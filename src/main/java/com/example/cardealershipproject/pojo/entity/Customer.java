package com.example.cardealershipproject.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "customerid", nullable = false)
    private Integer customerid;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "address")
    private String address;

    @Column(name = "phonenr")
    private Integer phonenr;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.MERGE)
    @JsonBackReference
    private List<Sale> sales;

    // Constructors
    public Customer() {
        this.customerid = 0;
        this.firstname = "N/A";
        this.lastname = "N/A";
        this.address = "N/A";
        this.phonenr = 0;
    }
    public Customer(Integer customerid, String firstname, String lastname, String address, Integer phonenr) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phonenr = phonenr;
    }

    // Getters and setters
    public Integer getCustomerid() { return customerid; }
    public void setCustomerid(int id) { this.customerid = id; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Integer getPhonenr() { return phonenr; }
    public void setPhonenr(int phonenr) { this.phonenr = phonenr; }
}
