package com.saaasssska.leasing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeaseDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private CarDto car;
    private UserDto user;
}
