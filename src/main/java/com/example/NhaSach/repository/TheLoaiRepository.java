package com.example.NhaSach.repository;

import com.example.NhaSach.entity.TheLoaiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoaiEntity, Long> {
}
