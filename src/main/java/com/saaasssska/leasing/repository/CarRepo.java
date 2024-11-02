package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
    Page<Car> findAllByCompany(Long id, Pageable pageable);
}
