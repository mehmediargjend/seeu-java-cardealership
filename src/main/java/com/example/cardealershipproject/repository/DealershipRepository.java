package com.example.cardealershipproject.repository;

import com.example.cardealershipproject.pojo.entity.Dealership;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DealershipRepository extends CrudRepository<Dealership, Integer> {
    List<Dealership> findAll();
    Dealership findDealershipByDealershipid(Integer dealershipid);
    List<Dealership> findDealershipsByCity(String city);
}
