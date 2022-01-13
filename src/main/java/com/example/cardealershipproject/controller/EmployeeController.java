package com.example.cardealershipproject.controller;

import com.example.cardealershipproject.pojo.entity.Employee;
import com.example.cardealershipproject.pojo.input.EmployeeInput;
import com.example.cardealershipproject.services.defaultservices.DefaultEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private DefaultEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeid}")
    public Employee findEmployeeByEmployeeid(@PathVariable Integer employeeid) {
        return employeeService.findEmployeeByEmployeeid(employeeid);
    }

    @PostMapping("/employees")
    public Employee insertEmployee(@RequestBody EmployeeInput employeeInput) {
        return employeeService.insertEmployee(employeeInput);
    }

    @PutMapping( "/employees/{employeeid}")
    public Employee updateEmployee(@RequestBody EmployeeInput employeeInput, @PathVariable Integer employeeid) {
        return employeeService.updateEmployee(employeeInput, employeeid);
    }

    @DeleteMapping("/employees/{employeeid}")
    public Boolean deleteEmployee(@PathVariable Integer employeeid) {
        return employeeService.deleteEmployee(employeeid);
    }
}
