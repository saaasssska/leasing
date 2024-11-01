package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Long> {
}
