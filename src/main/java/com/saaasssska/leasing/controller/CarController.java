package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.repository.CarRepo;
import com.saaasssska.leasing.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.CarController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class CarController {

    public static final String PATH = "/api/cars";
    public static final String ID_PATH = "/{id}";

    @Autowired
    private CarService carService;
    @Autowired
    private CarRepo carRepo;

    @GetMapping(ID_PATH)
    CarDto getCarById(@RequestParam Long id) {
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

}
