package com.example.NhaSach.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Table(name = "tacgia")
@Entity
public class TacGiaEntity extends BaseEntity{
    @Column(name = "tentacgia")
    private String tenTacGia;

    @Column(name = "tieusu")
    private String tieuSu;

    @OneToMany(mappedBy = "tacGia")
    private Set<SachEntity> listSach;
}
