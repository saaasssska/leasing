package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.Lease;
import com.saaasssska.leasing.entity.User;
import com.saaasssska.leasing.mapper.LeaseMapper;
import com.saaasssska.leasing.repository.CarRepo;
import com.saaasssska.leasing.repository.LeaseRepo;
import com.saaasssska.leasing.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class LeaseServiceImpl implements LeaseService{

    @Autowired
    private LeaseRepo leaseRepo;
    @Autowired
    private LeaseMapper leaseMapper;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public Long createLease(LeaseDto leaseDto) {
        Lease lease = leaseMapper.toLease(leaseDto);
        lease.setCar(carRepo.findById(leaseDto.getCar().getId()).orElseThrow());
        lease.setUser(userRepo.findById(leaseDto.getUser().getId()).orElseThrow());
        return leaseRepo.save(lease).getId();
    }

    @Override
    public void deleteLease(Long id) {
        leaseRepo.deleteById(id);
    }

    @Override
    public void updateLease(LeaseDto leaseDto) {
        Lease lease = leaseRepo.findById(leaseDto.getId()).orElseThrow();
        lease.setCar(carRepo.findById(leaseDto.getCar().getId()).orElseThrow());
        lease.setUser(userRepo.findById(leaseDto.getUser().getId()).orElseThrow());
        lease.setStartDate(leaseDto.getStartDate());
        lease.setEndDate(leaseDto.getEndDate());
        leaseRepo.save(lease);
    }

    @Override
    public LeaseDto getLeaseById(Long id) {
        return leaseMapper.toLeaseDto(leaseRepo.findById(id).orElseThrow());
    }

    @Override
    public Page<LeaseDto> getLeasesByUser(UserDto userDto, Pageable pageable) {
        User user = userRepo.findById(userDto.getId()).orElseThrow();
        return leaseRepo.findAllByUser(user, pageable).map(leaseMapper::toLeaseDto);
    }
}
