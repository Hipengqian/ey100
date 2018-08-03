package com.lanou.model;

import org.aspectj.weaver.patterns.OrTypePattern;

import java.util.List;

public class User {
    private Integer uid;

    private String email;

    private String password;

    //保存订单集合
    private List<Orders> orders;

    //用户积分

    private Integer uscore;

    public Integer getUscore() {
        return uscore;
    }



    public void setUscore(Integer uscore) {
        this.uscore = uscore;
    }

    public User() {
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}