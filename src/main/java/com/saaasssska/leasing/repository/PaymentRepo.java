package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Lease;
import com.saaasssska.leasing.entity.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    Page<Payment> findAllByLease(Lease lease, Pageable pageable);
}
