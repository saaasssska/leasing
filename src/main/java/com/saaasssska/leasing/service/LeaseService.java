package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LeaseService {
    Long createLease(LeaseDto leaseDto);
    Long deleteLease(Long id);
    Long updateLease(LeaseDto leaseDto);
    LeaseDto getLeaseById(Long id);
    Page<LeaseDto> getLeasesByUser(UserDto userDto, Pageable pageable);
}
