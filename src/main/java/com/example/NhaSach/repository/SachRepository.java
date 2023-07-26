package com.example.NhaSach.repository;

import com.example.NhaSach.entity.SachEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepository extends JpaRepository<SachEntity, Long> {
}
