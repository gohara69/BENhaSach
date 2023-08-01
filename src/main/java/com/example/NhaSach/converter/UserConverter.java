package com.example.NhaSach.converter;

import com.example.NhaSach.dto.UserOnLoginDTO;
import com.example.NhaSach.encript.encriptPassword;
import com.example.NhaSach.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;

@Component
public class UserConverter {
    public UserOnLoginDTO toUserOnLoginDTO(UserEntity userEntity){
        UserOnLoginDTO user = new UserOnLoginDTO();
        user.setUsername(userEntity.getEmail());
        user.setPassword(userEntity.getPassword());
        user.setId(userEntity.getId());
        user.setRole(userEntity.getRole());
        return user;
    }

    public UserEntity toUserEntityWithEncript(UserOnLoginDTO userDTO) throws NoSuchAlgorithmException {
        UserEntity user = new UserEntity();
        user.setEmail(userDTO.getUsername());
        user.setPassword(encriptPassword.toSHA(userDTO.getPassword()));
        user.setRole(userDTO.getRole());
        return user;
    }
}
