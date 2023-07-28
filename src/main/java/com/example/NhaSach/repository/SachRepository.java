package com.example.NhaSach.repository;

import com.example.NhaSach.entity.SachEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepository extends JpaRepository<SachEntity, Long> {
    Page<SachEntity> findByTenSachContains(String tenSach, Pageable pageable);
    Page<SachEntity> findByTheLoaiId(int theLoaiId, Pageable pageable);
}
