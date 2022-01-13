package com.example.cardealershipproject.services;

import com.example.cardealershipproject.pojo.entity.Customer;
import com.example.cardealershipproject.pojo.input.CustomerInput;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer findCustomerByCustomerid(Integer customerid);
    Customer insertCustomer(CustomerInput customerInput);
    Customer updateCustomer(CustomerInput customerInput, Integer customerid);
    Boolean deleteCustomer(Integer customerid);
}
