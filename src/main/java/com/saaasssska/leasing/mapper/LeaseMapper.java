package com.saaasssska.leasing.mapper;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.entity.Lease;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeaseMapper {
    LeaseDto toLeaseDto(Lease lease);
    Lease toLease(LeaseDto leaseDto);
}
