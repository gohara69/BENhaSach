package com.example.NhaSach.converter;

import com.example.NhaSach.dto.SachDTO;
import com.example.NhaSach.dto.TheLoaiDTO;
import com.example.NhaSach.entity.SachEntity;
import com.example.NhaSach.entity.TheLoaiEntity;
import org.springframework.stereotype.Component;

@Component
public class TheLoaiConverter {
    public TheLoaiDTO toTheLoaiDTO(TheLoaiEntity theLoaiEntity){
        TheLoaiDTO theLoaiDTO = new TheLoaiDTO();
        theLoaiDTO.setId(theLoaiEntity.getId());
        theLoaiDTO.setTenTheLoai(theLoaiEntity.getTenTheLoai());
        return theLoaiDTO;
    }
}
