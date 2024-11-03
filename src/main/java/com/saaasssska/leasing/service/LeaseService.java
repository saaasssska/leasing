package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;

import java.util.List;

public interface LeaseService {
    Long createLease(LeaseDto leaseDto);
    void deleteLease(Long id);
    void updateLease(LeaseDto leaseDto);
    LeaseDto getLeaseById(Long id);
    List<LeaseDto> getLeasesByUserId(Long id);
}
