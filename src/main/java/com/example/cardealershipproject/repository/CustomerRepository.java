package com.example.cardealershipproject.repository;

import com.example.cardealershipproject.pojo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
    Customer findCustomerByCustomerid(Integer customerid);
}
