package com.web.test;

import javax.annotation.Resource;
import com.web.dao.UserDao;
import com.web.model.User;
import org.junit.Test;

import java.util.List;

/**
 * @Author Bai Xin
 * @Date 2020/1/11 0:41
 * @Version 1.0
 **/
public class UserDaoTest extends BaseJunit4Test {
    @Resource
    private UserDao UserDao;
    @Test
    public void testFindAll(){
        List<User> userList=UserDao.findAll();
        System.out.println(userList.size ());
    }

}
