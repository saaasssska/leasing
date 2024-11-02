package com.saaasssska.leasing.mapper;

import com.saaasssska.leasing.dto.CompanyDto;
import com.saaasssska.leasing.dto.PaymentDto;
import com.saaasssska.leasing.entity.Company;
import com.saaasssska.leasing.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDto toPaymentDto(Payment payment);
    Payment toPayment(PaymentDto paymentDto);
}
