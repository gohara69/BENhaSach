package com.example.NhaSach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDate")
    private Date createdDate;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Column(name = "modifiedDate")
    private Date modifiedDate;
}
