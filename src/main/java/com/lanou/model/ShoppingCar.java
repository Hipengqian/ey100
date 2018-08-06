package com.lanou.model;

import java.util.List;

public class ShoppingCar {
    private Integer sid;

    private String sProductid;

    private  String s_email;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    private List<Goods> goods;

    public ShoppingCar() {
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsProductid() {
        return sProductid;
    }

    public void setsProductid(String sProductid) {
        this.sProductid = sProductid == null ? null : sProductid.trim();
    }


}