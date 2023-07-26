package com.example.NhaSach.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SachDTO extends BaseDTO{
    private String tenSach;
    private Double giaBan;
    private String tenTheLoai;
    private int soLuong;
}
