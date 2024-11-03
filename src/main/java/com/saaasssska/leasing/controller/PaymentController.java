package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.PaymentDto;
import com.saaasssska.leasing.repository.PaymentRepo;
import com.saaasssska.leasing.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.PaymentController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class PaymentController {
    public static final String PATH = "/api/payment";
    public static final String ID_PATH = "/{id}";
    public static final String UPDATE_PARAM = "format=update";

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentRepo paymentRepo;

    @GetMapping(ID_PATH)
    public PaymentDto getPaymentById(@RequestParam Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    Long create(@RequestBody PaymentDto paymentDto) {
        return paymentService.createPayment(paymentDto);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }

    @PostMapping(value = ID_PATH, params = UPDATE_PARAM)
    public void update(PaymentDto paymentDto) {
        paymentService.updatePayment(paymentDto);
    }

    @GetMapping
    public Page<PaymentDto> getPaymentsByLease(@RequestParam Long leaseId, LeaseDto leaseDto, Pageable pageable) {
        return paymentService.getPaymentsByLease(leaseDto, pageable);
    }
}
