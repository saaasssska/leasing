package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.LeaseDto;
import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.repository.LeaseRepo;
import com.saaasssska.leasing.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.LeaseController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class LeaseController {
    public static final String PATH = "/api/lease";
    public static final String ID_PATH = "/{id}";
    public static final String UPDATE_PARAM = "format=update";

    @Autowired
    private LeaseService leaseService;
    @Autowired
    private LeaseRepo leaseRepo;

    @GetMapping(ID_PATH)
    public LeaseDto getLeaseById(@RequestParam Long id) {
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
    public Page<LeaseDto> getLeasesByUser(@RequestParam Long userId, UserDto userDto, Pageable pageable) {
        return leaseService.getLeasesByUser(userDto, pageable);
    }
}
