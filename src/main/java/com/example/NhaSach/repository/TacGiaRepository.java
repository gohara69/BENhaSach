package com.example.NhaSach.repository;

import com.example.NhaSach.entity.TacGiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacGiaRepository extends JpaRepository<TacGiaEntity, Long> {
}
