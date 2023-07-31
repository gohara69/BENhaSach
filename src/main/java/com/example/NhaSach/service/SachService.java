package com.example.NhaSach.service;

import com.example.NhaSach.entity.SachEntity;
import com.example.NhaSach.repository.SachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachService implements BaseService<SachEntity> {
    @Autowired
    SachRepository sachRepository;

    @Override
    public List<SachEntity> showAll() {
        return sachRepository.findAll();
    }

    @Override
    public Page<SachEntity> findPaginated(String name, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return sachRepository.findByTenSachContains(name,pageable);
    }

    @Override
    public SachEntity create(SachEntity object) {
        return null;
    }

    @Override
    public SachEntity findById(Long id) {
        return sachRepository.findById(id).orElse(null);
    }

    public Page<SachEntity> findSachByTheLoaiId(int theLoaiId, int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber -1, pageSize);
        return sachRepository.findByTheLoaiId(theLoaiId, pageable);
    }
}
