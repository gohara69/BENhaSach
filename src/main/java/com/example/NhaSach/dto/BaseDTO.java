package com.example.NhaSach.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseDTO {
    private Long id;
    private String createdBy;
    private Date createdDate;
    private String ModifiedBy;
    private Date ModifiedDate;
}
