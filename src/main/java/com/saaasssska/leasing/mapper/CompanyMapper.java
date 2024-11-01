package com.saaasssska.leasing.mapper;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyDto toCompanyDto(Company company);
    Company toCompany(CompanyDto companyDto);
}
