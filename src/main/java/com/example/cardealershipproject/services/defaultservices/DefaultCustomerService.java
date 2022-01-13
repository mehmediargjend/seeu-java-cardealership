package com.example.cardealershipproject.services.defaultservices;

import com.example.cardealershipproject.pojo.entity.Customer;
import com.example.cardealershipproject.pojo.input.CustomerInput;
import com.example.cardealershipproject.repository.CustomerRepository;
import com.example.cardealershipproject.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class DefaultCustomerService implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerByCustomerid(Integer customerid) {
        return customerRepository.findCustomerByCustomerid(customerid);
    }

    @Override
    public Customer insertCustomer(CustomerInput customerInput) {
        Customer customer = new Customer(customerInput.getCustomerid(), customerInput.getFirstname(),
                customerInput.getLastname(), customerInput.getAddress(), customerInput.getPhonenr());
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(CustomerInput customerInput, Integer customerid) {
        Customer customer = customerRepository.findCustomerByCustomerid(customerid);
        if (customer == null) { return null; }
        customer.setCustomerid(customerInput.getCustomerid());
        customer.setFirstname(customerInput.getFirstname());
        customer.setLastname(customerInput.getLastname());
        customer.setAddress(customerInput.getAddress());
        customer.setPhonenr(customerInput.getPhonenr());
        return customerRepository.save(customer);
    }

    @Override
    public Boolean deleteCustomer(Integer customerid) {
        Customer customer = customerRepository.findCustomerByCustomerid(customerid);
        if (customer != null) { customerRepository.delete(customer); }
        return true;
    }
}
