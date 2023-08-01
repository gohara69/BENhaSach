package com.example.NhaSach.api;

import com.example.NhaSach.converter.UserConverter;
import com.example.NhaSach.dto.UserOnLoginDTO;
import com.example.NhaSach.entity.UserEntity;
import com.example.NhaSach.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserAPI {
    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public UserOnLoginDTO createUser(@RequestBody UserOnLoginDTO user) throws NoSuchAlgorithmException {
        UserEntity userEntity = userConverter.toUserEntityWithEncript(user);
        userEntity = userService.create(userEntity);
        return userConverter.toUserOnLoginDTO(userEntity);
    }

    @GetMapping("/users")
    public UserOnLoginDTO getUser(
            @RequestParam String username,
            @RequestParam String password
    ) throws NoSuchAlgorithmException {
        UserOnLoginDTO userDTO = new UserOnLoginDTO();
        userDTO.setUsername(username);
        userDTO.setPassword(password);
        UserEntity userEntity = userConverter.toUserEntityWithEncript(userDTO);
        userEntity = userService.findByEmailAndPassword(userEntity);
        return userConverter.toUserOnLoginDTO(userEntity);
    }
}
