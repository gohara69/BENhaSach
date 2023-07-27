package com.example.NhaSach.api;

import com.example.NhaSach.converter.SachConverter;
import com.example.NhaSach.dto.Sach.SachDTO;
import com.example.NhaSach.dto.Sach.SachForCardDTO;
import com.example.NhaSach.entity.SachEntity;
import com.example.NhaSach.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class SachAPI {
    @Autowired
    SachService sachService;

    @Autowired
    SachConverter sachConverter;

    @GetMapping("/books")
    public Page<SachForCardDTO> showSachs(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> limit
            ){
        Page<SachEntity> pageSachEntity = sachService.findPaginated(page.orElse(1), limit.orElse(3));
        Page<SachForCardDTO> pageSachDTO = sachConverter.toPageObjectDto(pageSachEntity);
        return pageSachDTO;
    }

    @GetMapping("/booksforcard")
    public List<SachForCardDTO> showSachForCards(){
        List<SachForCardDTO> listSachDTO = new ArrayList<>();
        List<SachEntity> listSachEntity = sachService.showAll();
        for (SachEntity sach : listSachEntity) {
            listSachDTO.add(sachConverter.toSachForCardDTO(sach));
        }
        return listSachDTO;
    }


}
