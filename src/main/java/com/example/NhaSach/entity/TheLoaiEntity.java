package com.example.NhaSach.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "theLoai")
public class TheLoaiEntity extends BaseEntity{
    @Column(name = "tenTheLoai")
    private String tenTheLoai;

    @OneToMany(mappedBy = "theLoai")
    private Set<SachEntity> dsSach;

}
