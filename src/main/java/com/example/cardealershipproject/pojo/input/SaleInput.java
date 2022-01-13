package com.example.cardealershipproject.pojo.input;

import com.example.cardealershipproject.pojo.entity.Car;
import com.example.cardealershipproject.pojo.entity.Customer;
import com.example.cardealershipproject.pojo.entity.Employee;

public class SaleInput {
    private Integer invoicenr;
    private Employee employee;
    private Customer customer;
    private Car car;

    // Constructors
    public SaleInput() {}
    public SaleInput(Integer invoicenr, Employee employee, Customer customer, Car car) {
        this.invoicenr = invoicenr;
        this.employee = employee;
        this.customer = customer;
        this.car = car;
    }

    // Getters and setters
    public Integer getInvoicenr() { return invoicenr; }
    public void setInvoicenr(Integer invoicenr) { this.invoicenr = invoicenr; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }
}
