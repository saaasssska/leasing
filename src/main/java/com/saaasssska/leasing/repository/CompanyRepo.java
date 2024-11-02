package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends JpaRepository<Company, Long> {
}
