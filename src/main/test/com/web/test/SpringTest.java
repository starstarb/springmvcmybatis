package com.web.test;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 17:18
 * @Version 1.0
 **/
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //获取运用上下文
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest=(SpringTest) applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();
    }
    public void sayHello(){
        System.out.println("hello bai");
    }
}
