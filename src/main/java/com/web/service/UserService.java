package com.web.service;

import com.web.model.User;

import java.util.List;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 23:47
 * @Version 1.0
 **/
public interface UserService {
    List<User> findAll();
}
