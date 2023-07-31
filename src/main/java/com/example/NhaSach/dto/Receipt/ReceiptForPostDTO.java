package com.example.NhaSach.dto.Receipt;

import com.example.NhaSach.dto.BaseDTO;
import com.example.NhaSach.entity.ReceiptDetailEntity;
import com.example.NhaSach.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ReceiptForPostDTO extends BaseDTO {
    private String firstname;
    public String lastname;
    public String ward;
    public String district;
    public String address;
    public boolean status;
    private Long userid;
}
