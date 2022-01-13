package com.example.cardealershipproject.services.defaultservices;

import com.example.cardealershipproject.pojo.entity.Car;
import com.example.cardealershipproject.pojo.input.CarInput;
import com.example.cardealershipproject.repository.CarRepository;
import com.example.cardealershipproject.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Service
public class DefaultCarService implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() { return carRepository.findAll(); }

    @Override
    public Car findCarByVin(Integer vin) {
        return carRepository.findCarByVin(vin);
    }

    @Override
    public List<Car> findCarsByBrand(String brand) {
        return carRepository.findCarsByBrand(brand);
    }

    @Override
    public List<Car> findCarsByModel(String model) {
        return carRepository.findCarsByModel(model);
    }

    @Override
    public List<Car> findCarsByYear(Integer year) {
        return carRepository.findCarsByYear(year);
    }

    @Override
    public Car insertCar(CarInput carInput) {
        Car car = new Car(carInput.getVin(), carInput.getBrand(), carInput.getModel(), carInput.getYear());
        return carRepository.save(car);
    }

    /**
     * Method to update data in a Car instance
     * @param carInput - instance with new data
     * @param vin - VIN of the car we want to update
     * @return - saves new data to the existing car instance
     */
    @Override
    public Car updateCar(CarInput carInput, Integer vin) {
        Car car = carRepository.findCarByVin(vin);
        if (car == null) { return null; }
        car.setVin(carInput.getVin());
        car.setBrand(carInput.getBrand());
        car.setModel(carInput.getModel());
        car.setYear(carInput.getYear());
        return carRepository.save(car);
    }

    /**
     * Method to remove a Car instance from the database
     * If the instance is not null, we proceed to delete it.
     * @param vin - VIN of the car we want to delete
     * @return - true when deleted
     */
    @Override
    public Boolean deleteCar(Integer vin) {
        Car car = carRepository.findCarByVin(vin);
        if (car != null) { carRepository.delete(car); }
        return true;
    }
}
