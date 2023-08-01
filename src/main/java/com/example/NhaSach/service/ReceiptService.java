package com.example.NhaSach.service;

import com.example.NhaSach.dto.Receipt.ReceiptForPostDTO;
import com.example.NhaSach.dto.Receipt.ReceiptStaticDTO;
import com.example.NhaSach.entity.ReceiptEntity;
import com.example.NhaSach.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptService implements BaseService<ReceiptEntity> {
    @Autowired
    private ReceiptRepository receiptRepository;
    @Override
    public List<ReceiptEntity> showAll() {
        return null;
    }

    @Override
    public Page<ReceiptEntity> findPaginated(String name, int pageNumber, int pageSize) {
        return null;
    }

    public Page<ReceiptEntity> showAllPaginated(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return receiptRepository.findAll(pageable);
    }

    @Override
    public ReceiptEntity create(ReceiptEntity object) {
        return receiptRepository.save(object);
    }

    @Override
    public ReceiptEntity findById(Long id) {
        return receiptRepository.findById(id).orElse(null);
    }
}
