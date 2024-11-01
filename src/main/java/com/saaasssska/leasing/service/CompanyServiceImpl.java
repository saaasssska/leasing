package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Company;
import com.saaasssska.leasing.mapper.CompanyMapper;
import com.saaasssska.leasing.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Long createCompany(CompanyDto companyDto) {
        return null;
    }

    @Override
    public Long deleteCompany(Long id) {
        return null;
    }

    @Override
    public CompanyDto getCompanyById(Long id) {
        return null;
    }

    @Override
    public List<Company> getAllCompany(Pageable pageable) {
        return null;
    }
}
