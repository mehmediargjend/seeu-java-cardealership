package com.example.cardealershipproject.pojo.input;

public class CustomerInput {
    private Integer customerid;
    private String firstname, lastname, address;
    private Integer phonenr;

    // Constructors
    public CustomerInput() {}
    public CustomerInput(Integer customerid, String firstname, String lastname, String address, Integer phonenr) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phonenr = phonenr;
    }

    // Getters and setters
    public Integer getCustomerid() { return customerid; }
    public void setCustomerid(Integer customerid) { this.customerid = customerid; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Integer getPhonenr() { return phonenr; }
    public void setPhonenr(Integer phonenr) { this.phonenr = phonenr; }
}
