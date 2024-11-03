package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.entity.Company;
import com.saaasssska.leasing.mapper.CompanyMapper;
import com.saaasssska.leasing.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Long createCompany(CompanyDto companyDto) {
        Company company = companyMapper.toCompany(companyDto);
        return companyRepo.save(company).getId();
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepo.deleteById(id);
    }

    @Override
    public CompanyDto getCompanyById(Long id) {
        return companyMapper.toCompanyDto(companyRepo.findById(id).orElseThrow());
    }

    @Override
    public Page<CompanyDto> getAllCompanies(Pageable pageable) {
        return companyRepo.findAll(pageable).map(companyMapper::toCompanyDto);
    }
}
