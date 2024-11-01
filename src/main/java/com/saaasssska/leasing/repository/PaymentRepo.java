package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
}
