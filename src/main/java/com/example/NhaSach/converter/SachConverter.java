package com.example.NhaSach.converter;

import com.example.NhaSach.dto.SachDTO;
import com.example.NhaSach.entity.SachEntity;
import org.springframework.stereotype.Component;

@Component
public class SachConverter {
    public SachDTO toSachDTO(SachEntity sachEntity){
        SachDTO sachDTO = new SachDTO();
        sachDTO.setGiaBan(sachEntity.getGiaBan());
        sachDTO.setSoLuong(sachEntity.getSoLuong());
        sachDTO.setId(sachEntity.getId());
        sachDTO.setTenTheLoai(sachEntity.getTheLoai().getTenTheLoai());
        sachDTO.setTenSach(sachEntity.getTenSach());
        return sachDTO;
    }
}
