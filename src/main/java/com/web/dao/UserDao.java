package com.web.dao;

import com.web.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 23:46
 * @Version 1.0
 **/
@Repository
public interface UserDao {
    List<User> findAll();
}
