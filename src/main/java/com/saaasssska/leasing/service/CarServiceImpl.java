package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.mapper.CarMapper;
import com.saaasssska.leasing.repository.CarRepo;
import com.saaasssska.leasing.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public Long createCar(CarDto carDto) {
        Car car = carMapper.toCar(carDto);
        car.setCompany(companyRepo.findById(carDto.getCompany().getId()).orElseThrow());
        return carRepo.save(car).getId();
    }

    @Override
    public Long deleteCar(Long id) {
        carRepo.deleteById(id);
        return id;
    }

    @Override
    public CarDto getCarById(Long id) {
        return carMapper.toCarDto(carRepo.findById(id).orElseThrow());
    }

    @Override
    public Page<Car> getAllCar(Pageable pageable) {
        return carRepo.findAll(pageable).stream().map(carMapper::toCarDto);
    }

    @Override
    public Page<Car> getCarsByCompany(CompanyDto companyDto) {
        return null;
    }
}
