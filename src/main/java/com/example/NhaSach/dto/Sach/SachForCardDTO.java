package com.example.NhaSach.dto.Sach;

import com.example.NhaSach.dto.BaseDTO;
import com.example.NhaSach.dto.TacGiaDTO;
import lombok.Data;

@Data
public class SachForCardDTO extends BaseDTO {
    private String tenSach;
    private Double giaBan;
    private String tacGia;
    private String thumbnail;
    private Double giaBanDau;
}
