package com.example.cardealershipproject.services.defaultservices;

import com.example.cardealershipproject.pojo.entity.Employee;
import com.example.cardealershipproject.pojo.input.EmployeeInput;
import com.example.cardealershipproject.repository.EmployeeRepository;
import com.example.cardealershipproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DefaultEmployeeService implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeByEmployeeid(Integer employeeid) {
        return employeeRepository.findEmployeeByEmployeeid(employeeid);
    }

    @Override
    public Employee insertEmployee(EmployeeInput employeeInput) {
        Employee employee = new Employee(employeeInput.getEmployeeid(), employeeInput.getFirstname(), employeeInput.getLastname());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(EmployeeInput employeeInput, Integer employeeid) {
        Employee employee = employeeRepository.findEmployeeByEmployeeid(employeeid);
        if (employee == null) { return null; }
        employee.setEmployeeid(employeeInput.getEmployeeid());
        employee.setFirstname(employeeInput.getFirstname());
        employee.setLastname(employeeInput.getLastname());
        return employeeRepository.save(employee);
    }

    @Override
    public Boolean deleteEmployee(Integer employeeid) {
        Employee employee = employeeRepository.findEmployeeByEmployeeid(employeeid);
        if (employee != null) { employeeRepository.delete(employee); }
        return true;
    }
}
