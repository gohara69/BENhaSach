package com.example.NhaSach.converter;

import com.example.NhaSach.dto.TacGiaDTO;
import com.example.NhaSach.entity.TacGiaEntity;
import org.springframework.stereotype.Component;

@Component
public class TacGiaConverter {
    public TacGiaDTO toTacGiaDTO(TacGiaEntity tacGiaEntity){
        TacGiaDTO tacGiaDTO = new TacGiaDTO();
        tacGiaDTO.setId(tacGiaEntity.getId());
        tacGiaDTO.setTenTacGia(tacGiaEntity.getTenTacGia());
        tacGiaDTO.setTieuSu(tacGiaEntity.getTieuSu());
        return tacGiaDTO;
    }
}
