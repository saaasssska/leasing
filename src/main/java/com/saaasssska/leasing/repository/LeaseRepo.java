package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Lease;
import org.springframework.data.repository.CrudRepository;

public interface LeaseRepo extends CrudRepository<Lease, Long> {
}
