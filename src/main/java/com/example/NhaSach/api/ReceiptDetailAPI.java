package com.example.NhaSach.api;

import com.example.NhaSach.converter.ReceiptDetailConverter;
import com.example.NhaSach.dto.ReceiptDetail.ReceiptDetailDTO;
import com.example.NhaSach.entity.ReceiptDetailEntity;
import com.example.NhaSach.service.ReceiptDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class ReceiptDetailAPI {
    @Autowired
    private ReceiptDetailConverter receiptDetailConverter;

    @Autowired
    private ReceiptDetailService receiptDetailService;
    @PostMapping("/receiptdetails")
    public ReceiptDetailDTO createReceiptDetails(@RequestBody ReceiptDetailDTO receiptDetail){
        ReceiptDetailEntity receiptDetailEntity = receiptDetailConverter.toReceiptDetailEntity(receiptDetail);
        receiptDetailEntity = receiptDetailService.create(receiptDetailEntity);
        return receiptDetailConverter.toReceiptDetailDTO((receiptDetailEntity));
    }
}
