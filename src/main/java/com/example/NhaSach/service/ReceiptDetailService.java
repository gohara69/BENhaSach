package com.example.NhaSach.service;

import com.example.NhaSach.entity.ReceiptDetailEntity;
import com.example.NhaSach.repository.ReceiptDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptDetailService implements BaseService<ReceiptDetailEntity> {
    @Autowired
    private ReceiptDetailRepository receiptDetailRepository;
    @Override
    public List<ReceiptDetailEntity> showAll() {
        return null;
    }

    @Override
    public Page<ReceiptDetailEntity> findPaginated(String name, int pageNumber, int pageSize) {
        return null;
    }

    @Override
    public ReceiptDetailEntity create(ReceiptDetailEntity object) {
        return receiptDetailRepository.save(object);
    }

    @Override
    public ReceiptDetailEntity findById(Long id) {
        return null;
    }
}
