package com.example.NhaSach.service;

import com.example.NhaSach.repository.TacGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacGiaService implements BaseService{
    @Autowired
    private TacGiaRepository tacGiaRepository;
    @Override
    public List showAll() {
        return tacGiaRepository.findAll();
    }

    @Override
    public Page findPaginated(int pageNumber, int pageSize) {
        return null;
    }
}
