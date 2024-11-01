package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;

import java.util.List;

public interface PaymentService {
    Long createPayment(PaymentDto paymentDto);
    Long deletePayment(Long id);
    Long updatePayment(PaymentDto paymentDto);
    Long getPaymentById(Long id);
    List<PaymentDto> getPaymentsByLease(LeaseDto leaseDto);
}
