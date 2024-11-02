package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.dto.CompanyDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Long createCar(CarDto carDto);
    Long deleteCar(Long id);
    CarDto getCarById(Long id);
    Page<CarDto> getAllCar(Pageable pageable);
    Page<CarDto> getCarsByCompany(CompanyDto companyDto, Pageable pageable);
}
