package com.example.NhaSach.service;

import com.example.NhaSach.entity.TheLoaiEntity;
import com.example.NhaSach.repository.TheLoaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheLoaiService implements BaseService<TheLoaiEntity> {
    @Autowired
    private TheLoaiRepository theLoaiRepository;

    @Override
    public List<TheLoaiEntity> showAll() {
        return theLoaiRepository.findAll();
    }

    @Override
    public Page<TheLoaiEntity> findPaginated(String name, int pageNumber, int pageSize) {
        return null;
    }

    @Override
    public TheLoaiEntity create(TheLoaiEntity object) {
        return null;
    }

    @Override
    public TheLoaiEntity findById(Long id) {
        return null;
    }
}
