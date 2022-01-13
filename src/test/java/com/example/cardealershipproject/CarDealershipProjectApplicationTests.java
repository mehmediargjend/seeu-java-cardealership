package com.example.cardealershipproject;

import com.example.cardealershipproject.pojo.entity.*;
import com.example.cardealershipproject.repository.*;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarDealershipProjectApplicationTests {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DealershipRepository dealershipRepository;

    @Autowired
    private SaleRepository saleRepository;

    // Car Tests
    @Test
    @Order(1)
    public void testCreateCar() {
        Car car = new Car(999, "Ford", "Mustang", 2018);
        carRepository.save(car);
        assertNotNull(carRepository.findCarByVin(999));
    }

    @Test
    @Order(2)
    public void testAttributeCar() {
        Car car = carRepository.findCarByVin(999);
        assertEquals(2018, car.getYear());
    }

    @Test
    @Order(3)
    public void testUpdateCar() {
        Car car = carRepository.findCarByVin(999);
        car.setModel("F150");
        carRepository.save(car);
        assertNotEquals("Mustang", carRepository.findCarByVin(999).getModel());
    }

    @Test
    @Order(4)
    public void testDeleteCar() {
        Car car = carRepository.findCarByVin(999);
        carRepository.delete(car);
        assertNull(carRepository.findCarByVin(999));
    }

    // Customer Tests
    @Test
    @Order(5)
    public void testCreateCustomer() {
        Customer customer = new Customer(10, "Argjend", "Mehmedi", "Kumanovo", 70987654);
        customerRepository.save(customer);
        assertNotNull(customerRepository.findCustomerByCustomerid(10));
    }

    @Test
    @Order(6)
    public void testAttributeCustomer() {
        Customer customer = customerRepository.findCustomerByCustomerid(10);
        assertEquals("Mehmedi", customer.getLastname());//
    }

    @Test
    @Order(7)
    public void testUpdateCustomer() {
        Customer customer = customerRepository.findCustomerByCustomerid(10);
        customer.setPhonenr(70514014);
        customerRepository.save(customer);
        assertNotEquals(70987654, customerRepository.findCustomerByCustomerid(10).getPhonenr());
    }

    @Test
    @Order(8)
    public void testDeleteCustomer() {
        Customer customer = customerRepository.findCustomerByCustomerid(10);
        customerRepository.delete(customer);
        assertNull(customerRepository.findCustomerByCustomerid(10));
    }

    // Dealership Tests
    @Test
    @Order(9)
    public void testCreateDealership() {
        Dealership dealership = new Dealership(5, "Tetovo", "JPA");
        dealershipRepository.save(dealership);
        assertNotNull(dealershipRepository.findDealershipByDealershipid(5));
    }

    @Test
    @Order(10)
    public void testAttributeDealership() {
        Dealership dealership = dealershipRepository.findDealershipByDealershipid(5);
        assertEquals("Tetovo", dealership.getCity());
    }

    @Test
    @Order(11)
    public void testUpdateDealership() {
        Dealership dealership = dealershipRepository.findDealershipByDealershipid(5);
        dealership.setAddress("BB");
        dealershipRepository.save(dealership);
        assertNotEquals("JPA", dealershipRepository.findDealershipByDealershipid(5).getAddress());
    }

    @Test
    @Order(12)
    public void testDeleteDealership() {
        Dealership dealership = dealershipRepository.findDealershipByDealershipid(5);
        dealershipRepository.delete(dealership);
        assertNull(dealershipRepository.findDealershipByDealershipid(5));
    }

    // Employee Tests
    @Test
    @Order(13)
    public void testCreateEmployee() {
        Employee employee = new Employee(10, "Michael", "Schumacher");
        employeeRepository.save(employee);
        assertNotNull(employeeRepository.findEmployeeByEmployeeid(10));
    }

    @Test
    @Order(14)
    public void testAttributeEmployee() {
        Employee employee = employeeRepository.findEmployeeByEmployeeid(10);
        assertEquals(10, employee.getEmployeeid());
    }

    @Test
    @Order(15)
    public void testUpdateEmployee() {
        Employee employee = employeeRepository.findEmployeeByEmployeeid(10);
        employee.setFirstname("Lewis");
        employeeRepository.save(employee);
        assertNotEquals("Michael", employeeRepository.findEmployeeByEmployeeid(10).getFirstname());
    }

    @Test
    @Order(16)
    public void testDeleteEmployee() {
        Employee employee = employeeRepository.findEmployeeByEmployeeid(10);
        employeeRepository.delete(employee);
        assertNull(employeeRepository.findEmployeeByEmployeeid(10));
    }

    // Sale Tests
    @Test
    @Order(17)
    public void testCreateSale() {
        Car car = new Car(1, "GM", "Camaro", 2018);
        carRepository.save(car);
        Customer customer = new Customer(12, "Argjend", "Mehmedi", "Kumanovo", 70987654);
        customerRepository.save(customer);
        Sale sale = new Sale(1234, customer, car);
        saleRepository.save(sale);
        assertNotNull(saleRepository.findSaleByInvoicenr(1234));
    }

    @Test
    @Order(18)
    public void testAttributeSale() {
        Sale sale = saleRepository.findSaleByInvoicenr(1234);
        assertEquals(1, sale.getCar().getVin());
    }

    @Test
    @Order(19)
    public void testDeleteSale() {
        Sale sale = saleRepository.findSaleByInvoicenr(1234);
        saleRepository.delete(sale);
        Car car = carRepository.findCarByVin(1);
        carRepository.delete(car);
        Customer customer = customerRepository.findCustomerByCustomerid(12);
        customerRepository.delete(customer);
        assertNull(saleRepository.findSaleByInvoicenr(1234));
    }
}
