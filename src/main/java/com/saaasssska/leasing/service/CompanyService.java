package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CompanyService {
    Long createCompany(CompanyDto companyDto);
    Long deleteCompany(Long id);
    Long updateCompany(CompanyDto companyDto);
    CompanyDto getCompanyById(Long id);
    Page<Company> getAllCompany(Pageable pageable);
}
