package com.example.NhaSach.api;

import com.example.NhaSach.converter.ReceiptConverter;
import com.example.NhaSach.dto.Receipt.ReceiptForPostDTO;
import com.example.NhaSach.entity.ReceiptEntity;
import com.example.NhaSach.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class ReceiptAPI {
    @Autowired
    private ReceiptService receiptService;

    @Autowired
    private ReceiptConverter receiptConverter;

    @PostMapping("/receipts")
    public ReceiptForPostDTO createReceipt(@RequestBody ReceiptForPostDTO receipt){
        ReceiptEntity receiptEntity = receiptConverter.toReceiptEntity(receipt);
        receiptEntity = receiptService.create(receiptEntity);
        return receiptConverter.toReceiptForPostDTO(receiptEntity);
    }
}
