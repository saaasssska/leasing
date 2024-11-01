package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Company;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {
    Long createCompany(CompanyDto companyDto);
    Long deleteCompany(Long id);
    CompanyDto getCompanyById(Long id);
    List<Company> getAllCompany(Pageable pageable);
}
