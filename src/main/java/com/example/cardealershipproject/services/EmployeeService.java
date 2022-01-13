package com.example.cardealershipproject.services;

import com.example.cardealershipproject.pojo.entity.Employee;
import com.example.cardealershipproject.pojo.input.EmployeeInput;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee findEmployeeByEmployeeid(Integer employeeid);
    Employee insertEmployee(EmployeeInput employeeInput);
    Employee updateEmployee(EmployeeInput employeeInput, Integer employeeid);
    Boolean deleteEmployee(Integer employeeid);
}
