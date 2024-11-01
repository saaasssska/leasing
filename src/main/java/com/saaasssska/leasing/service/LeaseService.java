package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.Lease;
import org.springframework.data.domain.Page;

public interface LeaseService {
    Long createLease(LeaseDto leaseDto);
    Long deleteLease(Long id);
    Long updateLease(LeaseDto leaseDto);
    Long getLeaseById(Long id);
    Page<Lease> getLeasesByUser(UserDto userDto);
}
