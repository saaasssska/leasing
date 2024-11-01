package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
