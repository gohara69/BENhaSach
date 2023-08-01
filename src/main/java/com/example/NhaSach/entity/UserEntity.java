package com.example.NhaSach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
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

    @Column(name = "email")
    public String email;

    @Column(name = "token")
    public String token;

    @Column(name = "tokenexpired")
    public Date tokenExpired;

    @OneToMany(mappedBy = "user")
    private List<ReceiptEntity> listReceipts;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
}
