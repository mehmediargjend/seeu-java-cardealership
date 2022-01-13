package com.example.cardealershipproject.pojo.input;

public class DealershipInput {
    private Integer dealershipid;
    private String city, address;

    // Constructors
    public DealershipInput() {}
    public DealershipInput(Integer dealershipid, String city, String address) {
        this.dealershipid = dealershipid;
        this.city = city;
        this.address = address;
    }

    // Getters and setters
    public Integer getDealershipid() { return dealershipid; }
    public void setDealershipid(Integer dealershipid) { this.dealershipid = dealershipid; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
