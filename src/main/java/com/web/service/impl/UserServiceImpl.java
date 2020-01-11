package com.web.service.impl;

import com.web.dao.UserDao;
import com.web.model.User;
import com.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 23:48
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao UserDao;
    public List<User> findAll(){
        return UserDao.findAll();
    }
}
