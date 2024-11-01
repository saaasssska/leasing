package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Car;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface CarService {
    Long createCar(CarDto carDto);
    Long deleteCar(Long id);
    Long updateCar(CarDto carDto);
    CarDto getCarById(Long id);
    Page<Car> getAllCar(Pageable pageable);
    Page<Car> getCarsByCompany(CompanyDto companyDto);
}
