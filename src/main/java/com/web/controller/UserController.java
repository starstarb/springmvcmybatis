package com.web.controller;

import com.web.model.User;
import com.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 23:50
 * @Version 1.0
 **/
@Controller
@RequestMapping(value="/user")
public class UserController {
    @Resource
    private UserService UserService;
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<User> UserList=UserService.findAll();
        for(User user:UserList){
            System.out.println("id: "+user.getId());
            System.out.println("name: "+user.getName());
        }
        return "hello";
    }
}
