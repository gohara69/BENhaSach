package com.example.NhaSach.dto;

import lombok.Data;

@Data
public class UserOnLoginDTO extends BaseDTO{
    private String username;
    private String password;
    private String role;
}
