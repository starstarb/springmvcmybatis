package com.web.model;

import java.io.Serializable;

/**
 * @Author Bai Xin
 * @Date 2020/1/10 23:45
 * @Version 1.0
 **/
public class User implements Serializable {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Integer id;
    private String name;
    private String password;
}
