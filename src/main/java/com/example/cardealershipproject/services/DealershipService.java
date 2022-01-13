package com.example.cardealershipproject.services;

import com.example.cardealershipproject.pojo.entity.Dealership;
import com.example.cardealershipproject.pojo.input.DealershipInput;
import java.util.List;

public interface DealershipService {
    List<Dealership> getAllDealerships();
    Dealership findDealershipByDealershipid(Integer dealershipid);
    List<Dealership> findDealershipsByCity(String city);
    Dealership insertDealership(DealershipInput dealershipInput);
    Dealership updateDealership(DealershipInput dealershipInput, Integer dealershipid);
    Boolean deleteDealership(Integer dealershipid);
}
