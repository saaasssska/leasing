package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.Lease;
import com.saaasssska.leasing.mapper.LeaseMapper;
import com.saaasssska.leasing.repository.LeaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

public class LeaseServiceImpl implements LeaseService{
    @Autowired
    private LeaseRepo leaseRepo;
    @Autowired
    private LeaseMapper leaseMapper;
    @Override
    public Long createLease(LeaseDto leaseDto) {
        return null;
    }

    @Override
    public Long deleteLease(Long id) {
        return null;
    }

    @Override
    public Long updateLease(LeaseDto leaseDto) {
        return null;
    }

    @Override
    public Long getLeaseById(Long id) {
        return null;
    }

    @Override
    public Page<Lease> getLeasesByUser(UserDto userDto) {
        return null;
    }
}
