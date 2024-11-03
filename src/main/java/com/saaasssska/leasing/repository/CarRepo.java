package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepo extends JpaRepository<Car, Long> {
    List<Car> findAllByCompany(Company company);
}
