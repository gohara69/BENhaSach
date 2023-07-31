package com.example.NhaSach.dto.ReceiptDetail;

import com.example.NhaSach.dto.BaseDTO;
import lombok.Data;

@Data
public class ReceiptDetailDTO extends BaseDTO {
    private int quantity;
    private Long itemId;
    private Long receiptId;
}
