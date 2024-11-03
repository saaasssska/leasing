package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.saaasssska.leasing.controller.CarController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class CarController {

    public static final String PATH = "/api/cars";
    public static final String ID_PATH = "/{id}";

    @Autowired
    private CarService carService;

    @GetMapping(ID_PATH)
    CarDto getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping
    Page<CarDto> getCars(Pageable pageable) {
        return carService.getAllCars(pageable);
    }

    @DeleteMapping(ID_PATH)
    void delete(@PathVariable Long id) {
        carService.deleteCar(id);
    }

    @GetMapping
    List<CarDto> getCarsByCompany(@RequestParam Long companyId) {
        return carService.getCarsByCompanyId(companyId);
    }

    @PostMapping
    Long create(@RequestBody CarDto carDto) {
        return carService.createCar(carDto);
    }



}
