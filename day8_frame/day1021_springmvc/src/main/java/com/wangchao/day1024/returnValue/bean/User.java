package com.wangchao.day1024.returnValue.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private  Integer age;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
