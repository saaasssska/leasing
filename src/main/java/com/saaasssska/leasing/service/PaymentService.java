package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.PaymentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PaymentService {
    Long createPayment(PaymentDto paymentDto);
    void deletePayment(Long id);
    void updatePayment(PaymentDto paymentDto);
    PaymentDto getPaymentById(Long id);
    Page<PaymentDto> getPaymentsByLease(Long leaseId, Pageable pageable);
}
