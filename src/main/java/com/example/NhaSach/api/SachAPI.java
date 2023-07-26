package com.example.NhaSach.api;

import com.example.NhaSach.converter.SachConverter;
import com.example.NhaSach.dto.SachDTO;
import com.example.NhaSach.entity.SachEntity;
import com.example.NhaSach.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class SachAPI {
    @Autowired
    SachService sachService;

    @Autowired
    SachConverter sachConverter;

    @GetMapping("/sachs")
    public List<SachDTO> showSachs(){
        List<SachDTO> listSachDTO = new ArrayList<>();
        List<SachEntity> listSachEntity = sachService.showAll();
        for (SachEntity sach : listSachEntity) {
            listSachDTO.add(sachConverter.toSachDTO(sach));
        }
        return listSachDTO;
    }
}
