package com.saaasssska.leasing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeaseDto {
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CarDto car;
    private UserDto user;
}
