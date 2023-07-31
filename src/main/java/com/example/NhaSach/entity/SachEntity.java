package com.example.NhaSach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "sach")
public class SachEntity extends  BaseEntity{
    @Column(name = "tenSach")
    private String tenSach;

    @Column(name = "giaBan")
    private Double giaBan;

    @Column(name = "soLuong")
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "theLoaiId")
    private TheLoaiEntity theLoai;

    @Column(name = "giaBanDau")
    private Double giaBanDau;

    @Column(name = "gioiThieu")
    private String gioiThieu;

    @Column(name = "soTrang")
    private int soTrang;

    @Column(name = "ngonNgu")
    private String ngonNgu;

    @ManyToOne
    @JoinColumn(name = "tacgiaid")
    private TacGiaEntity tacGia;

    @Column(name = "thumbnail")
    private String thumbnail;

    @OneToMany(mappedBy = "sach")
    private List<ReceiptDetailEntity> listReceiptDetails;
}
