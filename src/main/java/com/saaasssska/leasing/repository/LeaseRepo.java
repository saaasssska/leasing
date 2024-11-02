package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Lease;
import com.saaasssska.leasing.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepo extends JpaRepository<Lease, Long> {
    Page<Lease> findAllByUser(User user, Pageable pageable);
}
