package com.example.cardealershipproject.controller;

import com.example.cardealershipproject.pojo.entity.Customer;
import com.example.cardealershipproject.pojo.input.CustomerInput;
import com.example.cardealershipproject.services.defaultservices.DefaultCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private DefaultCustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{customerid}")
    public Customer findCustomerById(@PathVariable Integer customerid) {
        return customerService.findCustomerByCustomerid(customerid);
    }

    @PostMapping("/customers")
    public Customer insertCustomer(@RequestBody CustomerInput customerInput) {
        return customerService.insertCustomer(customerInput);
    }

    @PutMapping("/customers/{customerid}")
    public Customer updateCustomer(@RequestBody CustomerInput customerInput, @PathVariable Integer customerid) {
        return customerService.updateCustomer(customerInput, customerid);
    }

    @DeleteMapping("/customers/{customerid}")
    public Boolean deleteCustomer(@PathVariable Integer customerid) {
        return customerService.deleteCustomer(customerid);
    }
}