package com.example.NhaSach.service;

import com.example.NhaSach.entity.UserEntity;
import com.example.NhaSach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements  BaseService<UserEntity> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> showAll() {
        return null;
    }

    @Override
    public Page<UserEntity> findPaginated(String name, int pageNumber, int pageSize) {
        return null;
    }

    @Override
    public UserEntity create(UserEntity object) {
        return userRepository.save(object);
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity findByEmailAndPassword(UserEntity object) {
        return userRepository.findByEmailAndPassword(object.getEmail(), object.getPassword());
    }
}
