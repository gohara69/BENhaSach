package com.example.NhaSach.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "receiptdetail")
@Data
public class ReceiptDetailEntity extends BaseEntity {
    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "receiptid")
    private ReceiptEntity receipt;

    @ManyToOne
    @JoinColumn(name = "sachid")
    private SachEntity sach;
}
