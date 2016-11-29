package com.alex.demo.domain;

/**
 * Created by yang_gao on 2016/11/16.
 */
public class User {
    String userName;
    String age;

    public User() {
    }

    public User(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
