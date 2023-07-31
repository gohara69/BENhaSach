package com.example.NhaSach.converter;

import com.example.NhaSach.dto.ReceiptDetail.ReceiptDetailDTO;
import com.example.NhaSach.entity.ReceiptDetailEntity;
import com.example.NhaSach.service.ReceiptService;
import com.example.NhaSach.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReceiptDetailConverter {
    @Autowired
    private SachService sachService;

    @Autowired
    private ReceiptService receiptService;
    public ReceiptDetailEntity toReceiptDetailEntity(ReceiptDetailDTO receiptDetailDTO){
        ReceiptDetailEntity receipt = new ReceiptDetailEntity();
        receipt.setQuantity(receiptDetailDTO.getQuantity());
        receipt.setSach(sachService.findById(receiptDetailDTO.getItemId()));
        receipt.setReceipt(receiptService.findById(receiptDetailDTO.getReceiptId()));
        return receipt;
    }

    public ReceiptDetailDTO toReceiptDetailDTO(ReceiptDetailEntity receiptDetailEntity){
        ReceiptDetailDTO receipt = new ReceiptDetailDTO();
        receipt.setId(receiptDetailEntity.getId());
        receipt.setQuantity(receiptDetailEntity.getQuantity());
        receipt.setItemId(receiptDetailEntity.getSach().getId());
        receipt.setReceiptId(receiptDetailEntity.getReceipt().getId());
        return receipt;
    }
}
