package com.example.NhaSach.converter;

import com.example.NhaSach.dto.Sach.SachDTO;
import com.example.NhaSach.dto.Sach.SachForCardDTO;
import com.example.NhaSach.entity.SachEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class SachConverter {
    @Autowired
    private TheLoaiConverter theLoaiConverter;

    @Autowired
    private TacGiaConverter tacGiaConverter;

    public SachDTO toSachDTO(SachEntity sachEntity){
        SachDTO sachDTO = new SachDTO();
        sachDTO.setGiaBan(sachEntity.getGiaBan());
        sachDTO.setSoLuong(sachEntity.getSoLuong());
        sachDTO.setId(sachEntity.getId());
        sachDTO.setTenSach(sachEntity.getTenSach());
        sachDTO.setGiaBanDau(sachEntity.getGiaBanDau());
        sachDTO.setGioiThieu(sachEntity.getGioiThieu());
        sachDTO.setSoTrang(sachEntity.getSoTrang());
        sachDTO.setNgonNgu(sachEntity.getNgonNgu());
        sachDTO.setThumbnail(sachEntity.getThumbnail());
        sachDTO.setTheLoai(theLoaiConverter.toTheLoaiDTO(sachEntity.getTheLoai()));
        sachDTO.setTacGia(tacGiaConverter.toTacGiaDTO(sachEntity.getTacGia()));
        return sachDTO;
    }

    public SachForCardDTO toSachForCardDTO(SachEntity sachEntity){
        SachForCardDTO sachDTO = new SachForCardDTO();
        sachDTO.setGiaBan(sachEntity.getGiaBan());
        sachDTO.setId(sachEntity.getId());
        sachDTO.setTenSach(sachEntity.getTenSach());
        sachDTO.setGiaBanDau(sachEntity.getGiaBanDau());
        sachDTO.setThumbnail(sachEntity.getThumbnail());
        sachDTO.setTacGia(sachEntity.getTacGia().getTenTacGia());
        return sachDTO;
    }

    public Page<SachForCardDTO> toPageObjectDto(Page<SachEntity> objects) {
        Page<SachForCardDTO> dtos  = objects.map(this::toSachForCardDTO);
        return dtos;
    }
}
