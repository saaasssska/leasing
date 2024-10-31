package com.saaasssska.leasing.entity;

import com.saaasssska.leasing.dto.LeaseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "payment")
@FieldNameConstants
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "amount", nullable = false, length = 10)
    private Long amount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "lease_id", nullable = false)
    private LeaseDto lease;
}
