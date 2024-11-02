package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.entity.Lease;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepo extends JpaRepository<Lease, Long> {
    Page<Lease> findAllByUser(Long id, Pageable pageable);
}
