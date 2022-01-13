package com.example.cardealershipproject.controller;

import com.example.cardealershipproject.pojo.entity.Car;
import com.example.cardealershipproject.pojo.input.CarInput;
import com.example.cardealershipproject.services.defaultservices.DefaultCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private DefaultCarService carService;

    // GET Request - Receive all car instances
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    /**
     * GET Request - Receive the car with a specific VIN
     * @param vin - VIN of the car
     * @return - The car with that VIN
     */
    @GetMapping("/cars/{vin}")
    public Car findCarByVin(@PathVariable Integer vin) {
        return carService.findCarByVin(vin);
    }

    /**
     * GET Request - Receive all cars based on brand
     * @param brand - Brand of the car
     * @return - All cars with that brand
     */
    @GetMapping("/cars/brands/{brand}")
    public List<Car> findCarsByBrand(@PathVariable String brand) {
        return carService.findCarsByBrand(brand);
    }

    /**
     * GET Request - Receive all cars based on model
     * @param model - Model of the car
     * @return - All cars with that model
     */
    @GetMapping("/cars/models/{model}")
    public List<Car> findCarsByModel(@PathVariable String model) {
        return carService.findCarsByModel(model);
    }

    /**
     * GET Request - Receive all cars of that year
     * @param year - Year of the car
     * @return - All cars from that year
     */
    @GetMapping("/cars/year/{year}")
    public List<Car> findCarsByYear(@PathVariable Integer year) {
        return carService.findCarsByYear(year);
    }

    /**
     * POST Request - Input a Car instance
     * @param carInput - The JSON body containing the required data
     * @return - A new instance
     */
    @PostMapping("/cars")
    public Car insertCar(@RequestBody CarInput carInput) {
        return carService.insertCar(carInput);
    }

    /**
     * PUT Request - Update a Car instance
     * @param carInput - The JSON body containing the updated data
     * @param vin - VIN of the car, to identify which car we want to update
     * @return - A updated instance with the updated data
     */
    @PutMapping("/cars/{vin}")
    public Car updateCar(@RequestBody CarInput carInput, @PathVariable Integer vin) {
        return carService.updateCar(carInput, vin);
    }

    /**
     * DELETE Request - Delete a Car instance
     * @param vin - VIN of the car, to identify which car to delete
     * @return - true if instance has been deleted
     */
    @DeleteMapping("/cars/{vin}")
    public Boolean deleteCar(@PathVariable Integer vin) {
        return carService.deleteCar(vin);
    }
}
