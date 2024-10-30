package com.saaasssska.leasing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private long id;
    private String brand;
    private String model;
    private long vin;
    private boolean status;
    private CompanyDto company;
}
