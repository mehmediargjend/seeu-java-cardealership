package com.example.cardealershipproject.repository;

import com.example.cardealershipproject.pojo.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
    List<Car> findAll();
    Car findCarByVin(Integer vin);
    List<Car> findCarsByBrand(String brand);
    List<Car> findCarsByModel(String model);
    List<Car> findCarsByYear(Integer year);
}
