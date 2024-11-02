package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;
import com.saaasssska.leasing.entity.Payment;
import com.saaasssska.leasing.mapper.PaymentMapper;
import com.saaasssska.leasing.repository.LeaseRepo;
import com.saaasssska.leasing.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private PaymentRepo paymentRepo;
    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private LeaseRepo leaseRepo;
    @Override
    public Long createPayment(PaymentDto paymentDto) {
        Payment payment = paymentMapper.toPayment(paymentDto);
        payment.setLease(leaseRepo.findById(paymentDto.getLease().getId()).orElseThrow());
        return paymentRepo.save(payment).getId();
    }

    @Override
    public Long deletePayment(Long id) {
        paymentRepo.deleteById(id);
        return id;
    }

    @Override
    public Long updatePayment(PaymentDto paymentDto) {
        Payment payment = paymentRepo.findById(paymentDto.getId()).orElseThrow();
        payment.setLease(leaseRepo.findById(paymentDto.getLease().getId()).orElseThrow());
        payment.setDate(paymentDto.getDate());
        payment.setAmount(paymentDto.getAmount());
        return paymentRepo.save(payment).getId();
    }

    @Override
    public PaymentDto getPaymentById(Long id) {
        return paymentMapper.toPaymentDto(paymentRepo.findById(id).orElseThrow());
    }

    @Override
    public Page<PaymentDto> getPaymentsByLease(LeaseDto leaseDto, Pageable pageable) {
        return paymentRepo.findAllByLease(leaseDto.getId(), pageable).map(paymentMapper::toPaymentDto);
    }
}
