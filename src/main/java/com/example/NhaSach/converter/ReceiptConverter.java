package com.example.NhaSach.converter;

import com.example.NhaSach.dto.Receipt.ReceiptForPostDTO;
import com.example.NhaSach.entity.ReceiptEntity;
import com.example.NhaSach.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReceiptConverter {
    @Autowired
    private UserService userService;

    public ReceiptEntity toReceiptEntity(ReceiptForPostDTO receiptDTO){
        ReceiptEntity receipt = new ReceiptEntity();
        receipt.setAddress(receiptDTO.getAddress());
        receipt.setDistrict(receiptDTO.getDistrict());
        receipt.setFirstname(receiptDTO.getFirstname());
        receipt.setStatus(receiptDTO.isStatus());
        receipt.setWard(receiptDTO.getWard());
        receipt.setUser(userService.findById(receiptDTO.getUserid()));
        return receipt;
    }

    public ReceiptForPostDTO toReceiptForPostDTO(ReceiptEntity receiptEntity){
        ReceiptForPostDTO receipt = new ReceiptForPostDTO();
        receipt.setId(receiptEntity.getId());
        receipt.setAddress(receiptEntity.getAddress());
        receipt.setDistrict(receiptEntity.getDistrict());
        receipt.setFirstname(receiptEntity.getFirstname());
        receipt.setStatus(receiptEntity.isStatus());
        receipt.setWard(receiptEntity.getWard());
        receipt.setUserid(receiptEntity.getId());
        return receipt;
    }
}
