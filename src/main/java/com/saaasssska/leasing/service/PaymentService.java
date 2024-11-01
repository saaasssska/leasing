package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;
import com.saaasssska.leasing.entity.Payment;
import org.springframework.data.domain.Page;

public interface PaymentService {
    Long createPayment(PaymentDto paymentDto);
    Long deletePayment(Long id);
    Long updatePayment(PaymentDto paymentDto);
    Long getPaymentById(Long id);
    Page<Payment> getPaymentsByLease(LeaseDto leaseDto);
}
