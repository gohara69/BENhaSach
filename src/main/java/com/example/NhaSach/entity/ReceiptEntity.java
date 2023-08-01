package com.example.NhaSach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "receipt")
public class ReceiptEntity extends BaseEntity{
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "ward")
    public String ward;

    @Column(name = "district")
    public String district;

    @Column(name = "address")
    public String address;

    @Column(name = "status")
    public boolean status;

    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;

    @OneToMany(mappedBy = "receipt")
    private List<ReceiptDetailEntity> listReceiptDetails;

    @Column(name = "total")
    private Double total;
}
