package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;
import com.saaasssska.leasing.entity.Payment;
import com.saaasssska.leasing.mapper.PaymentMapper;
import com.saaasssska.leasing.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private PaymentRepo paymentRepo;
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public Long createPayment(PaymentDto paymentDto) {
        return null;
    }

    @Override
    public Long deletePayment(Long id) {
        return null;
    }

    @Override
    public Long updatePayment(PaymentDto paymentDto) {
        return null;
    }

    @Override
    public Long getPaymentById(Long id) {
        return null;
    }

    @Override
    public List<PaymentDto> getPaymentsByLease(LeaseDto leaseDto) {
        return null;
    }
}
