package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.CompanyController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class CompanyController {
    public static final String PATH = "/api/companies";
    public static final String ID_PATH = "/{id}";

    @Autowired
    private CompanyService companyService;

    @GetMapping(ID_PATH)
    public CompanyDto getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    @GetMapping
    Page<CompanyDto> getCompanies(Pageable pageable) {
        return companyService.getAllCompanies(pageable);
    }

    @DeleteMapping(ID_PATH)
    public void delete(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }

    @PostMapping
    public Long create(@RequestBody CompanyDto companyDto) {
        return companyService.createCompany(companyDto);
    }

}
