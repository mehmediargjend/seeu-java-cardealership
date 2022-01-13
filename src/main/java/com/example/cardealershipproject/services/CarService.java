package com.example.cardealershipproject.services;

import com.example.cardealershipproject.pojo.entity.Car;
import com.example.cardealershipproject.pojo.input.CarInput;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car findCarByVin(Integer vin);
    List<Car> findCarsByBrand(String brand);
    List<Car> findCarsByModel(String model);
    List<Car> findCarsByYear(Integer year);
    Car insertCar(CarInput carInput);
    Car updateCar(CarInput carInput, Integer vin);
    Boolean deleteCar(Integer vin);
}
