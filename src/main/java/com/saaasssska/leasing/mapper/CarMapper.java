package com.saaasssska.leasing.mapper;

import com.saaasssska.leasing.dto.CarDto;
import com.saaasssska.leasing.entity.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toCarDto(Car car);
    Car toCar(CarDto carDto);
}
