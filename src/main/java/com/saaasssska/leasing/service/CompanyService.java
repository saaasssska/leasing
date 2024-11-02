package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {
    Long createCompany(CompanyDto companyDto);
    Long deleteCompany(Long id);
    CompanyDto getCompanyById(Long id);
    Page<CompanyDto> getAllCompany(Pageable pageable);
}
