package com.example.demo1.service;

import com.example.demo1.entity.User;

public interface UserService {
    public User login(String username, String password);
    public User register(String username, String password) throws Exception;
    public User modifyPassword(int userId, String password, String newpassword);
    public User selectByOpenid(String openid);
    public User selectByUsername(String username);
    public boolean isAdmin(int userid);
}
