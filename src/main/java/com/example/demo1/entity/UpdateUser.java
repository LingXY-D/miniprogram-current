package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateUser {
    private int id;
    private String username;
    private String password;
    private String newpassword;
}
