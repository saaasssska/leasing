package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Car;
import com.saaasssska.leasing.entity.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    Page<Payment> findAllByLease(Long id, Pageable pageable);
}
