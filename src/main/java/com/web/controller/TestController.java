package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 22:18
 * @Version 1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
