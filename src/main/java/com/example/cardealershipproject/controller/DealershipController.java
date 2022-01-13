package com.example.cardealershipproject.controller;

import com.example.cardealershipproject.pojo.entity.Dealership;
import com.example.cardealershipproject.pojo.input.DealershipInput;
import com.example.cardealershipproject.services.defaultservices.DefaultDealershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DealershipController {
    @Autowired
    private DefaultDealershipService dealershipService;

    @GetMapping("/dealerships")
    public List<Dealership> getAllDealerships() {
        return dealershipService.getAllDealerships();
    }

    @GetMapping("/dealerships/{dealershipid}")
    public Dealership findDealershipByDealershipid(@PathVariable Integer dealershipid) {
        return dealershipService.findDealershipByDealershipid(dealershipid);
    }

    @GetMapping("/dealerships/city/{city}")
    public List<Dealership> findDealershipsByCity(@PathVariable String city) {
        return dealershipService.findDealershipsByCity(city);
    }

    @PostMapping("/dealerships")
    public Dealership insertDealership(@RequestBody DealershipInput dealershipInput) {
        return dealershipService.insertDealership(dealershipInput);
    }

    @PutMapping("/dealerships/{dealershipid}")
    public Dealership updateDealership(@RequestBody DealershipInput dealershipInput, @PathVariable Integer dealershipid) {
        return dealershipService.updateDealership(dealershipInput, dealershipid);
    }

    @DeleteMapping("/dealerships/{dealershipid}")
    public Boolean deleteDealership(@PathVariable Integer dealershipid) {
        return dealershipService.deleteDealership(dealershipid);
    }
}
