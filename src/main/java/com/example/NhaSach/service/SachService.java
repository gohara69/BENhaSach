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
    public Page<SachEntity> findPaginated(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        return sachRepository.findAll(pageable);
    }
}
