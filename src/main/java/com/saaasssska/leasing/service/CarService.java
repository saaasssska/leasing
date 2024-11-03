package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CarDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarService {
    Long createCar(CarDto carDto);
    void deleteCar(Long id);
    CarDto getCarById(Long id);
    Page<CarDto> getAllCars(Pageable pageable);
    List<CarDto> getCarsByCompanyId(Long id);
}
