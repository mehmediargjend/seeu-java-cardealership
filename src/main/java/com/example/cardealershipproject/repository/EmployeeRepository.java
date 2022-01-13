package com.example.cardealershipproject.repository;

import com.example.cardealershipproject.pojo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();
    Employee findEmployeeByEmployeeid(Integer employeeid);
}
