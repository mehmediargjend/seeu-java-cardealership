package com.example.cardealershipproject.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "employeeid", nullable = false)
    private Integer employeeid;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    // Constructors
    public Employee() {
        this.employeeid = 0;
        this.firstname = "N/A";
        this.lastname = "N/A";
    }
    public Employee(Integer employeeid, String firstname, String lastname) {
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters and setters
    public Integer getEmployeeid() { return employeeid; }
    public void setEmployeeid(Integer employeeid) { this.employeeid = employeeid; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
}

