package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CompanyService {
    Long createCompany(CompanyDto companyDto);
    void deleteCompany(Long id);
    CompanyDto getCompanyById(Long id);
    Page<CompanyDto> getAllCompanies(Pageable pageable);
}
