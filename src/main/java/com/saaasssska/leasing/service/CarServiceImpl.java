package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.entity.Company;
import com.saaasssska.leasing.mapper.CarMapper;
import com.saaasssska.leasing.repository.CarRepo;
import com.saaasssska.leasing.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void deleteCar(Long id) {
        carRepo.deleteById(id);
    }

    @Override
    public CarDto getCarById(Long id) {
        return carMapper.toCarDto(carRepo.findById(id).orElseThrow());
    }

    @Override
    public Page<CarDto> getAllCars(Pageable pageable) {
        return carRepo.findAll(pageable).map(carMapper::toCarDto);
    }

    @Override
    public List<CarDto> getCarsByCompanyId(Long id) {
        Company company = companyRepo.findById(id).orElseThrow();
        return carRepo.findAllByCompany(company).stream().map(carMapper::toCarDto).toList();
    }

}
