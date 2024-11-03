package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.saaasssska.leasing.controller.LeaseController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class LeaseController {
    public static final String PATH = "/api/leases";
    public static final String ID_PATH = "/{id}";
    public static final String UPDATE_PARAM = "format=update";

    @Autowired
    private LeaseService leaseService;

    @GetMapping(ID_PATH)
    public LeaseDto getLeaseById(@PathVariable Long id) {
        return leaseService.getLeaseById(id);
    }

    @PostMapping
    public Long create(@RequestBody LeaseDto leaseDto) {
        return leaseService.createLease(leaseDto);
    }

    @DeleteMapping(ID_PATH)
    public void delete(@PathVariable Long id) {
        leaseService.deleteLease(id);
    }

    @PostMapping(params = UPDATE_PARAM)
    public void updateLease(@RequestBody LeaseDto leaseDto) {
        leaseService.updateLease(leaseDto);
    }

    @GetMapping
    public List<LeaseDto> getLeasesByUser(@RequestParam Long userId) {
        return leaseService.getLeasesByUserId(userId);
    }
}
