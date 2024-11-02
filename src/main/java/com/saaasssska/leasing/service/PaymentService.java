package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PaymentService {
    Long createPayment(PaymentDto paymentDto);
    Long deletePayment(Long id);
    Long updatePayment(PaymentDto paymentDto);
    PaymentDto getPaymentById(Long id);
    Page<PaymentDto> getPaymentsByLease(LeaseDto leaseDto, Pageable pageable);
}
