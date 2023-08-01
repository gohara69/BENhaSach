package com.example.NhaSach.dto.Receipt;

import com.example.NhaSach.dto.BaseDTO;
import lombok.Data;

@Data
public class ReceiptStaticDTO extends BaseDTO {
    private String firstname;
    public String lastname;
    public String ward;
    public String district;
    public String address;
    public boolean status;
    private Long total;
}
