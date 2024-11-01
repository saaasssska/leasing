package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepo extends JpaRepository<Lease, Long> {
}
