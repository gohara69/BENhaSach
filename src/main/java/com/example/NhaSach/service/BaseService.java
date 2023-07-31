package com.example.NhaSach.service;

import com.example.NhaSach.dto.Receipt.ReceiptForPostDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseService<T> {
    List<T> showAll();
    Page<T> findPaginated(String name,int pageNumber, int pageSize);
    T create(T object);
    T findById(Long id);
}
