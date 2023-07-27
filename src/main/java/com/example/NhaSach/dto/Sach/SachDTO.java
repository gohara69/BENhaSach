package com.example.NhaSach.dto.Sach;

import com.example.NhaSach.dto.BaseDTO;
import com.example.NhaSach.dto.TacGiaDTO;
import com.example.NhaSach.dto.TheLoaiDTO;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SachDTO extends BaseDTO {
    private String tenSach;
    private Double giaBan;
    private TheLoaiDTO theLoai;
    private int soLuong;
    private Double giaBanDau;
    private String gioiThieu;
    private int soTrang;
    private String ngonNgu;
    private TacGiaDTO tacGia;
    private String thumbnail;
}
