package com.example.NhaSach.api;

import com.example.NhaSach.converter.TheLoaiConverter;
import com.example.NhaSach.dto.TheLoaiDTO;
import com.example.NhaSach.entity.TheLoaiEntity;
import com.example.NhaSach.service.TheLoaiService;
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
public class TheLoaiAPI {
    @Autowired
    private TheLoaiService theLoaiService;

    @Autowired
    private TheLoaiConverter theLoaiConverter;
    @GetMapping("/theloais")
    public List<TheLoaiDTO> showAllTheLoai(){
        List<TheLoaiDTO> listTheLoai = new ArrayList<>();
        List<TheLoaiEntity> listTheLoaiEntity = theLoaiService.showAll();
        for (TheLoaiEntity theLoaiEntity:listTheLoaiEntity) {
            listTheLoai.add(theLoaiConverter.toTheLoaiDTO(theLoaiEntity));
        }
        return listTheLoai;
    }
}
