package com.example.cardealershipproject.pojo.input;

public class EmployeeInput {
    private Integer employeeid;
    private String firstname, lastname;

    // Constructors
    public EmployeeInput() {}
    public EmployeeInput(Integer employeeid, String firstname, String lastname) {
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
