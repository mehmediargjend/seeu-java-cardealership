package com.example.cardealershipproject.services.defaultservices;

import com.example.cardealershipproject.pojo.entity.Dealership;
import com.example.cardealershipproject.pojo.input.DealershipInput;
import com.example.cardealershipproject.repository.DealershipRepository;
import com.example.cardealershipproject.services.DealershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DefaultDealershipService implements DealershipService {
    @Autowired
    private DealershipRepository dealershipRepository;

    @Override
    public List<Dealership> getAllDealerships() {
        return dealershipRepository.findAll();
    }

    @Override
    public Dealership findDealershipByDealershipid(Integer dealershipid) {
        return dealershipRepository.findDealershipByDealershipid(dealershipid);
    }

    @Override
    public List<Dealership> findDealershipsByCity(String city) {
        return dealershipRepository.findDealershipsByCity(city);
    }

    @Override
    public Dealership insertDealership(DealershipInput dealershipInput) {
        Dealership dealership = new Dealership(dealershipInput.getDealershipid(), dealershipInput.getCity(), dealershipInput.getAddress());
        return dealershipRepository.save(dealership);
    }

    @Override
    public Dealership updateDealership(DealershipInput dealershipInput, Integer dealershipid) {
        Dealership dealership = dealershipRepository.findDealershipByDealershipid(dealershipid);
        if (dealership == null) { return null; }
        dealership.setDealershipid(dealershipInput.getDealershipid());
        dealership.setCity(dealershipInput.getCity());
        dealership.setAddress(dealershipInput.getAddress());
        return dealershipRepository.save(dealership);
    }

    @Override
    public Boolean deleteDealership( Integer dealershipid) {
        Dealership dealership = dealershipRepository.findDealershipByDealershipid(dealershipid);
        if (dealership != null) { dealershipRepository.delete(dealership); }
        return true;
    }
}
