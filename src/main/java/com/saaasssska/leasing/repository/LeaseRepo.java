package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.entity.Lease;
import com.saaasssska.leasing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaseRepo extends JpaRepository<Lease, Long> {
    List<Lease> findAllByUser(User user);
}
