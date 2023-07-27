package com.example.NhaSach.service;

import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseService<T> {
    List<T> showAll();
    Page<T> findPaginated(int pageNumber, int pageSize);
}
